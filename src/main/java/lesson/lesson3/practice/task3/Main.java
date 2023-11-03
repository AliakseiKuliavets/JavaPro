package lesson.lesson3.practice.task3;

public class Main {
    public static void main(String[] args) {
        Printer color = new ColorPrint();
        color.print();
        Printer color2 = new BlackPrint();
        color2.print();
    }
}
