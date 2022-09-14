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


    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm "
        )
        // 1 liter = 1000 cm^3
        println("Volume: $volume liters")
    }

  //internal means it will only be visible within that module. A module is a set of Kotlin files compiled together, for example, a library, a client or application, a server application in an IntelliJ project. Note the usage of "module" here is unrelated to Java modules that were introduced in Java 9.
  //public means visible outside the class. Everything is public by default, including variables and methods of the class.
    //If you want a property that your code can read or write, but outside code can only read,
    // you can leave the property and its getter as public and declare the setter private, as shown below.
    var volume: Int
        get() = width * height * length / 1000
        private set(value) {
            height = (value * 1000) / (width * length)
        }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

}
