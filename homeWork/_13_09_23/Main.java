package homeWork._13_09_23;

import java.util.ArrayList;
import java.util.Collections;
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

        List<String> arrayString = new ArrayList<>();
        arrayString.add("AAA");
        arrayString.add("A1bbb");
        arrayString.add("CCC");
        arrayString.add("eee");
        arrayString.add("DDD");

        List<String> linkedString = new LinkedList<>();
        linkedString.add("AAAaaa");
        linkedString.add("bbbs");
        linkedString.add("CCCawda");
        linkedString.add("eawdaee");
        linkedString.add("DawdaawdDD");

        List<House> houseList = new ArrayList<>();
        Collections.addAll(houseList,
                new House(3, 1, "New York"),
                new House(13, 2, "Berlin"),
                new House(4, 3, "Toronto"),
                new House(9, 4, "Madrid")
        );

        List<House> houseListLinked = new LinkedList<>();
        Collections.addAll(houseListLinked,
                new House(3, 1, "New York"),
                new House(13, 2, "Berlin"),
                new House(4, 3, "Toronto"),
                new House(9, 4, "Madrid")
        );

        ExEx ex = new ExEx();

        // Уровень сложности 5 из 10:
//        System.out.println(ex.getSum(listArray));
//        System.out.println(ex.getAvg(listLinked));
//        ex.getSome(arrayString);
//        System.out.println(ex.getSomeLong(linkedString));
//        ex.getHouse5by10(houseList);

        // Уровень сложности 6 из 10:
//        System.out.println(ex.getIntegerMin(listArray));
//        System.out.println(ex.getIntegerMax(listLinked));
//        System.out.println(ex.getWordStartWidthLeter(arrayString,"A"));
//        ex.getFirstInputText(linkedString,"bbbs");
//        ex.returnClearObject(houseListLinked,"Berlin");

        //Уровень сложности 7 из 10:
//        ex.getOddInteger(listArray);
//        ex.getConvertTreeToZero(listLinked);
//        ex.convertInOneString(arrayString);
//        ex.deleteStringIfHaveThatString(linkedString,"bbbs");
//        ex.listConditions(houseListLinked,"Berlin");

        //Уровень сложности 8 из 10:
//        ex.getSquareInteger(listArray);
//        System.out.println(ex.getMultiplyingAllNumbers(listLinked));
//        System.out.println(ex.getShortString(arrayString));
//        ex.replaceVowels(arrayString);
//        ex.sortInDescendingOrder(houseListLinked);

        // Уровень сложности 9 из 10:
//        System.out.println(ex.getNextTheBigersNumber(listArray));
//        ex.getReverseOrder(listLinked);
        ex.containOnlyLetters(arrayString);
    }
}
