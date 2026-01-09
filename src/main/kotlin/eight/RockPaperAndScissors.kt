package eight

infix fun String.beats(who: String) = this to who

// https://www.codewars.com/kata/5672a98bdbdd995fad00000f
fun rps(p1: String, p2: String): String {
    if (p1 == p2) {
        return "Draw!"
    }

    val winsAgainst = mapOf(
        "rock" beats "scissors",
        "scissors" beats "paper",
        "paper" beats "rock"
    )

    val winnerNumber = if (winsAgainst[p1] == p2) 1 else 2
    return "Player $winnerNumber won!"
}
