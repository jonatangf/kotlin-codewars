package six

val VALID_WORDS = setOf(
    "i", "a", "am", "ace", "bat", "bath", "bathe", "bathed", "cat", "cats",
    "dog", "dogs", "do", "dove", "doves", "happy", "happily", "the", "there",
    "their", "he", "she", "it", "we", "you", "they", "are", "doing", "well",
)

fun maxMatch(initialSentence: String): List<String> {
    val sortedDictionary = VALID_WORDS.sortedByDescending { it.length }
    val foundWords = arrayListOf<String>()
    var sentence = initialSentence

    while (sentence.isNotEmpty()) {
        var matched = false

        for (word in sortedDictionary) {
            if (sentence.startsWith(word)) {
                foundWords.add(word)
                sentence = sentence.removePrefix(word)
                matched = true
                break
            }
        }

        if (!matched) {
            foundWords.add(sentence[0].toString())
            sentence = sentence.removeRange(0, 1)
        }
    }

    return foundWords
}
