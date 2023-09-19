package homeWork._13_09_23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listArray = new ArrayList<>();
        listArray.add(23);
        listArray.add(13);
        listArray.add(14);
        listArray.add(1);
        listArray.add(9);
        listArray.add(23);

        List<Integer> listLinked = new LinkedList<>();
        listLinked.add(23);
        listLinked.add(13);
        listLinked.add(14);
        listLinked.add(1);
        listLinked.add(9);
        listLinked.add(23);


        ExEx ex = new ExEx();


        System.out.println(ex.getSum(listArray));
        System.out.println(ex.getAvg(listLinked));
    }
}
