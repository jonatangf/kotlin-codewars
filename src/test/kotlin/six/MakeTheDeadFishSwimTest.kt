package six

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MakeTheDeadFishSwimTest {

    @Test
    fun scenarioOk1() {
        val input = "iiisdoso"
        val result = parse(input)
        result.size == 2
        assertEquals(8, result[0])
        assertEquals(64, result[1])
    }

    @Test
    fun scenarioOk2() {
        val input = "iiisdosodddddiso"
        val result = parse(input)
        result.size == 3
        assertEquals(8, result[0])
        assertEquals(64, result[1])
        assertEquals(3600, result[2])
    }
}
