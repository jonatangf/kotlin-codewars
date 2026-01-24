package six

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PIApproximationTest {

    @Test
    fun basicTests() {
        testing(0.1, "[10, 3.0418396189]")
        testing(0.01, "[100, 3.1315929036]")
        testing(0.001, "[1000, 3.1405926538]")
    }

    private fun testing(epsilon: Double, expect: String) {
        val actual: String = PIApproximation.iterPi2String(epsilon)
        assertEquals(expect, actual)
    }
}
