package com.mantum.mykotlinapp.imcApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
    private var alturaActual = 160

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

    companion object {
        const val IMC_KEY = "imc_result"
    }

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
            alturaActual = decimalFormat.format(value).toInt()
            tv_laAltura.text = "$alturaActual cm"
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

            val result : Double = calcularIMC()
            navigateToResult(result)


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

    private fun calcularIMC() : Double{
        val decimalFormat = DecimalFormat("#.##")

        val alturaMts : Double =  alturaActual / 100.00
        val imc : Double = pesoInicial / (alturaMts * alturaMts)
        //var result = decimalFormat.format(imc).toDouble()
         //Log.i("valor_imc", "El imc es $result")
        return imc
    }

    private fun navigateToResult(result: Double) {
        val intent = Intent(this, ResultImcActivity::class.java)
        intent.putExtra(IMC_KEY, result)
        startActivity(intent)

    }

}