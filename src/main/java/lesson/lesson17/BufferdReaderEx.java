package lesson.lesson17;

import java.io.*;

public class BufferdReaderEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("222.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("buffered.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
