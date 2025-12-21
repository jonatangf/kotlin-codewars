package seven

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfArraySinglesTest {

    @Test
    fun scenarioOk1() {
        val arr = intArrayOf(1, 2, 3, 2, 4, 1, 5)
        val result = repeats(arr)
        assertEquals(12, result)
    }

    @Test
    fun scenarioOk2() {
        val arr = intArrayOf(4, 5, 7, 5, 4, 8)
        val result = repeats(arr)
        assertEquals(15, result)
    }
}
