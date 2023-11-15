package lesson.lesson24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        String text = "Human Material@gmail.com Loop hopes to transform the fashion industry by " +
                "turning human hair into a textile. So far, it has made prototypes of human" +
                " hair coats, jumpers, and blazers@mail.ru.uk — with the hope that one day, clothing " +
                "companies will buy rolls of its alternative material@yahoo.com for their own designs.";
        String patt = "\\w+@\\w+\\.(ru\\.uk|com\\.uk|com|ru|)";

        Pattern pattern = Pattern.compile(patt);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
