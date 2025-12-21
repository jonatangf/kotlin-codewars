package eight

fun sumArray(array: DoubleArray): Double {
    if (array.isEmpty()) return 0.0
    return array.reduce { acc, value -> acc + value }
}
