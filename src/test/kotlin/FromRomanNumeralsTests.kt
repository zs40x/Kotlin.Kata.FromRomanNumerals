package de.sme.kataFromRomanNumeralsTests

import FromRomanNumerals
import org.junit.Test
import org.junit.Assert.*

class FromRomanNumeralsTests {

    @Test
    fun emptyStringReturns0() {
        assertEquals(0, runTest(""));
    }

    @Test
    fun romanIis1() =
       assertEquals(1, runTest("I"))

    @Test
    fun romanIIis2() =
        assertEquals(2, runTest("II"))

    @Test
    fun romanVIis6() =
        assertEquals(6, runTest("VI"))

    @Test
    fun romanVis5() =
        assertEquals(5, runTest("V"))

    private fun runTest(roman: String) =
        FromRomanNumerals().convertToNumber(roman)
}