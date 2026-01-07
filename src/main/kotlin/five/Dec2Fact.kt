package five

// https://www.codewars.com/kata/54e320dcebe1e583250008fd
object Dec2Fact {
    fun dec2FactString(n: Long): String {
        var divider = 1L
        var result = ""
        var number = n

        while (true) {
            val remainder = number % divider
            val char = if (remainder < 10) {
                '0' + remainder.toInt()
            } else {
                'A' + (remainder - 10).toInt()
            }
            result = char + result

            val nextN = number / divider
            if (nextN == 0L) {
                break
            }

            divider++
            number = nextN
        }

        return result
    }

    fun factString2Dec(str: String): Long {
        var multiplier = 1L
        var result = 0L
        for (i in str.length - 1 downTo 0) {
            val char = str[i]
            val value = if (char in '0'..'9') {
                char - '0'
            } else {
                char - 'A' + 10
            }
            result += value * multiplier
            multiplier *= (str.length - i)
        }
        return result
    }
}
