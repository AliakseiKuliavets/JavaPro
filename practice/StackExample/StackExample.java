package practice.StackExample;

public class StackExample {
    public static void main(String[] args) {
        System.out.println("main starts");
        abc3();
        System.out.println("main ends");
    }
    static void abc1() {
        System.out.println("abc1 Start");
        System.out.println("abc1 End");
    }
    static void abc2() {
        System.out.println("abc2 Start");
        abc1();
        System.out.println("abc2 End");
    }
    static void abc3() {
        System.out.println("abc3 Start");
        abc2();
        System.out.println("abc3 End");
    }
}
