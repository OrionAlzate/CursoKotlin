package com.mantum.mykotlinapp.toDoApp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mantum.mykotlinapp.R

class CategoriesAdapter(private val categories : List<TaskCategory>):

    RecyclerView.Adapter<CategoriesViewHolder>() {

    // Formas de declarar las funciones
    // Forma normal
    override fun getItemCount(): Int {
        return categories.size
    }
    // forma contraida con función que retorne
    // override fun getItemCount() = categories.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        //adapta el formato de vista que hayamos creado, en este caso (item_task_category)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)
        return CategoriesViewHolder(view)

    }
    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position])

    }


}