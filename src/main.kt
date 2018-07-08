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
    menu()



}

fun menu(){
    println("""
        1. Enceder Radio
        2. Cambiar frecuencia
        3. Subir volumen
        4. Bajar volumen
        5. Apagar Radio
        6. Salir
    """.trimIndent())

    println("¿Que desea hacer?")

}