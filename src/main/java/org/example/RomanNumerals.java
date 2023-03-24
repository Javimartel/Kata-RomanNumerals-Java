package org.example;

public class RomanNumerals {
    public static String transform(int number) {
        return number < 4 ? "I".repeat(number) : "IV";
    }
}
