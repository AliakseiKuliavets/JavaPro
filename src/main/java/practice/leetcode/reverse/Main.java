package practice.leetcode.reverse;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseVowels("aA"));
        System.out.println(reverseVowels2("aA"));
        List<String> newArra = Arrays.asList("$easy$", "$problem$");
        System.out.println(splitWordsBySeparator(newArra, '$'));
    }

    public static String reverseVowels(String s) {
        List<Character> characterList = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Integer> integerList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (Character character : characterList) {
                if (s.charAt(i) == character) {
                    integerList.add(i);
                    stringBuilder.append(s.charAt(i));
                }
            }
        }
        char[] charArray = String.valueOf(stringBuilder.reverse()).toCharArray();
        char[] some = s.toCharArray();
        for (int i = 0; i < integerList.size(); i++) {
            some[integerList.get(i)] = charArray[i];
        }
        StringBuilder stringBuilder1 = new StringBuilder();
        for (char c : some) {
            stringBuilder1.append(c);
        }
        return String.valueOf(stringBuilder1);
    }

    public static String reverseVowels2(String s) {
        List<Character> characterList = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] some = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (characterList.contains(s.charAt(right)) && characterList.contains(s.charAt(left))) {
                char temp = some[left];
                some[left] = some[right];
                some[right] = temp;
                left++;
                right--;
            } else if (characterList.contains(s.charAt(right))) {
                left++;
            } else {
                right--;
            }
        }
        return new String(some);
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : words) {
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        String some = String.valueOf(stringBuilder);
        if (separator == '.') {
            some = some.replaceAll("\\.", " ");
        } else {
            some = some.replaceAll("\\%s".formatted(separator), " ");
        }
        List<String> list = List.of(some.split(" "));
        List<String> string = new ArrayList<>(list);
        for (int i = 0; i < string.size(); i++) {
            if (string.get(i).isEmpty() || string.get(i).equals(" ")) {
                string.remove(i);
            }
        }
        return string;
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            characterIntegerMap.put(c, characterIntegerMap.getOrDefault(c, 0) + 1);
        }
        Map.Entry<Character, Integer> characterIntegerEntry = characterIntegerMap.entrySet()
                .stream()
                .filter(el -> el.getValue() < 2)
                .findFirst()
                .orElse(null);
        if (!(characterIntegerEntry == null)) {
            for (int i = 0; i < s.length(); i++) {
                if (characterIntegerEntry.getKey() == s.charAt(i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        String regex = "\\b[\\w.-]+@[\\w.-]+\\b";
        Pattern pattern = Pattern.compile(regex);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email.split("@")[0].replaceAll("\\.", "").split("\\+")[0] + "@" + email.split("@")[1]);
            while (matcher.find()) {
                uniqueEmails.add(matcher.group());
            }
        }
        return uniqueEmails.size();
    }

}

