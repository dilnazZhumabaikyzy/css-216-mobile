// Will assign kotlin.Unit
fun main(args: Array<String>) {
    val temperature = 100
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
}
