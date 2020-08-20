object Isogram {

    fun isIsogram(input: String) = input.toLowerCase()
            .filter { it.isLetter() }
            .let { it.toSet().size == it.length }
}
