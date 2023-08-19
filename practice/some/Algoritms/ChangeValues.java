package practice.some.Algoritms;

public class ChangeValues {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        change1(a,b);
        change2(a,b);
    }
    private static void change1(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);;
    }

    private static void change2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);;
    }
}
