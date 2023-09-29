package com.mantum.mykotlinapp.ejercicios

fun main(){
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSumary(morningNotification)
    printNotificationSumary(eveningNotification)

}

fun printNotificationSumary(numberOfMessage: Int){
    if (numberOfMessage < 100){
        println("Tienes $numberOfMessage mensajes ")
    } else {
        println("Tienes +99 mensajes ")
    }
}

