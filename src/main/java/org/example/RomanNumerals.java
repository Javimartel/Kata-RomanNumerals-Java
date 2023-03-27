package org.example;

import java.util.Map;

public class RomanNumerals {
    private static final Map<Integer, String> roman = Map.ofEntries(
            Map.entry(1, "I"),
            Map.entry(4, "IV"),
            Map.entry(5, "V"),
            Map.entry(9, "IX"),
            Map.entry(10, "X"),
            Map.entry(40, "XL"),
            Map.entry(49, "IL"),
            Map.entry(50, "L"),
            Map.entry(90, "XC"),
            Map.entry(100, "C"),
            Map.entry(400, "CD")
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
