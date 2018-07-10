package main

import main.utils.*


fun main(args: Array<String>) {
    val RadioInicial = radio(
            Estado = false,
            Frecuencia = "FM",
            Volumen = 10,
            Estacion = 89.7
    )

    println(RadioInicial)
    println("")
    do {
        println("""
        1. Encender Radio
        2. Cambiar frecuencia
        3. Subir volumen
        4. Bajar volumen
        5. Subir estación
        6. Bajar estación
        7. Apagar Radio
        8. Salir
    """.trimIndent())

        println("¿Que desea hacer?")

        var opcion: String = readLine()!!

        if (opcion == "1") {
            if (RadioInicial.Estado == true){
                println("Su radio ya se encuentra encendido, no lo puede volver a encender")
                println("")
            }else{
                println("Encendiendo radio...")
                println("")
                RadioInicial.encender()
                println(RadioInicial)
                println("")
            }

        } else if (opcion == "2") {
            println("Cambiando frecuencia de radio...")
            println("")
            RadioInicial.am()
            println(RadioInicial)
            println("")

        } else if (opcion == "3") {
            println("Subiendo volumen...")
            println("")
            RadioInicial.subirVolumen()
            println(RadioInicial)
            println("")

        } else if (opcion == "4") {
            println("Bajando volumen...")
            println("")
            RadioInicial.bajarVolumen()
            println(RadioInicial)
            println("")
        } else if (opcion == "5") {
            println("Su estacion actual es: ${RadioInicial.Estacion}" )
            println("Ingrese el valor de cuanto quiere subir la estación de radio (Ej: 3.5):")
            var respuesta: String = readLine()!!
            var respuesta2: Double = respuesta.toDouble()
            var suma = RadioInicial.Estacion + respuesta2
            RadioInicial.subirEstacion(suma)
            println (RadioInicial)
            println("")
        } else if (opcion == "6"){
            println("Su estacion actual es: ${RadioInicial.Estacion}" )
            println("Ingrese el valor de cuanto quiere bajar la estación de radio (Ej: 3.5):")
            var respuesta: String = readLine()!!
            var respuesta2: Double = respuesta.toDouble()
            var resta = RadioInicial.Estacion - respuesta2
            RadioInicial.subirEstacion(resta)
            println (RadioInicial)
            println("")
        }else if (opcion == "7"){
            if (RadioInicial.Estado == false){
                println("Su radio ya se encuentra en estado apagado, no lo puede volver a apagar")
                println("")
            }else{
                println("Apagando radio...")
                println("")
                RadioInicial.apagar()
                println(RadioInicial)
                println("")
            }

        }

    } while (opcion != "8")

    println("Gracias por utilizar este programa de G.Luca Rivera")
}