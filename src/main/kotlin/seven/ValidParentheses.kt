package seven

fun validParentheses(str: String): Boolean {
    var balance = 0
    for (c in str) {
        if (c == '(') {
            balance++
        } else if (c == ')') {
            balance--
        }

        if (balance < 0) {
            return false
        }
    }
    return balance == 0
}
