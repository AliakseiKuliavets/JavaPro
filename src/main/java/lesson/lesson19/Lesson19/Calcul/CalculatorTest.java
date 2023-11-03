package lesson.lesson19.Lesson19.Calcul;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {
    private final Calculator calculator = new Calculator();
    private int a;
    private int b;
    private int expected;
    private final int[] array = {1, 6, 7, 8, 9, 10, 2, 3, 4, 5};
    private String input;
    private String main;
    private String sub;

    // 1. Простое сложение двух чисел
    @Test
    void addPositiveTest() {
        a = 6;
        b = 5;
        expected = 11;
        Assertions.assertEquals(expected, calculator.add(a, b));
    }

    // 2. Вычитание
    @Test
    void subtractPositiveTest() {
        a = 11;
        b = 5;
        expected = 6;
        Assertions.assertEquals(expected, calculator.subtract(a, b));
    }

    // 3. Умножение
    @Test
    void multiplyPositiveTest() {
        a = 7;
        b = 4;
        expected = 28;
        Assertions.assertEquals(expected, calculator.multiply(a, b));
    }

    // 4. Деление
    @Test
    void dividePositiveTest() {
        a = 10;
        b = 2;
        expected = 5;
        Assertions.assertEquals(expected, calculator.divide(a, b));
    }

    @Test
    void divideByZeroTest() {
        a = 12;
        b = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(a, b));
    }

    // 5. Возведение в степень
    @Test
    void powerPositiveTest() {
        double exponent = 36;
        double expected = Math.pow(a, exponent);
        Assertions.assertEquals(expected, calculator.power(a, exponent));
    }

    // 6. Вычисление факториала
    @Test
    void factorialPositiveTest() {
        a = 4;
        expected = 24;
        Assertions.assertEquals(expected, calculator.factorial(a));
    }

    // 7. Определение четности числа*
    @Test
    void isEvenPositiveTest() {
        a = 2;
        boolean expected = true;
        Assertions.assertEquals(expected, calculator.isEven(a));
    }

    // 8. Поиск максимального числа в массиве
    @Test
    void findMaxPositiveTest() {
        expected = 10;
        Assertions.assertEquals(expected, calculator.findMax(array));
    }

    @Test
    void findMaxExceptionsTest() {
        Assertions.assertThrows(NullPointerException.class, () -> calculator.findMax(null));
    }

    // 9. Определение простого числа
    @Test
    void isPrimePositiveTest() {
        a = 2;
        boolean expected = true;
        Assertions.assertEquals(expected, calculator.isPrime(a));
    }

    @Test
    void isPrimeExceptionsTest() {
        a = -1;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.isPrime(a));
    }

    // 10. Перевод числа в строку с указанием системы счисления
    @Test
    void toBaseStringPositiveTest() {
        a = 143;
        b = 15;
        String expected = "98";
        Assertions.assertEquals(expected, calculator.toBaseString(a, b));
    }

    @Test
    void toBaseStringExceptionsTest() {
        a = 143;
        b = 17;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.toBaseString(a, b));
    }

    @Test
    void toBaseStringNotNullTest() {
        a = 143;
        b = 15;
        Assertions.assertNotNull(calculator.toBaseString(a, b));
    }

    // 11. Вычисление корня числа
    @Test
    void sqrtPositiveTest() {
        double a = 4;
        double expected = 2;
        Assertions.assertEquals(expected, calculator.sqrt(a));
    }

    @Test
    void sqrtExceptionsTest() {
        double a = -2;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(a));
    }

    // 12. Инвертирование строки
    @Test
    void reverseStringPositiveTest() {
        input = "auto";
        String expected = "otua";
        Assertions.assertEquals(expected, calculator.reverseString(input));
    }

    @Test
    void reverseStringExceptionsTest() {
        Assertions.assertThrows(NullPointerException.class, () -> calculator.reverseString(null));
    }

    // 13. Проверка, является ли строка палиндромом
    @Test
    void isPalindromePositiveTest() {
        input = "mamam";
        boolean expected = true;
        Assertions.assertEquals(expected, calculator.isPalindrome(input));
    }

    @Test
    void isPalindromeExceptionsTest() {
        Assertions.assertThrows(NullPointerException.class, () -> calculator.isPalindrome(null));
    }

    // 14. Вычисление НОД двух чисел
    @Test
    void gcdPositiveTest() {
        a = 6;
        b = 5;
        expected = 1;
        Assertions.assertEquals(expected, calculator.gcd(a, b));
    }

    @Test
    void gcdExceptionsTest() {
        a = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.gcd(a, b));
    }

    // 15. Перемножение элементов массива
    @Test
    void productOfArrayPositiveTest() {
        expected = 3_628_800;
        Assertions.assertEquals(expected, calculator.productOfArray(array));
    }

    @Test
    void productOfArrayExceptionsTest() {
        Assertions.assertThrows(NullPointerException.class, () -> calculator.productOfArray(null));
    }

    // 16. Определение длины самого длинного слова в строке
    @Test
    void lengthOfLongestWordPositiveTest() {
        String sentence = "Mama myla ramy pod nadzorom";
        expected = 8;
        Assertions.assertEquals(expected, calculator.lengthOfLongestWord(sentence));
    }

    @Test
    void lengthOfLongestWordExceptionsTest() {
        Assertions.assertThrows(NullPointerException.class, () -> calculator.lengthOfLongestWord(null));
    }

    // 17. Конвертация температуры из Цельсия в Фаренгейт
    @Test
    void celsiusToFahrenheitPositiveTest() {
        double celsius = 20;
        double expected = 68;
        Assertions.assertEquals(expected, calculator.celsiusToFahrenheit(celsius));
    }

    // 18. Проверка на вхождение подстроки в строку (без использования стандартных методов Java)
    @Test
    void containsSubstringPositiveTest() {
        main = "mama";
        sub = "ma";
        boolean expected = true;
        Assertions.assertEquals(expected, calculator.containsSubstring(main, sub));
    }

    @Test
    void containsSubstringExceptionsLengthTest() {
        main = "ma";
        sub = "mama";
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.containsSubstring(main, sub));
    }

    @Test
    void containsSubstringExceptionsTest() {
        main = "mama";
        sub = null;
        Assertions.assertThrows(NullPointerException.class, () -> calculator.containsSubstring(main, sub));
    }

    // 19. Сумма цифр числа
    @Test
    void sumOfDigitsPositiveTest() {
        a = 256;
        expected = 13;
        Assertions.assertEquals(expected, calculator.sumOfDigits(a));
    }
    @Test
    void isLeapYearToPositiveTest(){
        a = 2024;
        boolean expected = true;
        Assertions.assertEquals(expected, calculator.isLeapYear(a));
    }
    @Test
    void isLeapYearToExceptionsTest(){
        a = -1232;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.isLeapYear(a));
    }
}