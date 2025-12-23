package five

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.math.BigInteger

class LastDigitOfALargeNumberTest {

    @Test
    fun scenarioOk1() {
        val inputA = BigInteger.valueOf(4)
        val inputB = BigInteger.valueOf(1)
        val result = lastDigit(inputA, inputB)
        assertEquals(4, result)
    }

    @Test
    fun scenarioOk2() {
        val inputA = BigInteger.valueOf(4)
        val inputB = BigInteger.valueOf(2)
        val result = lastDigit(inputA, inputB)
        assertEquals(6, result)
    }

    @Test
    fun scenarioOk3() {
        val inputA = BigInteger.valueOf(9)
        val inputB = BigInteger.valueOf(7)
        val result = lastDigit(inputA, inputB)
        assertEquals(9, result)
    }

    @Test
    fun scenarioOk4() {
        val inputA = BigInteger.valueOf(10)
        val inputB = BigInteger.valueOf(10000000000)
        val result = lastDigit(inputA, inputB)
        assertEquals(0, result)
    }
}
