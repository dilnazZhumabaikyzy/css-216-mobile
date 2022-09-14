package main.myapp

//Kotlin lets you declare a class where you can only create one instance of it by using the keyword object instead of class.
//Kotlin will create that one instance, and that instance is referenced by the class name.
//Then all other objects can just use this one instance. You cannot create other instances of this class.
interface FishColor {
    val color: String
}
object GoldColor : FishColor {
    override val color = "gold"
}

class Shark: FishAction, FishColor{
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}
class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}
interface FishAction  {
    fun eat()
}