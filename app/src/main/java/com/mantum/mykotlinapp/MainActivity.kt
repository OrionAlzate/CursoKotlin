package com.mantum.mykotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /***
         * @author Orion Alzate
         * Variables y Valores
         * val = valor o constantes
         * var = variable
        */

        /***
         * Tipo de datos numéricos
         */

        // Integer
        var num : Int = 30
        num = 15

        // Long
        val numLargo : Long = 300000000000000

        //float
        var numFloat : Float = 30.5f // debe llevar la f después de un número

        //Double
        val numDouble : Double = 33.3

        /***
         * Tipo de datos alfa-numéricos
         */

        // Char
        var letra : Char = 'i'
        letra = 'a'

        // String
        var name: String = "Hello world!"

        // Boolean
        var verdaderoOfalso : Boolean = true
        verdaderoOfalso = false

        println("Mensaje por consolaaaaa")


        /**
         * Manejo de Valores y Variables


         * Operaciones aritméticas
         */
        var num1 : Int = 15
        var num2 : Int = 18

        // Sumar
        var resultSuma = num1 + num2
        // Restar
        var resultResta = num1 - num2
        // Multi
        var resultMulti = num1 * num2
        // Div
        var resultDiv = num1 / num2
        // Num MOD
        var resultMod = num1 % num2


         /***
          * se pueden sumar diferentes tipos de datos pero va a convertir a alguno de ellos
          * */
        var numCombonado = num1 + numFloat




    }



}