import java.lang.Error

class FromRomanNumerals {

    fun convertToNumber(roman: String): Int {
        val latin = roman.asSequence().map { romanToNumber(it) }
        return if (latin.count() > 1) applySubtractionRule(latin).sum()
               else latin.sum()
    }

    private fun romanToNumber(roman: Char) =
        when (roman) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'M' -> 1000
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