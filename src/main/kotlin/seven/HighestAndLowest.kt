package seven

fun highAndLow(numbers: String): String {
    val intNumbers = numbers.split(" ").map { it.toInt() }

    val max = intNumbers.max()
    val min = intNumbers.min()

    return "$max $min"
}
