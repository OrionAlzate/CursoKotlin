package com.mantum.mykotlinapp.basicos

fun main(){
    //filtrar()
    filtrarLista()
}

fun filtrar(){

    var nombres = listOf("Patricia", "Beatriz", "Freddy", "Marcela", "Wilson", "Antonio")

    var nombresFiltrados = nombres.filter { it.contains("a", ignoreCase = true) }

    println(nombresFiltrados)

}

fun filtrarLista(){

    val listaPersonas = listOf(
        Pacientes("Patricia", 29),
        Pacientes("Beatriz", 25),
        Pacientes("Freddy", 34),
        Pacientes("Marcela", 31),
        Pacientes("Wilson", 35),
        Pacientes("Antonio", 39)

    )

    val personasFiltradas = listaPersonas.filter { it.edad > 30 }.map { it.nombre}  // filter() y map()
    println(personasFiltradas)


}

data class Pacientes(val nombre:String,val edad:Int)