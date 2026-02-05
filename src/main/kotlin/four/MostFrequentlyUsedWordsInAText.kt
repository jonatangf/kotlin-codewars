package four

private fun containsLetter(potentialWord: String): Boolean {
    for (c in potentialWord) {
        if (c.isLetter()) {
            return true
        }
    }
    return false
}

private fun isValidWord(potentialWord: String): Boolean =
    potentialWord.isNotEmpty() && containsLetter(potentialWord)

private fun cleanPotentialWord(potentialWord: String): String =
    potentialWord
        .trim()
        .replace("//", "")

fun top3MostFrequentlyWords(s: String): List<String> {
    val wordCount = s.split(" ")
        .map { cleanPotentialWord(it) }
        .filter { isValidWord(it) }
        .fold(HashMap<String, Int>()) { acc, word ->
            val cleanedWord = word.lowercase()

            if (!acc.containsKey(cleanedWord)) {
                acc[cleanedWord] = 1
            } else {
                acc[cleanedWord] = acc[cleanedWord]!! + 1
            }
            acc
        }

    wordCount.toList()
        .sortedByDescending { (_, value) -> value }
        .take(3)
        .map { (key, _) -> key }
        .let { return it }
}
