package practice.leetcode.day_23_12_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Some {
    public static void main(String[] args) {
        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> stringList = new ArrayList<>();
        int minDistance = -1;
        for (int i = 0; i < list1.length; i++) {
            for (int j =  0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])){
                    if (minDistance < j - 1) {
                        stringList.add(list1[i]);
                        minDistance = j - 1;
                    }
                }
            }
        }
        System.out.println(stringList);
        return null;
    }
}
