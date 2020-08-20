import kotlin.math.hypot

object Darts {

    fun score(x: Number, y: Number): Int {
        val score = hypot(x.toDouble(), y.toDouble())

        return when {
            score <= 1.0 -> 10
            score <= 5.0 -> 5
            score <= 10.0 -> 1
            else -> 0
        }
    }
}
