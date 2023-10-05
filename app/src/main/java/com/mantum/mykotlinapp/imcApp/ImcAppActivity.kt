package com.mantum.mykotlinapp.imcApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.mantum.mykotlinapp.MenuActivity
import com.mantum.mykotlinapp.R
import java.text.DecimalFormat

class ImcAppActivity : AppCompatActivity() {

    private var isMaleSelected : Boolean = true
    private var isFemaleSelected : Boolean = false
    private var pesoInicial = 60
    private var edadInicial = 22
    private  lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView
    private lateinit var tv_laAltura : TextView
    private lateinit var rsAltura : RangeSlider
    private lateinit var tvPeso : TextView
    private lateinit var tvEdad : TextView
    private lateinit var btnMenosPeso : FloatingActionButton
    private lateinit var btnMasPeso : FloatingActionButton
    private lateinit var btnMenosEdad : FloatingActionButton
    private lateinit var btnMasEdad : FloatingActionButton
    private lateinit var btn_calcular : AppCompatButton

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
        tv_laAltura = findViewById(R.id.laAltura)
        rsAltura = findViewById(R.id.rsAltura)
        btnMenosPeso = findViewById(R.id.btnMenosPeso)
        btnMasPeso = findViewById(R.id.btnMasPeso)
        tvPeso = findViewById(R.id.tvPeso)
        tvEdad = findViewById(R.id.tvEdad)
        btnMenosEdad = findViewById(R.id.btnMenosEdad)
        btnMasEdad = findViewById(R.id.btnMasEdad)
        btn_calcular = findViewById(R.id.btn_calcular)

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
        rsAltura.addOnChangeListener { _, value, _ ->
            val decimalFormat = DecimalFormat("#.##")
            val result = decimalFormat.format(value)
            tv_laAltura.text = "$result cm"
        }
        btnMenosPeso.setOnClickListener{
            pesoInicial--
            actualizarPeso()
        }
        btnMasPeso.setOnClickListener{
            pesoInicial++
            actualizarPeso()
        }
        btnMenosEdad.setOnClickListener{
            edadInicial--
            actualizarEdad()
        }
        btnMasEdad.setOnClickListener {
            edadInicial++
            actualizarEdad()
        }
        btn_calcular.setOnClickListener {

            calcularIMC()

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
        actualizarPeso()
        actualizarEdad()
    }

    private fun actualizarPeso(){
        tvPeso.setText("$pesoInicial kg")
    }

    private fun actualizarEdad(){
        tvEdad.setText("$edadInicial años")
    }

    private fun calcularIMC() {


    }

}