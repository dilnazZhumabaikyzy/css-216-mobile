fun main() {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // lazy
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")
    val newList = filtered.toList()
    println("new list: $newList")
    // output
    // ⇒ eager: [pagoda, plastic plant]
    //filtered: kotlin.sequences.FilteringSequence@386cc1c4
    //new list: [pagoda, plastic plant]
}