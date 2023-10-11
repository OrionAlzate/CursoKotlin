package com.mantum.mykotlinapp.imcApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.mantum.mykotlinapp.R
import com.mantum.mykotlinapp.imcApp.ImcAppActivity.Companion.IMC_KEY

class ResultImcActivity : AppCompatActivity() {

    lateinit var tvResult :TextView
    lateinit var tvImcResult : TextView
    lateinit var tvDescripcion : TextView
    lateinit var btn_recalcular : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)

        val result: Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0

        initComponent()
        initUI(result)
        initListeners()
    }

    private fun initListeners() {
        btn_recalcular.setOnClickListener {
            onBackPressed()
        }
    }

    private fun initUI(result: Double) {
        tvImcResult.text = result.toString()
        when(result){
            in 0.00..18.50 ->{ // Bajo peso
                tvResult.setTextColor(getColor(R.color.peso_bajo))
                tvResult.text = getString(R.string.tittle_bajo_pes)
                tvDescripcion.text = getString(R.string.desc_bajo_pes)
            }
            in 18.50..24.99 ->{ // Peso normal
                tvResult.setTextColor(getColor(R.color.peso_normal))
                tvResult.text  = getString(R.string.tittle_pes_normal)
                tvDescripcion.text = getString(R.string.desc_pes_normal)
            }
            in 25.00..29.99 ->{ // Sobrepeso
                tvResult.setTextColor(getColor(R.color.peso_sobrepeso))
                tvResult.text = getString(R.string.tittle_sobrepeso)
                tvDescripcion.text = getString(R.string.desc_sobrepeso)
            }
            in 30.00..99.00 ->{ // Obesidad
                tvResult.setTextColor(getColor(R.color.peso_obesidad))
                tvResult.text = getString(R.string.tittle_obesidad)
                tvDescripcion.text = getString(R.string.desc_obesidad)
            }
            else -> { // Error
                val error = getString(R.string.Error)
                tvResult.text = error
                tvImcResult.text= error
                tvDescripcion.text = error
            }
        }


    }

    private fun initComponent() {

        tvResult = findViewById(R.id.tvResult)
        tvImcResult = findViewById(R.id.tvImcResult)
        tvDescripcion = findViewById(R.id.tvDescripcion)
        btn_recalcular = findViewById(R.id.btn_recalcular)


    }
}