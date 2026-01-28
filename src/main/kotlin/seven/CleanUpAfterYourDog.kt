package seven

fun crap(garden: Array<CharArray>, bags: Int, cap: Int): String {
    val totalCrap = garden.sumOf { row -> row.count { it == '@' } }
    val dogAround = garden.sumOf { row -> row.count { it == 'D' } } > 0
    val canCollect = bags * cap
    return when {
        dogAround -> "Dog!!"
        canCollect >= totalCrap -> "Clean"
        else -> "Cr@p"
    }
}
