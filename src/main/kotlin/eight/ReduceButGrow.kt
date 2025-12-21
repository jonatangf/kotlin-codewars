package eight


fun grow(arr: IntArray): Int {
    return if (arr.isEmpty()) 0 else arr.reduce { acc, value -> acc * value }
}
