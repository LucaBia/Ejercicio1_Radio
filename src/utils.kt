package main.utils

class radio(
        var Estado: Boolean = false,
        var Frecuencia: String,
        var Volumen: Int,
        var Estacion: Double

){
    fun encender(){
        Estado = true
    }

    fun apagar(){
        Estado = false
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
