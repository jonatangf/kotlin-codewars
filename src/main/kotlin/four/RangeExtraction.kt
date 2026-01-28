package four

fun rangeExtraction(arr: IntArray): String {
    return arr
        .fold(mutableListOf<MutableList<Int>>()) { groups, n ->
            if (groups.isNotEmpty() && n == groups.last().last() + 1) {
                groups.last().add(n)
            } else {
                groups.add(mutableListOf(n))
            }
            groups
        }
        .joinToString(",") { group ->
            when {
                group.size >= 3 -> "${group.first()}-${group.last()}"
                else -> group.joinToString(",")
            }
        }
}
