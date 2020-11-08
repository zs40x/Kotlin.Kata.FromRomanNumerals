package de.sme.kataFromRomanNumeralsTests

import FromRomanNumerals
import org.junit.Test
import org.junit.Assert.*

class FromRomanNumeralsTests {

    @Test
    fun emptyStringReturns0() {
        assertEquals(0, runTest(""));
    }

    private fun runTest(roman: String) =
        FromRomanNumerals().convertToNumber(roman)
}