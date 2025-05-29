
fun main() {
    println("Enter a number:")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()?.rem(2)?.equals(0) ?: false
    println("is even? $inputAsInteger")
}