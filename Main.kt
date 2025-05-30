
fun main() {
    println("Enter a number:")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()
    val output = when(inputAsInteger) {
        null -> "Dude, write a valid number!"
        3 -> "The number is three."
        5 -> "The number is five"
        in 1..20 -> "The number is between 1 to 20."
        else -> "Idk, what to print here."
    }
    println(output)

}