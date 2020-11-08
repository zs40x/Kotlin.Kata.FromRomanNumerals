import java.lang.Error

class FromRomanNumerals {

    fun convertToNumber(roman: String): Int {
        var latin =
            roman.asSequence().map { romanToNumber(it) }

        if (latin.count() > 1) return applySubtractionRule(latin).sum()
        else return latin.sum()
    }

    private fun romanToNumber(roman: Char) =
        when (roman) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            else -> {
                throw Error("Unexpected roman numeral character: $roman")
            }
        }

    private fun applySubtractionRule(numbers: Sequence<Int>) =
        numbers
            .windowed(size = 2, step = 2, partialWindows = true)
            .map {
                if (it[0] >= it[1]) it[0] + it[1] else it[1] - it[0]
            }
}