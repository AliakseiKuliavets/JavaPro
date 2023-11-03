package homeWork._18_09_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TaskiEx {
    //Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран.
    public void iterateMap(Map<String, Integer> hashMap, Map<String, Integer> treeMap) {
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            System.out.println("Key: " + map.getKey() + " | " + " Val: " + map.getValue());
        }

        for (Map.Entry<String, Integer> map : treeMap.entrySet()) {
            System.out.println("Key: " + map.getKey() + " | " + " Val: " + map.getValue());
        }
    }

    //Переберите только ключи в HashMap и TreeMap и найдите сумму их длин.
    public void sumOfTheirLengths(Map<String, Integer> hashMap, Map<String, Integer> treeMap) {
        int sumHashMap = 0;
        for (String key : hashMap.keySet()) {
            sumHashMap += key.length();
        }

        int sumTreeMap = 0;
        for (String key : treeMap.keySet()) {
            sumTreeMap += key.length();
        }
        System.out.println("Length HashMap: " + sumHashMap + " | " + " Length TreeMap: " + sumTreeMap);
    }

    //Переберите только значения в HashMap и TreeMap и найдите их среднее значение.
    public void averageValue(Map<String, Integer> hashMap, Map<String, Integer> treeMap) {
        int sumHashMap = 0;
        int countHashMap = 0;
        for (Integer value : hashMap.values()) {
            sumHashMap += value;
            countHashMap++;
        }

        int sumTreeMap = 0;
        int countTreeMap = 0;
        for (Integer value : treeMap.values()) {
            sumTreeMap += value;
            countTreeMap++;
        }
        System.out.println("AVG HashMap: " + (sumHashMap / countHashMap) + " | " + " AVG TreeMap: " + (sumTreeMap / countTreeMap));
    }

    //Переберите HashMap и найдите ключ с максимальным значением.
    public void findTheKeyWithMaximumValue(Map<String, Integer> hashMap) {
        int maxKeyValueLength = Integer.MIN_VALUE;
        String maxKeyValue = null;
        for (String key : hashMap.keySet()) {
            if (key.length() > maxKeyValueLength) {
                maxKeyValueLength = key.length();
                maxKeyValue = key;
            }
        }
        System.out.println("Max key value: " + maxKeyValue);
    }

    //Переберите TreeMap и найдите ключ с минимальным значением.
    public void findKeyWithMinimumValue(Map<String, Integer> treeMap) {
        int minKeyValueLength = Integer.MAX_VALUE;
        String minKeyValue = null;
        for (String key : treeMap.keySet()) {
            if (key.length() < minKeyValueLength) {
                minKeyValueLength = key.length();
                minKeyValue = key;
            }
        }
        System.out.println("MIN key value: " + minKeyValue);
    }

    //Переберите HashMap и удалите все элементы с четными значениями.
    public void removeAllElementsWithEvenValues(Map<String, Integer> hashMap) {
        List<String> keysToRemove = new ArrayList<>();
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (map.getValue() % 2 == 0) {
                keysToRemove.add(map.getKey());
            }
        }
        for (String key : keysToRemove) {
            hashMap.remove(key);
        }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
    //Переберите TreeMap и удалите все элементы с ключами, начинающимися с буквы 'A'.
    public void removeAllElementsStartingWithTheLetterA(Map<String, Integer> treeMap) {
        List<String> keysToRemove = new ArrayList<>();
        for (Map.Entry<String, Integer> map : treeMap.entrySet()) {
            if (map.getKey().startsWith("A")) {
                keysToRemove.add(map.getKey());
            }
        }
        for (String key : keysToRemove) {
            treeMap.remove(key);
        }
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    //Переберите TreeMap и найдите наибольшее Значение (ключ у меня стринг )который меньше или равен
    // заданному значению(ключ длжен был быть).
    public void findTheLargestValuesThatIsLessThanOrEqualToAGivenKey(Map<String, Integer> treeMap, int values ) {
        int maxMinValues = Integer.MIN_VALUE;
        for (Integer value : treeMap.values()) {
            if (value > maxMinValues && value <= values) {
                maxMinValues = value;
            }
        }
        System.out.println(maxMinValues);

    }
}
