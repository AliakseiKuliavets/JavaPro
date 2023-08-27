package practice.leetcode.countChar;

import java.util.HashMap;
import java.util.Map;

public class countChar {
    public static void main(String[] args) {
    String myString = "ABCDKILABHBSEFSFSFSFQLMXMVINXLVSHSBCSNJKDNB";
        countIndividChar(myString);
    }
    private static void countIndividChar(String myString){
        Map<Character,Integer> map = new HashMap<>();
        for (char c: myString.toCharArray()) {
            int currentCount = map.getOrDefault(c,0);
            map.put(c,currentCount+1);
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
