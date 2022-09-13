fun main() {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    //⇒ lazy: kotlin.sequences.TransformingSequence@5ba23b66
    //-----
    //access: rock
    //first: rock
    //-----
    //access: rock
    //access: pagoda
    //access: plastic plant
    //access: alligator
    //access: flowerpot
    //all: [rock, pagoda, plastic plant, alligator, flowerpot]
}