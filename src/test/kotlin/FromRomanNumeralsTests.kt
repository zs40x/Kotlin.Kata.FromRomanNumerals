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

    @Test
    fun romanIXis9() =
        assertEquals(9, runTest("IX"))

    @Test
    fun romanXLIIis42() =
        assertEquals(42, runTest("XLII"))

    @Test
    fun romanXCIXis99() =
        assertEquals(99, runTest("XCIX"))

    @Test
    fun romanMMXIIIis2013() =
        assertEquals(2013, runTest("MMXIII"))

    private fun runTest(roman: String) =
        FromRomanNumerals().convertToNumber(roman)
}