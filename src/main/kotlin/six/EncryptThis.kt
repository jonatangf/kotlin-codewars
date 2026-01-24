package six

fun encryptThis(text: String): String = text
    .split(" ")
    .joinToString(" ") { word ->
        when (word.length) {
            1 -> "${word[0].code}"
            2 -> "${word[0].code}${word[1]}"
            else -> "${word[0].code}${word.last()}${word.drop(2).dropLast(1)}${word[1]}"
        }
    }
