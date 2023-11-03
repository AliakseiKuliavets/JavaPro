package practice.javaPro.lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("Hello"));
    }

    public static void main(String[] args) {
        int i = 10;
      //  i=20; error
        def(s -> s.length() * i);
    }
}
interface I {
    int abc(String s);
}