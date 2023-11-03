package com.mantum.mykotlinapp.toDoApp

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.mantum.mykotlinapp.R
import com.mantum.mykotlinapp.toDoApp.TaskCategory.Business
import com.mantum.mykotlinapp.toDoApp.TaskCategory.Other
import com.mantum.mykotlinapp.toDoApp.TaskCategory.Personal
import java.lang.Exception


class TodoAppActivity : AppCompatActivity() {

    private val categories = listOf(
        Business,
        Personal,
        Other,
        Other
    )

    private val tasks = mutableListOf(
        Task("Prueba Business", Business),
        Task("Prueba Personal", Personal),
        Task("Prueba Other", Other)
    )

    private lateinit var rvCategories : RecyclerView
    private lateinit var rvTasks : RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var tasksAdapter: TasksAdapter
    private lateinit var fab_addTask : FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo_app)

        initComponent()
        initUI()
        initListeners()
    }

    private fun initListeners() {
        fab_addTask.setOnClickListener { showDialog() }
    }

    private fun showDialog(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_task)

        val btn_createTask : Button = dialog.findViewById(R.id.btn_createTask)
        val et_task : EditText = dialog.findViewById(R.id.et_task)
        val rg_categoriesTask : RadioGroup = dialog.findViewById(R.id.rg_categoriesTask)

        btn_createTask.setOnClickListener {

            var currentTask:String = et_task.text.toString()
            if (currentTask.isNotEmpty()){

                val selectedId = rg_categoriesTask.checkedRadioButtonId
                if (selectedId >= 0){
                    val selectedRadioButton : RadioButton = rg_categoriesTask.findViewById(selectedId)
                    val currentCategory : TaskCategory = when(selectedRadioButton.text){
                        getString(R.string.todo_dialog_taskCategory_personal) -> Personal
                        getString(R.string.todo_dialog_taskCategory_business) -> Business
                        else -> Other
                    }

                    val tareaIngresada : Task = Task(currentTask,currentCategory)

                    tasks.add(tareaIngresada)
                    updateTask()
                    try{
                        hideKeyboardInDialog(dialog)
                    } catch (e : Exception){

                    }
                    dialog.hide()


                } else {
                    Toast.makeText(this,"Debe seleccionar una categoría", Toast.LENGTH_SHORT).show()
                    try{
                        hideKeyboardInDialog(dialog)
                    } catch (e : Exception){

                    }
                }


            } else {
                Toast.makeText(this, "Debe ingresar el nombre de la tarea", Toast.LENGTH_SHORT).show()
                try{
                    hideKeyboardInDialog(dialog)
                } catch (e : Exception){

                }
            }

        }
        dialog.show()
    }

    private fun updateTask(){
        tasksAdapter.notifyDataSetChanged()
    }

    private fun onItemSelected(position : Int){
        tasks[position].isSelected = !tasks[position].isSelected
        updateTask()
    }

    private fun initComponent() {

        rvCategories = findViewById(R.id.rvCategories)
        rvTasks= findViewById(R.id.rvTasks)
        fab_addTask = findViewById(R.id.fab_addTask)


    }
    private fun initUI() {

        categoriesAdapter = CategoriesAdapter(categories)
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        tasksAdapter = TasksAdapter(tasks) {position -> onItemSelected(position) }
        rvTasks.layoutManager = LinearLayoutManager(this)
        rvTasks.adapter = tasksAdapter

    }


    fun hideKeyboardInDialog(dialog: Dialog) {
        val context = dialog.context
        val currentFocus = dialog.currentFocus

        if (currentFocus != null) {
            val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(currentFocus.windowToken, 0)
        }
    }


}
