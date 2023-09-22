package summarySession.friday220923;

import java.util.ArrayList;
import java.util.List;

public class ForVsIterator {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Tree");

        List<String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Two");
        list2.add("Tree");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
