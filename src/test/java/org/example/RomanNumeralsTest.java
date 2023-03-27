package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {
    @Test
    void number_one_should_return_I() {
        assertEquals(RomanNumerals.transform(1), "I");
    }

    @Test
    void number_two_should_return_II() {
        assertEquals(RomanNumerals.transform(2), "II");
    }

    @Test
    void number_three_should_return_III() {
        assertEquals(RomanNumerals.transform(3), "III");
    }

    @Test
    void number_four_should_return_IV() {
        assertEquals(RomanNumerals.transform(4), "IV");
    }

    @Test
    void number_five_should_return_V() {
        assertEquals(RomanNumerals.transform(5), "V");
    }

    @Test
    void number_nine_should_return_IX() {
        assertEquals(RomanNumerals.transform(9), "IX");
    }

    @Test
    void number_ten_should_return_X() {
        assertEquals(RomanNumerals.transform(10), "X");
    }

    @Test
    void number_forty_nine_should_return_XLIX() {
        assertEquals(RomanNumerals.transform(49), "XLIX");
    }

    @Test
    void number_fifty_should_return_L() {
        assertEquals(RomanNumerals.transform(50), "L");
    }

    @Test
    void number_ninety_should_return_XC() {
        assertEquals(RomanNumerals.transform(90), "XC");
    }

    @Test
    void number_ninety_nine_should_return_XCIX() {
        assertEquals(RomanNumerals.transform(99), "XCIX");
    }

    @Test
    void number_one_hundred_should_return_C() {
        assertEquals(RomanNumerals.transform(100), "C");
    }

    @Test
    void number_four_hundred_should_return_CD() {
        assertEquals(RomanNumerals.transform(400), "CD");
    }

    @Test
    void number_five_hundred_should_return_D() {
        assertEquals(RomanNumerals.transform(500), "D");
    }

    @Test
    void number_nine_hundred_should_return_CM() {
        assertEquals(RomanNumerals.transform(900), "CM");
    }

    @Test
    void number_one_thousand_should_return_M() {
        assertEquals(RomanNumerals.transform(1000), "M");
    }

    @Test
    void number_three_thousand_should_return_exception() {
        assertThrows(RomanNumberMaximumException.class, () -> RomanNumerals.transform(3000));
    }
}