package com.mantum.mykotlinapp.basicos

fun main(){
    mapear()
}

fun mapear(){

    val listaPacientes = listOf(
        Pacientes("Patricia", 29),
        Pacientes("Beatriz", 25),
        Pacientes("Freddy", 34),
        Pacientes("Marcela", 31),
        Pacientes("Wilson", 35),
        Pacientes("Antonio", 39)

    )

    var listaNombres = listaPacientes.map { it.nombre }
    println(listaNombres)
    var listaEdades = listaPacientes.map { it.edad }
    println(listaEdades)

    println("")
    listaPacientes.map { paciente -> println("nombre: ${paciente.nombre}, edad: ${paciente.edad}  ") }

    sumarEdades(listaPacientes)


    val listaPalabras = listOf("Hola", "Mundo", "Bienvenido")
    val listaMapeada = listaPalabras.map { it -> println("Palabra: '${it}' longitud = ${it.length}")  }
    var sumaDeLetras = listaPalabras.map { it.length }.sum()
    println("cantidad total de letras en la lista = ${sumaDeLetras}")
}

fun sumarEdades(lista: List<Pacientes>){
    val sumarEdades = lista.map { it.edad }.sum()
    println("Suma de las edades: $sumarEdades")
}