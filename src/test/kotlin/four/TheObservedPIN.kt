package four

val ADJACENT = mapOf(
    '0' to listOf('0', '8'),
    '1' to listOf('1', '2', '4'),
    '2' to listOf('1', '2', '3', '5'),
    '3' to listOf('2', '3', '6'),
    '4' to listOf('1', '4', '5', '7'),
    '5' to listOf('2', '4', '5', '6', '8'),
    '6' to listOf('3', '5', '6', '9'),
    '7' to listOf('4', '7', '8'),
    '8' to listOf('5', '7', '8', '9', '0'),
    '9' to listOf('6', '8', '9'),
)

fun getPINs(observed: String): List<String> {
    return observed.fold(listOf("")) { combinations, digit ->
        combinations.flatMap { prefix ->
            ADJACENT[digit]!!.map { adj -> prefix + adj }
        }
    }
}
