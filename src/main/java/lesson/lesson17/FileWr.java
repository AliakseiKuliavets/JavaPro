package lesson.lesson17;

import java.io.FileWriter;
import java.io.IOException;

public class FileWr {
    public static void main(String[] args) {
        String text = "sbkfbkbdd ukab kubak hab hbakdb ak";
        try (FileWriter writer = new FileWriter("write.txt")) {
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
