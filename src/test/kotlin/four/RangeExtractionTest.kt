package four

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RangeExtractionTest {

    @Test
    fun singleNumberTest() {
        assertEquals(
            "-6",
            rangeExtraction(intArrayOf(-6))
        )
    }

    @Test
    fun twoNumberTest() {
        assertEquals(
            "-6,-5",
            rangeExtraction(intArrayOf(-6, -5))
        )
    }

    @Test
    fun threeNumberTest() {
        assertEquals(
            "-6--4",
            rangeExtraction(intArrayOf(-6, -5, -4))
        )
    }

    @Test
    fun basicTest1() {
        assertEquals(
            "-6,-3-1,3-5,7-11,14,15,17-20",
            rangeExtraction(intArrayOf(-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20))
        )
    }

    @Test
    fun basicTest2() {
        assertEquals("-3--1,2,10,15,16,18-20", rangeExtraction(intArrayOf(-3, -2, -1, 2, 10, 15, 16, 18, 19, 20)))
    }
}
