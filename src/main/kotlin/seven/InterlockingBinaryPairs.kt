package seven

fun interlocking(a: Long, b: Long): Boolean {
    val aBinary = a.toString(2).reversed()
    val bBinary = b.toString(2).reversed()
    val maxLength = maxOf(aBinary.length, bBinary.length)

    for (i in 0 until maxLength) {
        val aBit = if (i < aBinary.length) aBinary[i] else '0'
        val bBit = if (i < bBinary.length) bBinary[i] else '0'

        if (aBit == '1' && bBit == '1') {
            return false
        }
    }
    return true
}
