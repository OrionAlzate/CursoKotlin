package com.mantum.mykotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.mantum.mykotlinapp.firstApp.FirstApp
import com.mantum.mykotlinapp.imcApp.ImcAppActivity
import com.mantum.mykotlinapp.superHeroApp.SuperHeroListActivity
import com.mantum.mykotlinapp.toDoApp.TodoAppActivity

class  MenuActivity : AppCompatActivity() {
    lateinit var btn_todoApp : AppCompatButton
    lateinit var btn_saludApp : AppCompatButton
    lateinit var btn_imcApp : AppCompatButton
    lateinit var btn_shlApp : AppCompatButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        initComponents()
        initListeners()
    }

    private fun initListeners() {
        btn_imcApp.setOnClickListener {
            goToImcApp()
        }
        btn_saludApp.setOnClickListener {
            goToSaludApp()
        }
        btn_todoApp.setOnClickListener {
            goToToDoApp()
        }
        btn_shlApp.setOnClickListener {
            goToShlApp()
        }
    }

    private fun goToShlApp() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

    private fun initComponents() {
        btn_saludApp = findViewById(R.id.btn_salu)
        btn_imcApp = findViewById(R.id.btn_imcApp)
        btn_todoApp = findViewById(R.id.btn_todoApp)
        btn_shlApp = findViewById(R.id.btn_shlApp)
    }

    private fun goToSaludApp(){
        val intent = Intent(this, FirstApp::class.java)
        startActivity(intent)
    }

    private fun goToImcApp(){
        val intent = Intent(this, ImcAppActivity::class.java)
        startActivity(intent)
    }

    private fun goToToDoApp() {
        val intent = Intent(this, TodoAppActivity::class.java)
        startActivity(intent)
    }
}


// esto es un comentario desde la rama otraRAma