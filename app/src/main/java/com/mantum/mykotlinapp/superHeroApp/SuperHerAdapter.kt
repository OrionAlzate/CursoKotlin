package com.mantum.mykotlinapp.superHeroApp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mantum.mykotlinapp.R

class SuperHerAdapter(var superheroList:List<SuperHeroItemResponse> = emptyList()) :RecyclerView.Adapter<SuperheroViewHolder>(){


    fun updateList( superheroList:List<SuperHeroItemResponse>){
        this.superheroList = superheroList
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_superhero, parent,false))
    }

    override fun onBindViewHolder(viewholder: SuperheroViewHolder, position: Int) {
        viewholder.bind(superheroList[position])
    }

    override fun getItemCount() = superheroList.size

}