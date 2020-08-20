class Squares(private val number: Int) {
    fun squareOfSum() = (1..number).sum().let { it * it }
    fun sumOfSquares() = (1..number).sumBy { it * it }
    fun difference() = squareOfSum() - sumOfSquares()
}
