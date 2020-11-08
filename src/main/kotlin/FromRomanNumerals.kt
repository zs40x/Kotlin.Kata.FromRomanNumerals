class FromRomanNumerals {

    fun convertToNumber(roman: String) =
        roman.asSequence().map({ 1 }).sum();
}