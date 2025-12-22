package six

fun parse(data: String): List<Int> {
    val result = mutableListOf<Int>()
    var accumulator = 0

    for (c in data) {
        when (c) {
            'i' -> accumulator++
            'd' -> accumulator--
            's' -> accumulator *= accumulator
            'o' -> result.add(accumulator)
        }
    }

    return result
}
