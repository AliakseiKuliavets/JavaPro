package lesson.lesson22.taski;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

public class Methods {
    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "##aaaa##";
        System.out.println(twoStringEquals(s1, s2));
    }

    public static String count(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        StringBuilder result = new StringBuilder();
        int backspaceCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                backspaceCount++;
            } else if (backspaceCount > 0) {
                backspaceCount--;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static boolean twoStringEquals(String s1, String s2) {
        return count(s1).equals(count(s2));
    }

    static String toCamelCase(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == '_') {
                String c = String.valueOf(s.charAt(i + 1));
                result.append(c.toUpperCase());
                i++;
            } else {
                result.append(s.charAt(i));
            }
        }
        return String.valueOf(result);
    }

    static int sum = 0;

    public static int digital_root(int n) {
        int sum2 = 0;
        int temp = n;
        while (temp != 0) {
            sum2 = sum2 + temp % 10;
            temp = temp / 10;
        }
        sum = sum2;
        if (sum2 > 9) {
            digital_root(sum);
        }
        return sum;
    }

    static String encode(String word) {
        word = word.toLowerCase(); // Ignore capitalization
        Map<Character, Integer> characterMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            characterMap.put(c, characterMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (characterMap.get(c) > 1) {
                result.append(')');
            } else {
                result.append('(');
            }
        }

        return result.toString();
    }

    public static String order(String words) {
        if (words == null) {
            throw new IllegalArgumentException();
        }
        if (words.equals("")) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        String[] stringList = words.split("\\s");
        String[] arrayString = new String[stringList.length];
        for (int i = 0; i < stringList.length; i++) {
            for (int j = 0; j < stringList[i].length(); j++) {
                if (Character.isDigit(stringList[i].charAt(j))) {
                    int n = Integer.parseInt(String.valueOf(stringList[i].charAt(j)));
                    arrayString[n - 1] = stringList[i];
                }
            }
        }
        for (int i = 0; i < arrayString.length; i++) {
            result.append(arrayString[i]);
            if (i < arrayString.length - 1) {
                result.append(" ");
            }
        }
        return String.valueOf(result);
    }

    public static String solution(int n) {
        if (n < 1 || n > 3999) {
            throw new IllegalArgumentException("Input must be between 1 and 3999 (inclusive).");
        }

        String[] romanSymbols = {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        int[] romanValues = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < romanSymbols.length; i++) {
            while (n >= romanValues[i]) {
                result.append(romanSymbols[i]);
                n -= romanValues[i];
            }
        }

        return result.toString();
    }

    public static String incrementString(String str) {
        if (str == null || str.isEmpty()) {
            return "1";
        }

        String[] parts = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

        if (parts.length == 2) {
            String nonDigitPart = parts[0];
            String digitPart = parts[1];

            int number = Integer.parseInt(digitPart) + 1;
            String formattedNumber = String.format("%0" + digitPart.length() + "d", number);

            return nonDigitPart + formattedNumber;
        } else {
            return str + "1";
        }
    }
}
