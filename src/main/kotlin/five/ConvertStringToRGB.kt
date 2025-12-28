package five

data class RGB(val r: Int, val g: Int, val b: Int)

fun hexStringToRGB(hexString: String): RGB {
    val rawHexString = hexString.lowercase().replace("#", "")
    val red = rawHexString.subSequence(0, 2)
    val green = rawHexString.subSequence(2, 4)
    val blue = rawHexString.subSequence(4, 6)

    return RGB(
        r = red.toString().toInt(16),
        g = green.toString().toInt(16),
        b = blue.toString().toInt(16)
    )
}
