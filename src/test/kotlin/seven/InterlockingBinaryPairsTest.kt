package seven

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class InterlockingBinaryPairsTest {

    @ParameterizedTest(name = "interlocking({0}, {1}) = {2}")
    @DisplayName("Sample tests")
    @CsvSource(
        "4, 9, true",
        "3, 6, false",
        "2, 5, true",
        "7, 1, false",
        "0, 8, true"
    )
    fun sampleTests(a: Long, b: Long, expected: Boolean) {
        assertEquals(expected, interlocking(a, b), "interlocking($a, $b)")
    }
}
