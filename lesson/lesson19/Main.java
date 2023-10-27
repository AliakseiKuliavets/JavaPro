package lesson.lesson19;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPal("mamam mamam"));
        int i = 12321;
        System.out.println(isPalNum(i));
    }

    public static boolean isPal(String s) {
        StringBuilder revers = new StringBuilder(s);
        revers.reverse();
        return s.contentEquals(revers);
    }
    public static boolean isPalNum(int i) {
        if (i < 0){
            return false;
        }
        int reversed = 0;
        int tmp = i;

        while (tmp != 0) {
            int digit = tmp % 10;
            reversed = reversed * 10 + digit;
            tmp /= 10;

            System.out.println(digit);
        }

        System.out.println(reversed);

        return reversed == i;
    }
}
