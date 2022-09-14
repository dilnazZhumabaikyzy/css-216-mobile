package main.myapp
import java.lang.Math
fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
}

fun main () {
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")
}