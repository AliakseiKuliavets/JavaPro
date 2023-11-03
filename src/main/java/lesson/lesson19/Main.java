package lesson.lesson19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    private static int count = 0;

    public static void main(String[] args) {
//        System.out.println(isPal("mamam mamam"));
//        int i = 12321;
//        System.out.println(isPalNum(i));
//        String s = "mama";
//        String end = "ma";
//        System.out.println(Arrays.toString(solution(s)));
//        System.out.println(solution(s, end));
//        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
//        System.out.println(uglifyWord("qwe123asdf456zxc"));
//        System.out.println();
//        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
//        System.out.println(nbYearY(1500000, 2.5, 10000, 2000000));
//        System.out.println(findEvenIndex(new int[]{4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
        System.out.println(duplicateCount("indivisibility"));

    }

    public static int duplicateCountS(String text) {
        List<String> list = new ArrayList<>();
        List<String> listNew = new ArrayList<>();
        for (int i = 0; i < text.toLowerCase().length(); i++) {
            list.add(String.valueOf(text.charAt(i)));
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    listNew.add(list.get(i));
                }
            }
        }
        return (int) listNew.stream().distinct().count();
    }
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        Set<Character> set = new HashSet<>();
        Set<Character> dubl = new HashSet<>();
        for (Character c : text.toCharArray()){
            if (set.contains(c)){
                dubl.add(c);
            }else {
                set.add(c);
            }
        }
        return dubl.size();
    }

    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += arr[j];
            }
            for (int j = arr.length - 1; j > i; j--) {
                sumRight += arr[j];
            }
            if (sumLeft == sumRight) {
                return i;
            }
        }
        return -1;
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        if (p0 >= p) {
            return p0;
        }
        count++;
        int newPopulation = (int) (p0 * (1 + percent / 100)) + aug;
        nbYear(newPopulation, percent, aug, p);
        return count;
    }

    public static int nbYearY(int p0, double percent, int aug, int p) {
        int count = 0; // Initialize the count variable
        while (p0 < p) {
            p0 += (int) (p0 * (percent / 100)) + aug;
            count++;
        }
        return count;
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
        int start = (str.length() - 1) - (ending.length() - 1);
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

    public static boolean isValid(char[] walk) {
        return walk.length == 10;
    }

    public static String uglifyWord(String str) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (flag) {
                    sb.append(Character.toUpperCase(str.charAt(i)));
                    flag = false;
                } else if (!flag) {
                    sb.append(Character.toLowerCase(str.charAt(i)));
                    flag = true;
                }
            } else {
                sb.append(str.charAt(i));
                flag = true;
            }
        }
        return String.valueOf(sb);
    }


}