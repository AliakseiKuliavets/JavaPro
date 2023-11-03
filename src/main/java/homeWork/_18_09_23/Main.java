package homeWork._18_09_23;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TaskiEx taskiEx = new TaskiEx();

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Mik", 34123456);
        hashMap.put("Nik", 34123457);
        hashMap.put("Jane", 34123458);
        hashMap.put("Paul", 34123459);
        hashMap.put("Anna", 34123460);
        hashMap.put("Al1la", 34123461);
        hashMap.put("Vera", 34123462);

        Map<String , Integer> treeMap = new TreeMap<>();
        treeMap.put("Mik", 49123456);
        treeMap.put("Nik", 49123457);
        treeMap.put("Jane", 49123458);
        treeMap.put("Paul", 49123459);
        treeMap.put("Anna", 49123460);
        treeMap.put("Al1la", 49123461);
        treeMap.put("Vera", 49123463);

//        taskiEx.iterateMap(hashMap, treeMap);
//        System.out.println("----------------------------------------");
//        taskiEx.sumOfTheirLengths(hashMap, treeMap);
//        System.out.println("----------------------------------------");
//        taskiEx.averageValue(hashMap, treeMap);
//        System.out.println("----------------------------------------");
//        taskiEx.findTheKeyWithMaximumValue(hashMap);
//        System.out.println("----------------------------------------");
//        taskiEx.findKeyWithMinimumValue(treeMap);
//        System.out.println("----------------------------------------");
//        taskiEx.removeAllElementsWithEvenValues(hashMap);
//        System.out.println("----------------------------------------");
//        taskiEx.removeAllElementsStartingWithTheLetterA(treeMap);
//        System.out.println("----------------------------------------");
        taskiEx.findTheLargestValuesThatIsLessThanOrEqualToAGivenKey(treeMap,49123462);
    }
}
