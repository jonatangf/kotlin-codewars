package seven

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ValidParenthesesTest {

    @Test
    fun scenarioOk1() {
        val input = "()"
        val result = validParentheses(input)
        assertThat(result).isTrue()
    }

    @Test
    fun scenarioOk2() {
        val input = ")(()))"
        val result = validParentheses(input)
        assertThat(result).isFalse()
    }

    @Test
    fun scenarioOk3() {
        val input = "("
        val result = validParentheses(input)
        assertThat(result).isFalse()
    }

    @Test
    fun scenarioOk4() {
        val input = "(())((()())())"
        val result = validParentheses(input)
        assertThat(result).isTrue()
    }
}
