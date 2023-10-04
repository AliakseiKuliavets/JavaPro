package lesson.lesson12.lesson;

public class Rec {
    public static void main(String[] args) {
        m1(Rec::rr);
    }
    public static void rr() {
        System.out.println("12341");
        System.out.println("/////");
        System.out.println("@@@@@");
    }
    public static void m1(Inter1 inter1) {
        System.out.println("###########");
        inter1.get();
    }
}
@FunctionalInterface
interface Inter1 {
    void get();
}
