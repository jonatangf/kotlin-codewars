package six

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EncryptThisTest {
    @Test
    fun `encrypt wise old owl sentence`() {
        assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka", encryptThis("A wise old owl lived in an oak"))
    }

    @Test
    fun `encrypt the more he saw sentence`() {
        assertEquals("84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp", encryptThis("The more he saw the less he spoke"))
    }

    @Test
    fun `encrypt the less he spoke sentence`() {
        assertEquals("84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare", encryptThis("The less he spoke the more he heard"))
    }

    @Test
    fun `encrypt wise old bird sentence`() {
        assertEquals("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri", encryptThis("Why can we not all be like that wise old bird"))
    }

    @Test
    fun `encrypt thank you Piotr sentence`() {
        assertEquals("84kanh 121uo 80roti 102ro 97ll 121ruo 104ple", encryptThis("Thank you Piotr for all your help"))
    }
}
