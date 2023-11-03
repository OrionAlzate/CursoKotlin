package com.mantum.mykotlinapp.toDoApp

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.mantum.mykotlinapp.R
import com.mantum.mykotlinapp.toDoApp.TaskCategory.*

class TasksViewHolder(view: View): RecyclerView.ViewHolder(view)  {

    private val cb_task : CheckBox = view.findViewById(R.id.cb_task)
    private val tv_task : TextView = view.findViewById(R.id.tv_task)


    fun render(task: Task){

        if(task.isSelected){
            tv_task.paintFlags = tv_task.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        } else {
            tv_task.paintFlags = tv_task.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()

        }

        tv_task.text = task.name
        cb_task.isChecked = task.isSelected

        val color = when(task.category){
            Business -> R.color.todo_business_category
            Other -> R.color.todo_other_category
            Personal -> R.color.todo_personal_category
        }

        cb_task.buttonTintList = ColorStateList.valueOf(
            ContextCompat.getColor(cb_task.context,color)
        )




    }
}