package com.mantum.mykotlinapp.toDoApp

data class Task(val name: String, val category: TaskCategory, var isSelected : Boolean = false)
