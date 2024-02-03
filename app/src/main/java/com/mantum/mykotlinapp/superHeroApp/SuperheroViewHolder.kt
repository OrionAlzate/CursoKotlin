package com.mantum.mykotlinapp.superHeroApp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mantum.mykotlinapp.databinding.ItemSuperheroBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SuperheroViewHolder(view:View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(superHeroItemResponse: SuperHeroItemResponse){

        binding.tvSuperherName.text = superHeroItemResponse.name
        val superHeroIdText = "Id: "
        binding.tvSuperherId.text = superHeroIdText + superHeroItemResponse.superheroId

        if (superHeroItemResponse.image != null && !superHeroItemResponse.image.equals("")){
            Glide.with(binding.root.context)
                .load(superHeroItemResponse.image.url)
                .into(binding.ivSuperheroImage)
        }



//        CoroutineScope(Dispatchers.Main).launch {
//            if (superHeroItemResponse.image != null && !superHeroItemResponse.image.equals("")){
//                Glide.with(binding.root.context)
//                    .load(superHeroItemResponse.image.url)
//                    .into(binding.ivSuperheroImage)
//            }
//        }





    }

}