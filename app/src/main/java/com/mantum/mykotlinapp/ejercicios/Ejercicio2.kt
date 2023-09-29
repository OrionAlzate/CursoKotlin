package com.mantum.mykotlinapp.ejercicios

/*
Precio peli para personas > 12 = $15
Precio peli para personas 13 - 60 = $30, si es lunes vale $25
Precio peli para personas 61 - 100 = $20
Precio peli para personas > 12 = $15

si la edad está fuera de rango return -1
* */

fun main(){

    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true

    println("El precio de la película para una persona con $child años es de: \$${ticketPrice(child, isMonday)}")
    println("El precio de la película para una persona con $adult años es de: \$${ticketPrice(adult, isMonday)}")
    println("El precio de la película para una persona con $senior años es de: \$${ticketPrice(senior, isMonday)}")
}

fun ticketPrice(edad:Int, isMonday: Boolean):Int{

    return when(edad){
        in 1..12 -> 15
        in 13..60 -> if(isMonday) 25 else 30
        in 61 .. 100 -> 20
        else -> -1
    }

}

