package lesson.lesson2.practice;

import lesson.lesson2.practice.Season;
import java.util.Arrays;

public class EnumPractice {
    public static void main(String[] args) {

        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons));

        for (int i = 0; i < seasons.length; i++){
            System.out.print(seasons[i].getMounth1() + " ");
            System.out.print(seasons[i].getMounth2() + " ");
            System.out.println(seasons[i].getMounth3() + " ");
        }
        System.out.println(Season.FALL.getMounth1());
        System.out.println(Season.valueOf("FALL").getMounth2());
        System.out.println(Season.valueOf("SUMMER").ordinal());
    }
}
