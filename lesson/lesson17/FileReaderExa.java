package lesson.lesson17;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExa {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("tex.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
