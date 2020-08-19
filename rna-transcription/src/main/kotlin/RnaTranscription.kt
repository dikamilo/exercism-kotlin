fun Char.transcribe() = when (this) {
    'G' -> 'C'
    'C' -> 'G'
    'T' -> 'A'
    'A' -> 'U'
    else -> this
}

fun transcribeToRna(dna: String) = dna.map(Char::transcribe).joinToString("")
