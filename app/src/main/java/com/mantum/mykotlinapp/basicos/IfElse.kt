package com.mantum.mykotlinapp.basicos

fun main(){


    myIfBasico(7,8)
    validar()
}

/**
 * If - Else
 */
fun myIfBasico(num1:Int, num2:Int){

    if (num1 > num2){
        println("$num1 es mayor")
    } else if(num1==num2) {
        println("$num1 es igual al $num2")
    } else{
        println("$num1 es menor")
    }

}

fun validar(){

    var graduado = true

    if (graduado){
        println("Está graduado")
    }

    if (!graduado)
    {
        println("Aun no se ha graduado")
    }


    var edad = 18
    var permiso = false

  /*  if (edad >= 18){ // if anidados sin operadores logicos
        if(permiso){
            println("Es mayor de edad pero no tiede permiso")
        }else {
            println("Es mayor de edad y tiede permiso")
        }
    }*/

    if (edad >= 18 && permiso == true){
        println("Es mayor y tiene permiso")
    }
    if (edad >= 18 || permiso ){
        println("Es mayor ó tiene permiso")
    }

}



