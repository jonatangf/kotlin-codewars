package five

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ZonkGameTest {

    // Single dice (no score)

    @Test
    @DisplayName("Single two")
    fun testTwo() {
        doTest(intArrayOf(2), 0)
    }

    @Test
    @DisplayName("Single three")
    fun testThree() {
        doTest(intArrayOf(3), 0)
    }

    @Test
    @DisplayName("Single four")
    fun testFour() {
        doTest(intArrayOf(4), 0)
    }

    // Single dice (with score)

    @Test
    @DisplayName("Single one")
    fun testOne() {
        doTest(intArrayOf(1), 100)
    }

    @Test
    @DisplayName("Single five")
    fun testFive() {
        doTest(intArrayOf(5), 50)
    }

    // Pairs (no triplet)

    @Test
    @DisplayName("Two twos")
    fun testTwoTwos() {
        doTest(intArrayOf(2, 2), 0)
    }

    @Test
    @DisplayName("Two ones")
    fun testTwoOnes() {
        doTest(intArrayOf(1, 1), 200)
    }

    @Test
    @DisplayName("One and five")
    fun testFiveAndOne() {
        doTest(intArrayOf(5, 1), 150)
    }

    // Triplets

    @Test
    @DisplayName("Three ones")
    fun testThreeOnes() {
        doTest(intArrayOf(1, 1, 1), 1000)
    }

    @Test
    @DisplayName("Three twos")
    fun testThreeTwos() {
        doTest(intArrayOf(2, 2, 2), 200)
    }

    @Test
    @DisplayName("Three threes")
    fun testThreeThrees() {
        doTest(intArrayOf(3, 3, 3), 300)
    }

    @Test
    @DisplayName("Three fours")
    fun testThreeFours() {
        doTest(intArrayOf(4, 4, 4), 400)
    }

    @Test
    @DisplayName("Three fives")
    fun testThreeFives() {
        doTest(intArrayOf(5, 5, 5), 500)
    }

    @Test
    @DisplayName("Three sixes")
    fun testThreeSixes() {
        doTest(intArrayOf(6, 6, 6), 600)
    }

    // Four of a kind

    @Test
    @DisplayName("Four ones")
    fun testFourOnes() {
        doTest(intArrayOf(1, 1, 1, 1), 2000)
    }

    @Test
    @DisplayName("Four twos")
    fun testFourTwos() {
        doTest(intArrayOf(2, 2, 2, 2), 400)
    }

    @Test
    @DisplayName("Four threes")
    fun testFourThrees() {
        doTest(intArrayOf(3, 3, 3, 3), 600)
    }

    // Five of a kind

    @Test
    @DisplayName("Five ones")
    fun testFiveOnes() {
        doTest(intArrayOf(1, 1, 1, 1, 1), 3000)
    }

    @Test
    @DisplayName("Five twos")
    fun testFiveTwos() {
        doTest(intArrayOf(2, 2, 2, 2, 2), 600)
    }

    // Six of a kind

    @Test
    @DisplayName("Six ones")
    fun testSixOnes() {
        doTest(intArrayOf(1, 1, 1, 1, 1, 1), 4000)
    }

    @Test
    @DisplayName("Six twos")
    fun testSixTwos() {
        doTest(intArrayOf(2, 2, 2, 2, 2, 2), 800)
    }

    // Special combinations

    @Test
    @DisplayName("Straight 1-6")
    fun testOneToSix() {
        doTest(intArrayOf(1, 2, 3, 4, 5, 6), 1000)
    }

    @Test
    @DisplayName("Three pairs")
    fun testThreePairs() {
        doTest(intArrayOf(2, 2, 3, 3, 6, 6), 750)
    }

    // Mixed combinations (triplet + singles)

    @Test
    @DisplayName("Three threes plus five")
    fun testThreeThreesPlusFive() {
        doTest(intArrayOf(3, 3, 5, 3), 350)
    }

    @Test
    @DisplayName("Three ones plus two fives")
    fun testThreeOnesPlusTwoFives() {
        doTest(intArrayOf(1, 5, 1, 5, 1), 1100)
    }

    @Test
    @DisplayName("Mixed dice with one and five")
    fun testMixedWithOneAndFive() {
        doTest(intArrayOf(5, 6, 3, 2, 1), 150)
    }

    // No scoring / edge cases

    @Test
    @DisplayName("No scoring combination")
    fun testNoScoringCombination() {
        doTest(intArrayOf(3, 2, 6, 4, 4, 6), 0)
    }

    @Test
    @DisplayName("Not a straight with duplicate five")
    fun testNotStraightDuplicateFive() {
        doTest(intArrayOf(1, 2, 3, 4, 5, 5), 200)
    }

    @Test
    @DisplayName("Not a straight with duplicate three")
    fun testNotStraightDuplicateThree() {
        doTest(intArrayOf(4, 5, 3, 3, 2, 1), 150)
    }

    private fun doTest(dice: IntArray, expected: Int) {
        assertEquals(expected, getScore(dice), "(" + dice.joinToString() + ")")
    }
}
