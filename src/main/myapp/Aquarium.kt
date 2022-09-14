package main.myapp
class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    //The example constructors above just declare properties and assign the value of an expression to them.
    //If your constructor needs more initialization code, it can be placed in one or more init blocks.

    init {
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }

}
