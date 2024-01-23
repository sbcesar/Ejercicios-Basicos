package ejercicio_5

fun main() {
    val tiempo1 = Tiempo(0.0,0.0,0.0)

    println("Introduce la hora: ")
    tiempo1.horas = readln().toDouble()

    println("Introduce los minutos: ")
    tiempo1.minutos = readln().toDouble()

    println("Introduce los segundos: ")
    tiempo1.segundos = readln().toDouble()

    println(tiempo1.toString())

}