package five

data class RGB(val r: Int, val g: Int, val b: Int)

fun hexStringToRGB(hexString: String): RGB {
    val rawHexString = hexString.lowercase().replace("#", "")
    val red = charSequenceToInt(rawHexString.subSequence(0, 2))
    val green = charSequenceToInt(rawHexString.subSequence(2, 4))
    val blue = charSequenceToInt(rawHexString.subSequence(4, 6))
    return RGB(r = red, g = green, b = blue)
}

private fun charSequenceToInt(charSequence: CharSequence): Int = charSequence.toString().toInt(16)
