import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(startDate: LocalDateTime) {
    constructor(startDate: LocalDate) : this(startDate.atStartOfDay())

    val date: LocalDateTime = startDate.plusSeconds(1_000_000_000)
}
