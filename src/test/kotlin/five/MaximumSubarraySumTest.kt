package five

import org.junit.jupiter.api.Test

class MaximumSubarraySumTest {

    @Test
    fun scenarioOk1() {
        val input = listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        val result = maxSequence(input)
        assert(result == 6)
    }
}
