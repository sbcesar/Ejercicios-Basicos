package ejercicio_4

import kotlin.reflect.typeOf

class Coche(color: String, marca: String, modelo: String, nCaballos: Int, nPuertas: Int, matricula: String) {

    private var color: String = ""
    private var marca: String = ""
    private var modelo: String = ""
    private var nCaballos: Int = 0
    private var nPuertas: Int = 0
    private var matricula: String = ""

    fun getColor(): String { return color }
    //Si la variable es una propiedad de la clase y tratas de validarla puedes usar require
    //Si la variable es local y no una propiedad de la clase entonces se hace la validacion directamente sin usar require:
    //  --->    if (color.isBlank()) { throw IllegalArgumentException("Debes introducir un color no en blanco") }
    fun setColor(nuevoColor: String) {
        try {
            require(nuevoColor.isNotBlank()) {"Debes introducir un color, no dejarlo en blanco."}
            color = nuevoColor
        } catch (e: Exception) {
            println(e.message)
        }

    }

    fun getMarca(): String { return marca }
    fun setMarca(nuevaMarca: String) {
        try {
            require(nuevaMarca.isNotBlank()) { "Debes introducir una marca, no dejarlo en blanco." }
            marca = nuevaMarca
        } catch (e: Exception) {
            println(e.message)
        }

    }

    fun getModelo(): String { return modelo }
    fun setModelo(nuevoModelo: String) {
        try {
            require(nuevoModelo.isNotBlank()) { "Debes introducir un modelo, no dejarlo en blanco." }
            modelo = nuevoModelo
        } catch (e: Exception) {
            println(e.message)
        }

    }

    fun getNumCaballos(): Int { return nCaballos }
    fun setNumCaballos(nuevoNumCaballos: Int) {
        try {
            require(nuevoNumCaballos in 70..700) { "El numero de caballos debe rondar entre 70 y 700 caballos." }
            nCaballos = nuevoNumCaballos
        } catch (e:Exception) {
            println(e.message)
        }
    }



    override fun toString(): String {
        return "Color='$color', marca='$marca', modelo='$modelo', nCaballos=$nCaballos, nPuertas=$nPuertas, matricula='$matricula')"
    }
}