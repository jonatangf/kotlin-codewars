package four

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class Top3MostFrequentlyWordsTest {

    @Test
    fun `returns top 3 most frequent words ordered by frequency`() {
        assertTop3("a a a  b  c c  d d d d  e e e e e", "e", "d", "a")
    }

    @Test
    fun `handles case insensitivity and punctuation`() {
        assertTop3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e", "e", "ddd", "aa")
    }

    @Test
    fun `handles contractions with apostrophes`() {
        assertTop3("  //wont won't won't ", "won't", "wont")
    }

    @Test
    fun `handles single word with punctuation`() {
        assertTop3("  , e   .. ", "e")
    }

    @Test
    fun `returns empty list for only punctuation`() {
        assertTop3("  ...  ")
    }

    @Test
    fun `returns empty list for single apostrophe`() {
        assertTop3("  '  ")
    }

    @Test
    fun `returns empty list for multiple apostrophes`() {
        assertTop3("  '''  ")
    }

    @Test
    fun `handles long text with multiple words`() {
        assertTop3(
            """
             In a village of La Mancha, the name of which I have no desire to call to
             mind, there lived not long since one of those gentlemen that keep a lance
             in the lance-rack, an old buckler, a lean hack, and a greyhound for
             coursing. An olla of rather more beef than mutton, a salad on most
             nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
             on Sundays, made away with three-quarters of his income.""", "a", "of", "on"
        )
    }

    @Test
    fun `returns correct frequencies for words with apostrophes`() {
        // Build input: word1 (29 times), word2 (18 times), word3 (14 times), word4 (13 times)
        val word1 = "knnrurzen'"
        val word2 = "bovisdqsvkc"
        val word3 = "diffxqn"
        val word4 = "sca'a"
        val input = List(29) { word1 }.joinToString(" ") + " " +
                List(18) { word2 }.joinToString(" ") + " " +
                List(14) { word3 }.joinToString(" ") + " " +
                List(13) { word4 }.joinToString(" ")

        assertTop3(input, word1, word2, word3)
    }

    @Test
    fun `returns correct frequencies for words with double apostrophes`() {
        // Build input: word1 (27 times), word2 (25 times), word3 (24 times), word4 (15 times)
        val word1 = "veun'pw"
        val word2 = "ct'taf"
        val word3 = "anckf''xyhd"
        val word4 = "j''k"
        val input = List(27) { word1 }.joinToString(" ") + " " +
                List(25) { word2 }.joinToString(" ") + " " +
                List(24) { word3 }.joinToString(" ") + " " +
                List(15) { word4 }.joinToString(" ")

        assertTop3(input, word1, word2, word3)
    }

    @Test
    fun `handles words with embedded apostrophes`() {
        val actual: List<String> = top3MostFrequentlyWords("'a 'A 'a' a'A' a'a'!")
        val expected1 = listOf("'a", "a'a'", "'a'")
        val expected2 = listOf("a'a'", "'a", "'a'")
        assertTrue(
            expected1 == actual || expected2 == actual,
            "Expected either ${format(expected1)} or ${format(expected2)} but was ${format(actual)}"
        )
    }

    private fun assertTop3(input: String, vararg expected: String) {
        val actual: List<String> = top3MostFrequentlyWords(input)
        if (expected.isEmpty()) assertTrue(actual.isEmpty(), "Expected empty list but was ${format(actual)}")
        else assertContentEquals(
            expected.toList(),
            actual,
            "Expected ${format(expected.toList())} but was ${format(actual)}"
        )
    }

    private fun format(list: List<String>) = list.map { "\"" + it + "\"" }.joinToString(", ", "[", "]")
}
