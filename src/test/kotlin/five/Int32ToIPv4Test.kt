package five

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Int32ToIPv4Test {
    @Test
    fun `should convert 2154959208 to 128_114_17_104`() {
        assertEquals("128.114.17.104", longToIP(2154959208u))
    }

    @Test
    fun `should convert 0 to 0_0_0_0`() {
        assertEquals("0.0.0.0", longToIP(0u))
    }

    @Test
    fun `should convert 2149583361 to 128_32_10_1`() {
        assertEquals("128.32.10.1", longToIP(2149583361u))
    }
}
