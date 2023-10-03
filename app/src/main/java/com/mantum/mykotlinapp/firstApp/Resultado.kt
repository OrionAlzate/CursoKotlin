package com.mantum.mykotlinapp.firstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.mantum.mykotlinapp.R

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)


        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btn_bk = findViewById<Button>(R.id.btn_bk)


        var name:String  = intent.extras?.getString("nameSend").orEmpty()

        tvResult.setText("Bienvenido, ${name}")

        btn_bk.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FirstApp::class.java)
            startActivity(intent)

        })





    }
}