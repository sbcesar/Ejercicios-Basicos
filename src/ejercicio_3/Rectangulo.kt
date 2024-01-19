package ejercicio_3

class Rectangulo(base: Double,altura: Double) {
    var base: Double = 0.0
    var altura: Double = 0.0

    fun area(): String {
        return "%.2f".format(base * altura)
    }

    fun perimetro(): String {
        return "%.2f".format((2 * base) + (2 * altura))
    }

    override fun toString(): String {
        return "El rectángulo de base $base y de altura $altura tiene un área de ${area()} y un perímetro de ${perimetro()}"
    }
}