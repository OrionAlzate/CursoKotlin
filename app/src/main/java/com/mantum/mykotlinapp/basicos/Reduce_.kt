package com.mantum.mykotlinapp.basicos

fun main(){
    reduce_explain()
}

fun reduce_explain(){

    /**
     * Reduce
     * Opera con todos los valores de una lista, pasando dos parametros de entrada:
     * Valor Acumulado : el valor acumulado por cada iteración
     * Valor Actual : el siguiente valor de la lista por ser procesado
     */

    val numList = listOf(1,2,3,4,5)
    val numReduce = numList.reduce{valAcumulado, valActual -> valAcumulado * valActual}
    println(numReduce)


    val palabras = listOf("Hola ", "mundo ", "Bienvenidos ", "todos")
    val palabrasReduce = palabras.reduce{ frase, palabra -> frase + palabra}
    println(palabrasReduce)

}
