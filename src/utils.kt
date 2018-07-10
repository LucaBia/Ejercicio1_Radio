package main.utils

import sun.tools.tree.DoubleExpression

class radio(
        var Estado: Boolean = false,
        var Frecuencia: String,
        var Volumen: Int = 10,
        var Estacion: Double = 89.7

){
    fun encender(){
        Estado = true
    }

    fun apagar(){
        Estado = false
    }

    fun am(){
        Frecuencia = "AM"
    }

    fun fm(){
        Frecuencia = "FM"
    }

    fun subirVolumen(){
        Volumen += 1
    }

    fun bajarVolumen(){
        Volumen -= 1
    }

    fun subirEstacion(valor: Double){
        Estacion = valor
    }
    fun estacion(){
        Estacion = 89.7
    }
    fun bajarEstacion(a: Double, b: Double): Double{
        return a - b
    }


    override fun toString(): String {
        return """
            Radio:
                Estado: $Estado
                Frecuencia: $Frecuencia
                Volumen: $Volumen
                Estacion: $Estacion
        """.trimIndent()
    }
}
