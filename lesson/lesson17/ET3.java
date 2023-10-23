package lesson.lesson17;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ET3 {
    private static void s1() throws Exception{}
    private static void s2() throws IOException {}
    private static void s3() throws FileNotFoundException {}

    public static void main(String[] args) {
        try {
            s3();
            s2();
            s1();
        } catch (FileNotFoundException e){
            throw new RuntimeException();
        } catch (IOException r) {
            throw new RuntimeException(r);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
