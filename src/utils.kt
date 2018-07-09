package main.utils

class radio(
        var Estado: Boolean = false,
        var Frecuencia: String,
        var Volumen: Int = 10,
        var Estacion: Double

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

    fun subirEstacion(a: Double, b: Double): Double{
        return a + b
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
