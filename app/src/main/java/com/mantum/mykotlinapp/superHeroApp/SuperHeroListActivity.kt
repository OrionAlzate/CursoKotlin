package com.mantum.mykotlinapp.superHeroApp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mantum.mykotlinapp.databinding.ActivitySuperHeroListBinding // ... ya que se accede por medio del binding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class SuperHeroListActivity : AppCompatActivity() {

    // ViewBinding para hacer llamados a las vistas mucho más sencillo
    private lateinit var binding: ActivitySuperHeroListBinding // el activity___Binding se crea automaticamente, solo se hereda de él
    private lateinit var retrofitService : Retrofit
    private lateinit var adapter: SuperHerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuperHeroListBinding.inflate(layoutInflater) // se infla(crea) la vista con el viewBinding
        setContentView(binding.root) // se asigna la vista al setContentView

//        binding.searchViewShl // search view
        binding.rvShl // recycler view

        // retrofit
        retrofitService = getRetrofit()

        initUi()
    }

    private fun initUi() {
        binding.searchViewShl.setOnQueryTextListener(object : SearchView.OnQueryTextListener
        {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchByName(query.orEmpty())
                return false
            }

            override fun onQueryTextChange(newText: String?) = false

        })

        adapter = SuperHerAdapter()
        binding.rvShl.setHasFixedSize(true)
//        binding.rvShl.layoutManager = LinearLayoutManager(this)
        binding.rvShl.layoutManager = GridLayoutManager(this,2)
        binding.rvShl.adapter = adapter

    }

    private fun searchByName(query: String) {

        binding.progressBar.isVisible = true
        // Coroutinas
        CoroutineScope(Dispatchers.IO).launch {
            val myResponse = retrofitService.create(IApiService::class.java).getSuperHero(query)

            if (myResponse.isSuccessful){
                Log.i("respuesta", "Funciona :)")
                val response = myResponse.body()
                if (response != null){
                    Log.i("respuesta", "Respuesta: \n${response.toString()}")
                    // puedo crear un recyclerView con el listado de superHeroes
                    runOnUiThread {
                        binding.progressBar.isVisible = false
                        adapter.updateList(response.superheroes)
                    }
                }

            } else{
                Log.i("response", "No funciona :(")

            }
        }
    }

    private fun getRetrofit() : Retrofit {
        return Retrofit
            .Builder()
            .baseUrl("https://superheroapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}