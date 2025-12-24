package five

fun maxSequence(arr: List<Int>): Int {
    var maxSum = 0
    for (i in arr.indices) {
        for (j in i until arr.size) {
            val subArray = arr.subList(i, j + 1)
            val sum = subArray.sum()
            if (sum > maxSum) {
                maxSum = sum
            }
        }
    }
    return maxSum
}
