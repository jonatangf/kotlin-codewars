package seven

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CleanUpAfterYourDogTest {

    @Test
    fun `clean when enough capacity for all crap`() {
        val garden = arrayOf(charArrayOf('_', '_', '_', '_'), charArrayOf('_', '_', '_', '@'), charArrayOf('_', '_', '@', '_'))
        assertEquals("Clean", crap(garden, bags = 2, cap = 2))
    }

    @Test
    fun `clean when exactly one crap and one bag`() {
        val garden = arrayOf(charArrayOf('_', '_', '_', '_'), charArrayOf('_', '_', '_', '@'), charArrayOf('_', '_', '_', '_'))
        assertEquals("Clean", crap(garden, bags = 1, cap = 1))
    }

    @Test
    fun `crap when not enough bags`() {
        val garden = arrayOf(charArrayOf('_', '_', '_', '_'), charArrayOf('_', '_', '_', '@'), charArrayOf('_', '_', '@', '_'))
        assertEquals("Cr@p", crap(garden, bags = 1, cap = 1))
    }

    @Test
    fun `dog when dog is present`() {
        val garden = arrayOf(charArrayOf('_', '_'), charArrayOf('_', '@'), charArrayOf('D', '_'))
        assertEquals("Dog!!", crap(garden, bags = 2, cap = 2))
    }

    @Test
    fun `clean when no crap at all`() {
        val garden = arrayOf(charArrayOf('_', '_', '_', '_'), charArrayOf('_', '_', '_', '_'), charArrayOf('_', '_', '_', '_'))
        assertEquals("Clean", crap(garden, bags = 2, cap = 2))
    }

    @Test
    fun `clean when capacity exactly matches crap count`() {
        val garden = arrayOf(charArrayOf('@', '@'), charArrayOf('@', '@'), charArrayOf('@', '@'))
        assertEquals("Clean", crap(garden, bags = 3, cap = 2))
    }

    @Test
    fun `dog takes priority over crap`() {
        val garden = arrayOf(charArrayOf('@', '@'), charArrayOf('@', '@'), charArrayOf('D', '@'))
        assertEquals("Dog!!", crap(garden, bags = 2, cap = 2))
    }
}
