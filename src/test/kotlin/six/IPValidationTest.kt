package six

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class IPValidationTest {

    @Test
    fun scenarioEmpty() {
        val input = ""
        val result = isValidIp(input)
        assertFalse(result)
    }

    @Test
    fun scenarioOk1() {
        val input = "1.2.3.4"
        val result = isValidIp(input)
        assertTrue(result)
    }

    @Test
    fun scenarioOk2() {
        val input = "256.100.50.0"
        val result = isValidIp(input)
        assertFalse(result)
    }

    @Test
    fun scenarioNoOk1() {
        val input = "12.+34.56.78"
        val result = isValidIp(input)
        assertFalse(result)
    }
}
