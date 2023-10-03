package com.mantum.mykotlinapp.firstApp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.mantum.mykotlinapp.MenuActivity
import com.mantum.mykotlinapp.R

class FirstApp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)


        val btn_press = findViewById<AppCompatButton>(R.id.btn_press)
        val et1 = findViewById<AppCompatEditText>(R.id.et1)
        val tv1 = findViewById<TextView>(R.id.tv1)
        val btn_volver = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btn_saludAppBkMenu)

        btn_volver.setOnClickListener {
            var intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }





        btn_press.setOnClickListener {

            val name = et1.text.toString()

            if(name.isNotEmpty()){
                /*Toast.makeText(this, "Hola, $name", Toast.LENGTH_SHORT).show()
                hideKeyboard()
                Log.i("btn_press", "Botón presionado, texto: ${et1.text.toString()}!") // muestra por el logcast la información
                tv1.setText("Bienvenido, ${name}")*/

                val intent = Intent(this, Resultado::class.java)
                intent.putExtra("nameSend", name)
                startActivity(intent)

            } else {
                Toast.makeText(this, "Debe ingresar un nombre para poder continuar", Toast.LENGTH_SHORT).show()
            }

        }



    }

    fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
    }

}