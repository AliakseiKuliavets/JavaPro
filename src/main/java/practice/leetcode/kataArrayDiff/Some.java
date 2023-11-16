package practice.leetcode.kataArrayDiff;


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

}
