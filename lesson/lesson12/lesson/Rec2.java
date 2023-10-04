package lesson.lesson12.lesson;

public class Rec2 {
    public static void main(String[] args) {
        m1(() -> {
            System.out.println("////");
            System.out.println("$$$$");
            System.out.println("11111");
        });
    }

    public static void m1(Inter inter) {
        System.out.println("****");
        inter.get();
    }
}

@FunctionalInterface
interface Inter {
    void get();
}
