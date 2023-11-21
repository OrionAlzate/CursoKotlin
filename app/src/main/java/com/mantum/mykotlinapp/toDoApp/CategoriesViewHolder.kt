package com.mantum.mykotlinapp.toDoApp

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.mantum.mykotlinapp.R

class CategoriesViewHolder(view: View): RecyclerView.ViewHolder(view) {


    //traemos los elementos de R.layout.item_task_category
    private val tvCategoryName : TextView = view.findViewById(R.id.tvCategoryName)
    private val divider : View = view.findViewById(R.id.divider)
    private val cardViewContainer : CardView = view.findViewById(R.id.cardViewContainer)

    fun render(taskCategory: TaskCategory, onItemSelected: (Int) -> Unit) {

        val color = if (taskCategory.isSelected){
            R.color.todo_background_card
        } else {
            R.color.todo_background_disabled
        }

        cardViewContainer.setCardBackgroundColor(ContextCompat.getColor(cardViewContainer.context, color))

        itemView.setOnClickListener { onItemSelected(layoutPosition) }

        when(taskCategory){
            TaskCategory.Business -> {
                tvCategoryName.text = "Negocios"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_business_category)
                )
            }
            TaskCategory.Other -> {
                tvCategoryName.text = "Otros"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_other_category)
                )
            }
            TaskCategory.Personal -> {
                tvCategoryName.text = "Personal"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_personal_category)
                )
            }
        }

    }

}