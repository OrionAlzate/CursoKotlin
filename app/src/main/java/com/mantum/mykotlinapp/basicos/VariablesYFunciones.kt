package com.mantum.mykotlinapp.basicos

fun main(){
    print("Variables y Funciones")
}
fun VariablesYFunciones() {


    /***
     * @author Orion Alzate
     * Variables y Valores
     * val = valor o constantes
     * var = variable
     */

    /***
     * Tipo de datos numéricos
     */

    // Integer
    var num : Int = 30
    num = 15

    // Long
    val numLargo : Long = 300000000000000

    //float
    var numFloat : Float = 30.5f // debe llevar la f después de un número

    //Double
    val numDouble : Double = 33.3

    /***
     * Tipo de datos alfa-numéricos
     */

    // Char
    var letra : Char = 'i'
    letra = 'a'

    // String
    var name: String = "Francisco"

    // Boolean
    var verdaderoOfalso : Boolean = true
    verdaderoOfalso = false

    println("Mensaje por consolaaaaa")


    /**
     * Manejo de Valores y Variables


     * Operaciones aritméticas
     */
    var num1 : Int = 15
    var num2 : Int = 18

    // Sumar
    var resultSuma = num1 + num2
    // Restar
    var resultResta = num1 - num2
    // Multi
    var resultMulti = num1 * num2
    // Div
    var resultDiv = num1 / num2
    // Num MOD
    var resultMod = num1 % num2


    /***
     * se pueden sumar diferentes tipos de datos pero va a convertir a alguno de ellos
     * */
    var numCombonado = num1 + numFloat

    var edad:Int = 21
    var textoConcatenado : String = "Me llamo $name y mi edad es: $edad" // convierte el otro dato a string

    var edadString : String = edad.toString() // valor Int convertido a String

    /**
     * Funciones
     */

    fun myFunct(){

        var nombre: String = "Juan Carlos"
        var saludo: String = "Bienvenido, $nombre"
    }
    myFunct() // llamado a la función

    /**
     * Funciones con parámetros de entrada
     */

    fun saludo(nombre:String, edad:Int){
        var saludar : String = "Bienvenido, $nombre, tu edad es: $edad"
    }
    saludo("Manuela",27)


    // misma función pero diferente constructor, al llamarse sólo se ingresa un para metro o dos segun lo deseado
    fun saludo(nombre:String){
        print("Saludo a $nombre sin edad")
    }
    saludo("Francisco")
    /**
     * Funciones con parámetros de salida
     */

    fun retornarValor(val1:Int, val2:Int):Int{ // se debe especificar el valor que se va a retornar
        return val1+val2
    }
    retornarValor(2,3)


    fun retornarSaludo(nombre:String):String{
        return "Bienvenido $nombre"
    }

    var llamadoFuncReturn:String = retornarSaludo("Carlos") //almacenar el valor retornado en una variable
    print(llamadoFuncReturn)

    fun restar(num1:Int, num2:Int):Int = num1 - num2 // declarado sin las llaves en una sola línea
    var resultadoResta : String = "El resultado es: ${restar(15,5)}"

}