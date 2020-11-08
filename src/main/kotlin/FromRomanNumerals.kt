import java.lang.Error

class FromRomanNumerals {

    fun convertToNumber(roman: String) =
        roman.asSequence().map { romanToNumber(it) }.sum();

    private fun romanToNumber(roman: Char) =
        when (roman) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            else -> {
                throw Error("Unexpected roman numeral character: $roman")
            }
        }
}