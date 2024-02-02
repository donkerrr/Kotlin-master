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
}