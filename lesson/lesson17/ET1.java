package lesson.lesson17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ET1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please enter your digit");
            try {
                int digit = scanner.nextInt();
                System.out.println("Digit: " + digit);
                break;
            } catch (InputMismatchException exception) {
                System.out.println("It is not a digit");
                scanner.nextInt();
            }
        }
        System.out.println("End");
        scanner.close();
    }
}
