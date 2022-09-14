package main.myapp

interface FishColor {
    val color: String
}

class Shark: FishAction, FishColor{
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: FishAction, FishColor {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}
interface FishAction  {
    fun eat()
}