package eight

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumArrayTest {
    @Test
    fun sumArray() {
        val array = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
        val result = sumArray(array)
        assertEquals(15.0, result)
    }

    @Test
    fun sumEmptyArray() {
        val array = doubleArrayOf()
        val result = sumArray(array)
        assertEquals(0.0, result)
    }

}
