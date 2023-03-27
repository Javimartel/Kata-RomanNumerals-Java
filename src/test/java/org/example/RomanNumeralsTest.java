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
    void number_fortynine_should_return_ID() {
        assertEquals(RomanNumerals.transform(49), "ID");
    }
}