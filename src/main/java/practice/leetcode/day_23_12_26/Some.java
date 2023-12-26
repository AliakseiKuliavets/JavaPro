package practice.leetcode.day_23_12_26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Some {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        Map<Integer, String[]> integerListMap = new HashMap<>();
        integerListMap.put(2, new String[]{"a", "b", "c"});
        integerListMap.put(3, new String[]{"d", "e", "f"});
        integerListMap.put(4, new String[]{"g", "h", "i"});
        integerListMap.put(5, new String[]{"j", "k", "l"});
        integerListMap.put(6, new String[]{"m", "n", "o"});
        integerListMap.put(7, new String[]{"p", "q", "r", "s"});
        integerListMap.put(8, new String[]{"t", "u", "v"});
        integerListMap.put(9, new String[]{"w", "x", "y", "z"});


        int dig = Integer.parseInt(digits);

        List<Integer> listInt = new ArrayList<>();
        if (dig < 10) {
            return List.of(integerListMap.get(dig));
        } else {
            List<Integer> listReversInt = new ArrayList<>();
            int digit = dig;
            while (digit != 0) {
                int tmp = digit % 10;
                listReversInt.add(tmp);
                digit = digit / 10;
            }

            for (int i = listReversInt.size() - 1; i >= 0; i--) {
                listInt.add(listReversInt.get(i));
            }
        }

        int count = 1;
        for (Integer integer : listInt) {
            count = count * integerListMap.get(integer).length;
        }

        System.out.println(count);

        List<String> list = new ArrayList<>();
        for (Integer integer : listInt) {
            String[] strings = integerListMap.get(integer);
            for (String string : strings) {
                list.add(string);
                list.add(string);
                list.add(string);
            }
            break;
        }
        System.out.println(list);
        return null;
    }
}
