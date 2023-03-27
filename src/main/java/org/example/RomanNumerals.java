package org.example;

import java.util.Map;

public class RomanNumerals {
    private static final Map<Integer, String> roman = Map.of(
            1, "I",
            4, "IV",
            5, "V",
            9, "IX",
            10, "X",
            49, "ID"
    );

    public static String transform(int number) {

        var romanIterator = RomanNumerals.roman.entrySet().stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey()
                        .reversed()).iterator();

        String numberTransformed = "";

        while (romanIterator.hasNext()) {
            var romanData = romanIterator.next();
            while (number >= romanData.getKey()) {
                numberTransformed += romanData.getValue();
                number -= romanData.getKey();
            }
        }

        return numberTransformed;
    }
}
