/*
fun main() {
    var maxNumber = Int.MIN_VALUE
    var input: String
    do {
        input = readLine() ?: ""
        val number = input.toIntOrNull()
        number?.plus(number)
        if (number != null && number > maxNumber)
            maxNumber = number
    } while (input != "стоп")

    println("$maxNumber")
}*/


fun main() {
    val numbers = mutableListOf<Int>()
    var input: String
    do {
        input = readLine() ?: ""
        val number = input.toIntOrNull()
        if (number != null) {
            numbers.add(number)
        }
    } while (input != "стоп")

    val maxNumber = numbers.maxOrNull()
    println("$maxNumber")
}