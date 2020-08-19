object Acronym {
    fun generate(phrase: String) = phrase.split(" ", "-", "_")
            .mapNotNull { it.firstOrNull() }
            .joinToString("")
            .toUpperCase()
}
