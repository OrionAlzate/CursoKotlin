package com.mantum.mykotlinapp.basicos

import com.mantum.mykotlinapp.toDoApp.TodoAppActivity

fun main(){

    listaMutable()

    listaInmutable()
}

    /**
     * Listas inmutables
     * Son inmutables en su tamaño, no se pueden modificar
     */
fun listaInmutable(){

    var miLista:List<String> = listOf("Lunes", "Martes", "Miercoles","Jueves", "Viernes", "Sabado","Domingo")
       /* println(miLista.size)
        println(miLista)

        println(miLista[0])
        println(miLista[2])

        println(miLista.last())
        println(miLista.first())*/

        /**
         * Filtrar Listas
         */

        var example = miLista.filter { it.contains("a") } // filtra por un contenido y lo guarda en una nueva lista
        // println(example)

        /**
         * Iterar Listas
         */

        // ciclo foreach
        // miLista.forEach { dia -> println(dia)}
        // miLista.forEach {println(it)} // otra manera de hacer el ciclo for con it (iterator)
}


/**
 * Listas Mutables
 * Son mutables en su tamaño, sí se pueden modificar
 */
fun listaMutable(){

    var listaMutable:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles","Jueves", "Viernes", "Sabado","Domingo")
    //println(listaMutable)

    listaMutable.add("Dia festivo")
    //println(listaMutable)

    //listaMutable.forEach {day -> println(day) }
    //listaMutable.forEach {println(it) }


    //println("Dia seleccionado: ${listaMutable[2]}")

    //println(listaMutable)
    listaMutable.remove("Miercoles") // Se elimina el elemento con ese valor.
    //println(listaMutable)


    var weekDays = arrayOf("Lunes", "Martes", "Miercoles","Jueves", "Viernes")
    var arrayToMutableList = weekDays.toMutableList() // convertir un array a una lista mutable
    println(arrayToMutableList)
    arrayToMutableList.remove("Martes") // eliminar el dato de la lista mutable, no desde el array
    println(arrayToMutableList)





}








