package practice.leetcode.mergeTwoSortedLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        System.out.println(mergeList(list1,list2));
    }

    private static List<Integer> mergeList(List<Integer> list1, List<Integer> list2) {
        if ((list1.size() == 0) && (list2.size() == 0)) {
            return Collections.singletonList(0);
        }
        List<Integer> mrList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()){
            if (list1.get(i) <= list2.get(j)){
                mrList.add(list1.get(i));
                i++;
            } else {
                mrList.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()){
            mrList.add(list1.get(i));
            i++;
        }
        while (j < list2.size()){
            mrList.add(list2.get(j));
            j++;
        }
        return mrList;
    }
}
