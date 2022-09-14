package main.myapp
class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
   //secondary constructors
   //Every secondary constructor must call the primary constructor first,
   // either directly using this(), or indirectly by calling another secondary constructor.
   //This means that any init blocks in the primary will be executed for all constructors,
   //and all the code in the primary constructor will be executed first.
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
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

}
