package practice.leetcode.ExcelSheetColumn;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String convertToTitle1(int columnNumber) {
        List<Character> list = new ArrayList<>();
        for (Character c = 'A'; c <= 'Z'; c++) {
            list.add(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (columnNumber <= 26) {
            for (int i = 0; i < list.size(); i++) {
                if (columnNumber - 1 == i) {
                    stringBuilder.append(list.get(i));
                }
            }
            return String.valueOf(stringBuilder);
        } else {
            int first = columnNumber / 26;
            int sum = columnNumber % 26;
            for (int i = 0; i < list.size(); i++) {
                if (first - 1 == i) {
                    stringBuilder.append(list.get(i));
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (sum - 1 == i) {
                    stringBuilder.append(list.get(i));
                }
            }
            return String.valueOf(stringBuilder);
        }
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder columnName = new StringBuilder();

        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26;
            columnName.insert(0, (char) ('A' + remainder));
            columnNumber = (columnNumber - 1) / 26;
        }

        return columnName.toString();
    }

    public boolean isAcronym(List<String> words, String s) {
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) == s.charAt(i)) {
                count++;
            }
        }
        return count == s.length();
    }

    public int subtractProductAndSum(int n) {
        List<Integer> listInteger = new ArrayList<>();
        int tmp = n;
        while (tmp <= 0) {
            listInteger.add(tmp % 10);
            tmp = n / 10;
        }
        int sum = listInteger.stream().mapToInt(Integer::intValue).sum();
        int multip = 1;
        for (Integer integer : listInteger) {
            multip = multip * integer;
        }
        return multip - sum;
    }

    public static String removeDuplicates2(String s) {
        Map<String, Integer> stringLongMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i));
            stringLongMap.put(a, stringLongMap.getOrDefault(a, 0) + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : stringLongMap.entrySet()) {
            int map = entry.getValue() % 2;
            if (map == 1) {
                stringBuilder.append(entry.getKey());
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static String removeDuplicates(String s) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            stringList.add(String.valueOf(s.charAt(i)));
        }
        int j = 1;
        if (j <= stringList.size()) {
            for (int i = 0; i < stringList.size(); i++) {
                j += 2;
                if (stringList.get(i).equals(stringList.get(j))) {
                    stringList.remove(i);
                    stringList.remove(j);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s1 : stringList) {
            stringBuilder.append(s1);
        }
        return String.valueOf(stringBuilder);
    }

}

