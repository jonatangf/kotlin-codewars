package five

import java.math.BigInteger

fun lastDigit(base: BigInteger, exponent: BigInteger): Int {
    if (exponent == BigInteger.ZERO) {
        return 1
    }

    val lastDigitOfBase = (base % BigInteger.TEN).toInt()
    val exponentMod4 = (exponent % BigInteger.valueOf(4)).toInt()
    val effectiveExponent = if (exponentMod4 == 0) 4 else exponentMod4
    return BigInteger.valueOf(lastDigitOfBase.toLong()).pow(effectiveExponent).mod(BigInteger.TEN).toInt()
}
