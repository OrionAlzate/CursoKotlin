package com.mantum.mykotlinapp.basicos

fun main(){

//    getMonth(2)
    //getMonthWhen(12)
    //getTrimestre(5)
    //getSemestre(12)
    //getTipoDato(true)
    //println(getReturn(1))
    weekDay(4)

}

/**
 * When
 * Es similar a un Switch Case
 */


fun getMonthWhen(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abil")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("No es un mes válido.")

    }
}
/**
* When con opciones anidadas
*/
fun getTrimestre(mes:Int){

    when(mes){
        1,2,3 -> println("Primer trimestre") // rangos (in num .. num)
        4,5,6 -> println("Segundo trimestre")
        7,8,9 -> println("Tercer trimestre")
        10,11,12 -> println("Cuarto trimestre")
        else -> println("Mes ingresado no válido")
    }
}


/**
 * When con rangos
 */
fun getSemestre(mes:Int){
     when(mes){
         in 1..6 -> println("Primer Semestre")
         in 7 .. 12 -> println("Segundo semestre")
         !in 1 .. 12 -> println("Mes ingresado no válido")
     }
}

/**
 * When para validar el tipo de dato
 * Any para cualquier tipo de dato
 */
fun getTipoDato(value:Any){
    when(value){
        is Int -> println("Tipo de dato Int")
        is String -> println("Tipo de dato String")
        is Boolean -> if (value) println("Valor booleano")
    }
}

/**
 * When con return
 */
fun getReturn(mes:Int):String{ // asignar el when a una variable y devolverla por el return
    var resultado = when(mes){
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abil"
        else -> "Mes ingresado no válido"
    }
    return  resultado
}


fun getReturn2(mes:Int):String{ // devolver el when como return
    return when(mes){

        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abil"
        else -> "Mes ingresado no válido"
    }
}

fun getReturn3(mes:Int) = when(mes){ // funcion en una sola linea
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abil"
        else -> "Mes ingresado no válido"
    }





// if anidado innecesario
fun getMonth(month:Int){

    if (month == 1){
        println("Enero")
    } else if(month==2){
        println("Febrero")
    } else if(month==3){
        println("Marzo")
    } else if(month==4){
        println("Abil")
    } else if(month==5){
        println("Mayo")
    } else if(month==6){
        println("Junio")
    } else if(month==7){
        println("Julio")
    } else if(month==8){
        println("Agosto")
    } else if(month==9){
        println("Septiembre")
    } else if(month==10){
        println("Octubre")
    } else if(month==11){
        println("Noviembre")
    } else if(month==12){
        println("Diciembre")
    } else {
        println("Debe elegir entre el 1 y el 12")
    }
}


fun weekDay(day: Int){

    when(day){
        1 -> println("Es lunes")
        2 -> println("Es martes")
        3 -> println("Es miercoles")
        4 -> println("Es jueves")
        5 -> println("Es viernes")
        else -> print("No es ningún día de la semana")
    }

    // con rangos
    var porcentaje:Int = 87

    when(porcentaje){
        in 1..20 -> println("Porcentaje Demasiado bajo: $porcentaje%")
        in 21..40 -> println("Porcentaje muy bajo: $porcentaje%")
        in 41..60 -> println("Porcentaje bajo: $porcentaje%")
        in 61..80 -> println("Porcentaje medio: $porcentaje%")
        in 81..100 -> println("Porcentaje alto: $porcentaje%")
    }



}