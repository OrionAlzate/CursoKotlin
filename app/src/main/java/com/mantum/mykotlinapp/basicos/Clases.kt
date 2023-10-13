package com.mantum.mykotlinapp.basicos

/**
 * Clases
 */
class Personas{
    // atriburos - (variables)
    var nombre = ""
    var edad = 0

    // Constructor secundario
    constructor(nombre:String, edad:Int){
        this.nombre = nombre
        this.edad = edad
    }

    // Métodos - (funciones)
    fun saludar(){
        println("Hola, mi nombre es $nombre y tengo $edad años")
    }
}

// Clase declarada con el constructor primario
class Usuarios(private var nombre:String, private var edad: Int){
    fun saludar(){
        println("Hola, mi nombre es $nombre y tengo $edad años")
    }
}


fun main(){

    val miPersona = Personas("Manuela", 27)
    println("Nombre: ${miPersona.nombre}\nEdad: ${miPersona.edad}")
    miPersona.saludar()

    val miUsuario = Usuarios("Carlos", 25)
    miUsuario.saludar()

}