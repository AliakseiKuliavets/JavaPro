package lesson.lesson17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ET1 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter your digit");
            try (Scanner scanner = new Scanner(System.in)) {
                int digit = scanner.nextInt();
                System.out.println("Digit: " + digit);
                break;
            } catch (InputMismatchException exception) {
                System.out.println("It is not a digit");
            }
        }
        System.out.println("End");
    }
}
