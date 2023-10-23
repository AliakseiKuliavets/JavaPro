package lesson.lesson17;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExa {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("D:\\tel_ran\\JavaPro\\homeWork\\_07_09_23\\taski.txt")) {
            int c;
            while ((c = fileReader.read()) != -1){
                System.out.print((char) c);
            }
            System.out.println("\n");
            System.out.println("***Done***");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
