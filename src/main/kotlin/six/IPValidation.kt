package six

fun isValidIp(ip: String): Boolean {
    if (ip.isEmpty()) return false
    val ipComponents = ip.split('.')
    ipComponents.forEach {
        val isNumber = it.all { char -> char.isDigit() }
        val num = it.toIntOrNull() ?: return false
        if (!isNumber || num !in 0..255 || (it.length > 1 && it.startsWith('0'))) {
            return false
        }
    }
    return ipComponents.size == 4
}
