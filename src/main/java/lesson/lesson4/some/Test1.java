package lesson.lesson4.some;

public class Test1 implements Interf{
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.absM();
        test1.defM();
        Interf.statM();
    }

    @Override
    public void absM() {
        System.out.println("ABS");
    }
}

interface Interf{
    void absM();
    default void defM() {
        System.out.println("DEF M");
    }
    static void statM() {
        System.out.println("STAT M");
    }
}
