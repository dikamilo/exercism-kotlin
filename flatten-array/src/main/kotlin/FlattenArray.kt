object Flattener {
    fun flatten(nestedList: Collection<Any?>): List<Any> = nestedList.flatMap {
        when (it) {
            is Collection<Any?> -> flatten(it)
            else -> listOf(it)
        }
    }.filterNotNull()
}
