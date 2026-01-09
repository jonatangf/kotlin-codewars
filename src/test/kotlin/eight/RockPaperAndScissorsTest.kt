package eight

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class RockPaperAndScissorsTest {

    @Test
    @DisplayName("Should return \"Player 1 won!\"")
    fun player1ShouldWin() {
        assertThat(rps("rock", "scissors")).isEqualTo("Player 1 won!")
    }

    @Test
    @DisplayName("Should return \"Player 2 won!\"")
    fun player2ShouldWin() {
        assertThat(rps("scissors", "rock")).isEqualTo("Player 2 won!")
    }

    @Test
    @DisplayName("Should return \"Draw!\"")
    fun shouldReturnDraw() {
        assertThat(rps("scissors", "scissors")).isEqualTo("Draw!")
    }
}
