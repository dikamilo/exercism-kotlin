object Raindrops {

    fun convert(drops: Int) = buildString {
        if (drops % 3 == 0) append("Pling")
        if (drops % 5 == 0) append("Plang")
        if (drops % 7 == 0) append("Plong")
        if (isEmpty()) append(drops)
    }
}
