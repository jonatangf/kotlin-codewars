package five

fun longToIP(ip: UInt): String {
    return listOf(24, 16, 8, 0)
        .map { (ip shr it) and 0xFFu }
        .joinToString(".")
}
