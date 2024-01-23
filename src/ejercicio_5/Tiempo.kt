package ejercicio_5

class Tiempo(horas: Double,minutos: Double,segundos: Double) {
    var horas: Double = 0.0
    var minutos: Double = 0.0
    var segundos: Double = 0.0

    init {
        this.horas = horas
        this.minutos = minutos
        this.segundos = segundos
    }

    override fun toString(): String {
        return "Hora: ${horas}h ${minutos}m ${segundos}s"
    }

}