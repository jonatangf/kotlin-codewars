package five

fun getScore(dice: IntArray): Int {
    var score = 0
    val counts = dice.groupBy { it }.mapValues { it.value.size }.toMutableMap()

    fun calculateNOfAKind(face: Int, count: Int): Int {
        val multiplier = count - 2
        return if (face == 1) 1000 * multiplier else face * 100 * multiplier
    }

    // Straight 1-6
    if (counts.size == 6 && counts.values.all { it == 1 }) {
        return 1000
    }

    if (counts.size == 3 && counts.values.all { it == 2 }) {
        return 750
    }

    for (face in 1..6) {
        val count = counts[face] ?: 0
        if (count >= 3) {
            score += calculateNOfAKind(face, count)
            counts[face] = 0
        }
    }

    score += (counts[1] ?: 0) * 100
    score += (counts[5] ?: 0) * 50

    return score
}
