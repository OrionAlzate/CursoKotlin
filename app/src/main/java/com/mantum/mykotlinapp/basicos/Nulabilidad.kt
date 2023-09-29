package com.mantum.mykotlinapp.basicos

fun main(){


    var name:String? = null // ? valida si el valor de la variable es Null o no
//    println(name!![0]) // !! confirma en el llamado al dato que el valor no es nulo - se rompe si es nulo
    println(name?.get(2)) // nomVariable?  verifica que el valor sea nulo o no y no se rompe el código
    println(name?.get(3) ?:"Es nulo") // ?: operador Elvis, verificac si es nulo, funciona como un operador ternario if-else
}