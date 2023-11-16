package practice.leetcode.kataArrayDiff;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Some {
    public static int[] arrayDiff(int[] a, int[] b) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : a) {
            String s = String.valueOf(i);
            stringBuilder.append(s);
        }
        String arrayA = String.valueOf(stringBuilder);
        for (int j : b) {
            String elemB = String.valueOf(j);
            if (arrayA.contains(elemB)) {
                arrayA = arrayA.replaceAll(elemB, "");
            }
        }
        a = new int[arrayA.length()];
        for (int i = 0; i < arrayA.length(); i++) {
            int newA = Integer.parseInt(String.valueOf(arrayA.charAt(i)));
            a[i] = newA;
        }
//        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
//        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
//        listA.removeAll(listB);
//        return listA.stream().mapToInt(e -> e).toArray();
        return a;
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || b.length != a.length) {
            throw new IllegalArgumentException();
        }
        // Create a copy of array 'a' to avoid modifying the original array
        int[] squaredA = Arrays.copyOf(a, a.length);

        // Square each element in array 'a'
        for (int i = 0; i < squaredA.length; i++) {
            squaredA[i] = squaredA[i] * squaredA[i];
        }

        // Sort both arrays after squaring the elements
        Arrays.sort(squaredA);
        Arrays.sort(b);

        return Arrays.equals(squaredA, b);
    }

}
