package org.example;

import java.util.List;
import java.util.Map;

public class RomanNumerals {
    private static final Map<Integer, String> roman = Map.ofEntries(
            Map.entry(1, "I"),
            Map.entry(4, "IV"),
            Map.entry(5, "V"),
            Map.entry(9, "IX"),
            Map.entry(10, "X"),
            Map.entry(40, "XL"),
            Map.entry(50, "L"),
            Map.entry(90, "XC"),
            Map.entry(100, "C"),
            Map.entry(400, "CD"),
            Map.entry(500, "D"),
            Map.entry(900, "CM"),
            Map.entry(1000, "M")
    );
    public static final int MAX_ROMAN_NUMBER = 3000;

    public static String transform(int number) throws RomanNumberMaximumException {
        checkThatIsAValid(number);

        var romanList = transformRomanMapToList();
        StringBuilder romanNumber = new StringBuilder();
        int index = 0;

        while (number > 0) {
            var romanData = romanList.get(index);
            index += number < romanData.getKey() ? 1 : 0;
            if (number >= romanData.getKey()) {
                romanNumber.append(romanData.getValue());
                number -= romanData.getKey();
            }
        }

        return romanNumber.toString();
    }

    private static void checkThatIsAValid(int number) throws RomanNumberMaximumException {
        if (number > MAX_ROMAN_NUMBER) {
            throw new RomanNumberMaximumException("The maximum roman number is 3000");
        }
    }

    private static List<Map.Entry<Integer, String>> transformRomanMapToList() {
        return RomanNumerals.roman.entrySet().stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey()
                        .reversed()).toList();
    }
}
