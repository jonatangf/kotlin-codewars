package six

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WordSegmentationTest {

    @Test
    fun scenarioOk1() {
        val input = "theyaredoingwell"
        val result = maxMatch(input)
        assertThat(result).isEqualTo(listOf("they", "are", "doing", "well"))
    }

    @Test
    fun scenarioOk2() {
        val input = "theyaredoingwelly"
        val result = maxMatch(input)
        assertThat(result).isEqualTo(listOf("they", "are", "doing", "well", "y"))
    }
}
