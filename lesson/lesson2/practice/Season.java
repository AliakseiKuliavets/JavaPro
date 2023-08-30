package lesson.lesson2.practice;

import lombok.Getter;

@Getter
public enum Season {
    WINTER("december", "january", "february"),
    SPRING("march", "april", "may"),
    SUMMER("june", "july", "august"),
    FALL("september", "november", "october");


    private final String mounth1, mounth2,mounth3;

    Season(String mounth1, String mounth2, String mounth3) {
        this.mounth1 = mounth1;
        this.mounth2 = mounth2;
        this.mounth3 = mounth3;
    }
}
