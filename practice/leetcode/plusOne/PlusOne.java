package practice.leetcode.plusOne;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        long[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static long[] plusOne(long[] digits) {
        if (digits.length == 0) {
            return new long[]{1};
        }
        long result = 1;
        for (int i = digits.length - 1, n = 0; i >= 0 ; i--, n++) {
            int pos = (int)Math.pow(10,i);
            result += digits[n] * pos;
        }

        String numberString = Long.toString(result);
        char[] charArray = numberString.toCharArray();

        long[] intArray = new long[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }

        return intArray;
    }
}
