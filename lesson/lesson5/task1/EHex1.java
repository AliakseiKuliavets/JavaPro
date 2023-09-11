package lesson.lesson5.task1;

public class EHex1 {
    public static void main(String[] args) {
        Auto auto = new Auto("Ferrari", true, 732.8);
        Auto auto1 = new Auto("BMW", true, 304.0);
        System.out.println(auto.hashCode());
        System.out.println(auto1.hashCode());
    }
}
