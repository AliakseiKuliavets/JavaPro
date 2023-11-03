package lesson.lesson9.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {
    public static void main(String[] args) {
        String palindrome = "MADAM";
        String NotPalindrome = "yesterdey";

        System.out.println(isPalindrome(palindrome));
        System.out.println(isPalindrome(NotPalindrome));
    }

    private static boolean isPalindrome(String word) {
        List<Character> myChar = new ArrayList<>();

        int counter = 0;
        int lengthWord = word.length();

        for (int i = 0; i < word.length(); i++) {
            myChar.add(word.charAt(i));
        }

        ListIterator<Character> characterIteratorBegin = myChar.listIterator();
        ListIterator<Character> characterIteratorPrevios = myChar.listIterator(myChar.size());

        while (characterIteratorBegin.hasNext() && characterIteratorPrevios.hasPrevious()) {
            if (characterIteratorBegin.next() != characterIteratorPrevios.previous()) {
                return false;
            }
            counter++;
            if (counter > lengthWord / 2) {
                return true;
            }
        }
        return true;
    }
}
