fun main() {
    //a higher-order function
    //A higher-order function is a function that takes other functions as parameters,
    // or it is a function that returns another function.


    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }
    // The first argument is an integer.
    // The second argument is a function that takes an integer and returns an integer.

    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    //The function you pass doesn't have to be a lambda; it can be a regular named function instead. To specify the argument as a regular function, use the :: operator.
    // This way Kotlin knows that you are passing the function reference as an argument, not trying to call the function.
    fun increaseDirty( start: Int ) = start + 1

    println(updateDirty(15, ::increaseDirty))
}