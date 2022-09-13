fun main() {
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter(14))

    //Make a variable called waterFilter.
    //waterFilter can be any function that takes an Int and returns an Int.
    //Assign a lambda to waterFilter.
    //The lambda returns the value of the argument dirty divided by 2.
}