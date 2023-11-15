package lesson.lesson24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String text = "ABCDABCDE AB8CD ABC ABCDAB ABCF ABCDABCDEF ABF";
//        Pattern pattern = Pattern.compile("ABC");
//        Pattern pattern = Pattern.compile("AB[C-Y]");
//        Pattern pattern = Pattern.compile("AB[C-Y0-9]"); // входящий в диапазон
//        Pattern pattern = Pattern.compile("AB[^C-Y0-9]"); // ^ (любой символ и цифр не входящий в диапазон)
        Pattern pattern = Pattern.compile("AB(C | 8)"); // 3 символ может быть C или 8
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
