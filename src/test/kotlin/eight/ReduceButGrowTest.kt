package eight

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReduceButGrowTest {

    @Test
    fun scenarioOk1() {
        val arr = intArrayOf(1, 2, 3)
        val result = grow(arr)
        assertThat(result).isEqualTo(6)
    }

    @Test
    fun scenarioOk2() {
        val arr = intArrayOf(1, 2, 3, 4)
        val result = grow(arr)
        assertThat(result).isEqualTo(24)
    }

    @Test
    fun growTestWithZero() {
        val arr = intArrayOf(1, 2, 0, 4)
        val result = grow(arr)
        assertThat(result).isZero()
    }
}
