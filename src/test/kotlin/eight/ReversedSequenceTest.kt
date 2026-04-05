package eight

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReversedSequenceTest {

    @Test
    fun reversedSequence0() {
        val result = reverseSeq(0)

        assertThat(result).isEmpty()
    }

    @Test
    fun reverseSequence1() {
        val result = reverseSeq(-1)

        assertThat(result).isEmpty()
    }

    @Test
    fun reverseSequence5() {
        val result = reverseSeq(5)

        assertThat(result).isEqualTo(listOf(5, 4, 3, 2, 1))
    }
}
