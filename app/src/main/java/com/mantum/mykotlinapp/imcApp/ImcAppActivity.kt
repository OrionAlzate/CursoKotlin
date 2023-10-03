package com.mantum.mykotlinapp.imcApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.mantum.mykotlinapp.MenuActivity
import com.mantum.mykotlinapp.R

class ImcAppActivity : AppCompatActivity() {

    private var isMaleSelected : Boolean = true
    private var isFemaleSelected : Boolean = false

    private  lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_app)

            val btn_imcBkMenu = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btn_imcBkMenu)
            btn_imcBkMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)

        }


            initComponents()
            initListeners()
            initUI()
    }

    private fun initComponents(){
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
    }
    private fun initListeners() {
        viewMale.setOnClickListener {
//            Toast.makeText(this, "male selected", Toast.LENGTH_SHORT).show()
            changeGender()
            setGenderColor() }
        viewFemale.setOnClickListener {
//            Toast.makeText(this, "female selected", Toast.LENGTH_SHORT).show()
            changeGender()
            setGenderColor()
        }
    }

    private fun changeGender(){
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun setGenderColor(){
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent:Boolean):Int{

        var colorReference = if(isSelectedComponent){
            R.color.backgroundComponent_selected
        } else {
            R.color.backgroundComponent
        }

        return ContextCompat.getColor(this, colorReference)
    }

    private fun initUI(){
        setGenderColor()
    }




}