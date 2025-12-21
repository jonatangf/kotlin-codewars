package seven

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HighAndLowTest {

    @Test
    fun scenarioOk1() {
        val input = "1 2 3 4 5"
        val result = highAndLow(input)
        assertThat(result).isEqualTo("5 1")
    }

    @Test
    fun scenarioOk2() {
        val input = "1 2 -3 4 5"
        val result = highAndLow(input)
        assertThat(result).isEqualTo("5 -3")
    }
}
