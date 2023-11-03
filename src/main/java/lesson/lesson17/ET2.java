package lesson.lesson17;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ET2 {
    private static void m1() {
        try {
            FileReader fileReader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private static void m2(){
        System.out.println("m2");
        m1();
    }
    public static void main(String[] args) {
        m2();
    }
}
