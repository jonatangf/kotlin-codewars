package six

object PIApproximation {
    fun iterPi2String(epsilon: Double): String {
        var piApproximation = 1.0
        var iteration = 0
        var denominator = 3

        while (kotlin.math.abs(piApproximation * 4.0 - Math.PI) >= epsilon) {
            if (iteration % 2 == 0) {
                piApproximation -= 1.0 / denominator
            } else {
                piApproximation += 1.0 / denominator
            }
            denominator += 2
            iteration++
        }
        return "[${(iteration + 1)}, ${"%.10f".format(piApproximation * 4.0)}]"
    }
}
