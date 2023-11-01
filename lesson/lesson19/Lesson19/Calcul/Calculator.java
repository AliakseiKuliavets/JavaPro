package Lesson19.Calcul;

import java.util.Arrays;

public class Calculator {

    // 1. Простое сложение двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // 2. Вычитание
    public int subtract(int a, int b) {
        return a - b;
    }

    // 3. Умножение
    public int multiply(int a, int b) {
        return a * b;
    }

    // 4. Деление
    public int divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    // 5. Возведение в степень
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // 6. Вычисление факториала
    public long factorial(int n) {
        if (n <= 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    // 7. Определение четности числа
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 8. Поиск максимального числа в массиве
    public int findMax(int[] array) {
        if (array == null){
            throw new NullPointerException("Пустой массив");
        }
        return Arrays.stream(array)
                .max()
                .getAsInt();
    }

    // 9. Определение простого числа
    public boolean isPrime(int n) {
        if(n <= 1) {
            throw new IllegalArgumentException("Нельзя использовать число меньше или равно 1");
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 10. Перевод числа в строку с указанием системы счисления
    public String toBaseString(int n, int base) {
        if(base < 2 || base > 16) {
            throw new IllegalArgumentException("Base should be between 2 and 16");
        }
        return Integer.toString(n, base);
    }

    // 11. Вычисление корня числа
    public double sqrt(double a) {
        if(a < 0) {
            throw new IllegalArgumentException("Negative numbers are not supported");
        }
        return Math.sqrt(a);
    }

    // 12. Инвертирование строки
    public String reverseString(String input) {
        if (input == null){
            throw new NullPointerException("Строка пустая");
        }
        return new StringBuilder(input).reverse().toString();
    }

    // 13. Проверка, является ли строка палиндромом
    public boolean isPalindrome(String input) {
        if (input == null){
            throw new NullPointerException("Строка пустая");
        }
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    // 14. Вычисление НОД двух чисел
    public int gcd(int a, int b) {
        if (a <= 0 || b <= 0){
            throw new IllegalArgumentException("Нельзя использовать числа меньше или равны 0");
        }
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 15. Перемножение элементов массива
    public long productOfArray(int[] array) {
        if (array == null){
            throw new NullPointerException("Пустой массив");
        }
        int r = array[0];
        for (int i = 1; i < array.length; i++) {
            r *= array[i];
        }
        return r;
    }

    // 16. Определение длины самого длинного слова в строке
    public int lengthOfLongestWord(String sentence) {
        if (sentence == null){
            throw new NullPointerException("Пустая строка");
        }
        String[] words = sentence.split("\\s+");
        int maxLength = 0;
        for(String word : words) {
            if(word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        return maxLength;
    }

    // 17. Конвертация температуры из Цельсия в Фаренгейт
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    // 18. Проверка на вхождение подстроки в строку (без использования стандартных методов Java)
    public boolean containsSubstring(String main, String sub) {
        if (main.length() < sub.length()){
            throw new IllegalArgumentException("Нельзя использовать substring больше main строки");
        }
        if (main == null || sub == null){
            throw new NullPointerException("Строка не должна быть равно null");
        }
        for (int i = 0; i < main.length() - sub.length(); i++) {
            if (main.startsWith(sub, i)) return true;
        }
        return true;
    }

    // 19. Сумма цифр числа
    //256 --- 2 + 5 + 6
    public int sumOfDigits(int number) {
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return sum;
    }

    // 20. Проверка, является ли год високосным
    public boolean isLeapYear(int year) {
        if (year < 1582){
            throw new IllegalArgumentException("Високосный год начался с 1582 года");
        }
        if (year % 100 != 0 && year % 4 == 0){
            return  true;
        } else {
            return year % 400 == 0;
        }
    }
}
