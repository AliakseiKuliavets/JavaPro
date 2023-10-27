package lesson.lesson19;

import summarySession.friday220923.ForVsIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPal("mamam mamam"));
        int i = 12321;
        System.out.println(isPalNum(i));
        String s = "mama";
        String end = "ma";
        System.out.println(Arrays.toString(solution(s)));
        System.out.println(solution(s, end));
    }

    public static boolean isPal(String s) {
        StringBuilder revers = new StringBuilder(s);
        revers.reverse();
        return s.contentEquals(revers);
    }

    public static boolean isPalNum(int i) {
        if (i < 0) {
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

    public static String[] solution(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(String.valueOf(s.charAt(i)));
        }
        List<String> newList = new ArrayList<>();
        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size(); i += 2) {
                newList.add(list.get(i) + list.get(i + 1));
            }
        } else {
            for (int i = 0; i < list.size(); i += 2) {
                if (i == list.size() - 1) {
                    newList.add(list.get(i) + "_");
                } else {
                    newList.add(list.get(i) + list.get(i + 1));
                }
            }
        }
        return newList.toArray(new String[0]);
    }

    public static boolean solution(String str, String ending) {
        List<Character> listStringB = new ArrayList<>();
        int start = (str.length()-1) - (ending.length()-1);
        for (int i = start; i < str.length(); i++) {
            listStringB.add(str.charAt(i));
        }
        for (int i = 0; i < ending.length(); i++) {
            if (ending.charAt(i) == listStringB.get(i)) {
                return true;
            }
        }
        return false;
//        return str.endsWith(ending);
    }
}
