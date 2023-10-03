package com.mantum.mykotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mantum.mykotlinapp.firstApp.FirstApp
import com.mantum.mykotlinapp.imcApp.ImcAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btn_saludApp = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btn_salu)
        var btn_imcApp = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btn_imcApp)

        btn_imcApp.setOnClickListener {
            goToImcApp()
        }
        btn_saludApp.setOnClickListener {
            goToSaludApp()
        }
    }

    private fun goToSaludApp(){
        val intent = Intent(this, FirstApp::class.java)
        startActivity(intent)
    }

    private fun goToImcApp(){
        val intent = Intent(this, ImcAppActivity::class.java)
        startActivity(intent)
    }

}