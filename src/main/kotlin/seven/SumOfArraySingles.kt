package seven

fun repeats(arr: IntArray): Int =
    arr.groupBy { it }
        .filter { it.value.size == 1 }
        .map { it.key }
        .sum()
