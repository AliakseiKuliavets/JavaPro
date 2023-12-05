package practice.leetcode.day_23_12_05;

import java.util.*;

public class Some {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
        String[] s = {"cool", "lock", "cook"};
        String[] s1 = {"bella", "label", "roller"};
        System.out.println(commonChars(s));
        System.out.println(commonChars(s1));
//        System.out.println(addStrings("11", "123"));
        System.out.println(addStrings("456", "77"));
    }

    public static boolean isPowerOfThree(int n) {
        if (n < 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }

    public static int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;
        int last = 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (count == last) {
                last = i;
                count = 0;
            }
            res[i] = res[count++] + 1;

        }
        return res;
    }

    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        s += s;
        return s.contains(goal);
    }

    public static List<String> commonChars(String[] words) {
        List<HashMap<Character, Integer>> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (String word : words) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int k = 0; k < word.length(); k++) {
                if (!map.containsKey(word.charAt(k)))
                    map.put(word.charAt(k), 1);
                else
                    map.put(word.charAt(k), (map.get(word.charAt(k)) + 1));
            }
            list1.add(map);
        }
        for (char c : list1.get(0).keySet()) {
            int min = list1.get(0).get(c);
            int flag = 0;
            for (HashMap<Character, Integer> e : list1) {
                if (!e.containsKey(c)) {
                    flag = 1;
                    break;
                } else
                    min = Math.min(min, e.get(c));
            }
            if (flag == 0) {
                for (int m = 0; m < min; m++)
                    list2.add(String.valueOf(c));
            }
        }
        return list2;
    }

    public static String addStrings(String num1, String num2) {
        if (num1.length() > num2.length()) {
            String tmp = num2;
            num2 = num1;
            num1 = tmp;
        }
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= num2.length(); i++) {
            int a = 0;
            if (i <= num1.length()) {
                a = num1.charAt(num1.length() - i) - 48;
            }
            int b = num2.charAt(num2.length() - i) - 48;
            while (count != 0) {
                count--;
                b++;
            }
            int c = a + b;
            if (c > 9) {
                while (c != 10) {
                    count++;
                    c--;
                }
                c = 0;
            }
            stringBuilder.insert(0,c);
        }
        return String.valueOf(stringBuilder);
    }
}
