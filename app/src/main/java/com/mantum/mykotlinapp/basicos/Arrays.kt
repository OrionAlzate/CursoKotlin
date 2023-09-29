package com.mantum.mykotlinapp.basicos

fun main(){



    /**
     * Arrays
     */

    var weekDays = arrayOf("Lunes", "Martes", "Miercoles","Jueves", "Viernes")
//    println(weekDays.size) // su tamaño es fijo
//    println(weekDays[(weekDays.size -1)])

    weekDays[0] = "Luneeeees"
//    println(weekDays[0])


    for (position in weekDays.indices){ // ciclo for con un solo parametro
//        println("Posición ${position}, dato: ${weekDays[position]}")
    }

    for ((posi, valor) in weekDays.withIndex()){ // ciclo for con dos parámetros, posición y valor
//        println("Posición: ${posi}, dato: ${valor}")
    }

    for (day in weekDays){
        println("Dia: $day")
    }

/*    var name:String = "Lunes"
    var name2:String = "Martes"
    var name3:String = "Miercoles"
    var name4:String = "Jueves"
    var name5:String = "Viernes"*/

}