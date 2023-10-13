package com.mantum.mykotlinapp.basicos



fun main(){
    cicloFor()


}


fun cicloFor(){

    /**
     * Ciclo For
     */

    for (i in 1..5){
        //println(i)
    }

    //for (a in 'a'..'g')  println(a) // forma corta ciclo for sin llaves {}

    //for (z in 'z' downTo 'f') print(z)


    var weekDays = arrayOf("Lunes", "Martes", "Miercoles","Jueves", "Viernes")

    //for (day in weekDays) println("Día: ${day}")

    // .indices muestra la posición del la lista o array
    //for (day in weekDays.indices) println("Posición $day")

    // indice con valor, se llama la lista o array y se le pasa la posición del indice
    //for (day in weekDays.indices) println("posicion: $day, dato: ${weekDays[day]} ")


    /**
     * Ciclo Foreach
     */

    var lista = listOf(3,4,6,78,2,12,1)
    lista.sorted().forEach { println(it) } // ordenado y ciclo foreach


    // forEachIndexed genera dos parametros, indice y valor
    lista.forEachIndexed { index, valor -> println("Indice: $index, valor $valor")   }

    println("")
    lista.sorted().forEachIndexed { index, valor -> println("Indice: $index, valor $valor")   }

}


