package com.mantum.mykotlinapp.basicos

/**
 * Programacion imperativa VS programación declarativa
 */
fun main(){

    var lista = listOf<Int>(2,34,4,78,6,5,14,26,33)
    println(sumarLista(lista))
    println(filtrarPares(lista))

}

//programacion imperativa - es más comprensible por su lógica
fun sumarLista(lista : List<Int>): Int {

   /* var resultado = 0
    for (i in lista) {
        resultado += i
    }

    return resultado
    */

// programación declarativa - tienen el mismo resultado pero no siempre se usan para lo mismo
    return lista.sum()

}


fun filtrarPares(lista: List<Int>):List<Int> {
    /*
    // programación imperativa - declaramos toda la lógica nosotros
    val resultado = mutableListOf<Int>()
    for (i in lista){
        if( i % 2 == 0){
            resultado.add(i)
        }
    }
    return resultado
    */
    // programación declarativa, sólo usamos una función ya declarada
    return lista.filter { it % 2 == 0 }.toList()
}