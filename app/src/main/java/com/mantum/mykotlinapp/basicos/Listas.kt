package com.mantum.mykotlinapp.basicos

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
    listaMutable.forEach {println(it) }


}







