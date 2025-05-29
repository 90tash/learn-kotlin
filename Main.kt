
fun main() {
    println("Enter a number:")
    val input = readln()
    val inputAsInteger = input.toInt()
    val isEven = inputAsInteger % 2 == 0
    println("Is the number even? $isEven")
}