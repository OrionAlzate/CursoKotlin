package com.mantum.mykotlinapp.basicos

fun main(){



    /**
     * Arrays
     */

    var weekDays = arrayOf("Lunes", "Martes", "Miercoles","Jueves", "Viernes")
//    println(weekDays.size) // su tamaño es fijo
//    println(weekDays[(weekDays.size -1)])
    println(weekDays.contentToString()) // imprimir el objeto array
    // weekDays[0] = "Luneeeees"
//    println(weekDays[0])
    /**
     * Recorrido de Arrays
     */

    for (position in weekDays.indices){ // ciclo for con un solo parametro
//        println("Posición ${position}, dato: ${weekDays[position]}")
    }

    for ((posi, valor) in weekDays.withIndex()){ // ciclo for con dos parámetros, posición y valor
//        println("Posición: ${posi}, dato: ${valor}")
    }

    for (day in weekDays){
        //println("Dia: $day")
    }

    //weekDays.forEach { day -> println("day: $day") }


    var diaFiltrado = weekDays.filter { it.contains("nes") }
    //println(diaFiltrado)
    //diaFiltrado.forEach { println("Dia filtrado: $it") }



/*    var name:String = "Lunes"
    var name2:String = "Martes"
    var name3:String = "Miercoles"
    var name4:String = "Jueves"
    var name5:String = "Viernes"*/

    // arrays tipados

    var numeros = intArrayOf(14,2,33,74,5,22,34, 5, 8, 2, 8, 33)

    println(numeros.contentToString())
    /*
    println(numeros[1])
    println(numeros[1])
    println(numeros.contentToString())
    */
    numeros[1]= 1001
    numeros += 2002
    println("Array de enteros ${ numeros.contentToString() }")

    numeros.sort() // ordena de manera ascendente por defecto

    println("Numeros ordenados ${numeros.contentToString()}")

    val duplicateNumbers = numeros.groupBy { it }.filter { it.value.size > 1 }.keys

    println("Numeros duplicados: $duplicateNumbers")




}


