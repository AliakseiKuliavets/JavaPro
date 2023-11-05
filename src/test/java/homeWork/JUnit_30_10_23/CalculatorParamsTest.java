package homeWork.JUnit_30_10_23;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;

/**
 * Использую параметризацию тестов поэтому важно иметь зависимость
 *
 * <dependency>
 * <groupId>pl.pragmatists</groupId>
 * <artifactId>JUnitParams</artifactId>
 * <version>1.1.1</version>
 * <scope>test</scope>
 * </dependency>
 * <dependency>
 * <groupId>junit</groupId>
 * <artifactId>junit</artifactId>
 * <version>4.12</version>
 * <scope>test</scope>
 * </dependency>
 * <p>
 * Использую JUnit 4
 * И сохранить импорт
 */
@RunWith(JUnitParamsRunner.class)
public class CalculatorParamsTest {
    private final Calculator calculator = new Calculator();

    private static Object[] testAddValues() {
        return new Object[]{
                new Object[]{50, 50, 100},
                new Object[]{2, 2, 4},
                new Object[]{0, -1, -1},
                new Object[]{-20, -1, -21},
        };
    }


    /**
     * Тест метода add(int a,int b) который проверяет сумму чисел a + b = expected
     *
     * @param a        - первое число (int)
     * @param b        - второе число (int)
     * @param expected - ожидаемы результат (int)
     *                 ссылка на данные метод "testAddValues"
     */
    @Test
    @Parameters(method = "testAddValues")
    public void addTest(int a, int b, int expected) {
        Assertions.assertEquals(expected, calculator.add(a, b));
    }

    private static Object[] testSubtractValues() {
        return new Object[]{
                new Object[]{50, 50, 0},
                new Object[]{2, 2, 0},
                new Object[]{2, 5, -3},
                new Object[]{5, 2, 3},
        };
    }

    /**
     * Тест метода subtract(int a,int b) который проверяет вычитание чисел a - b = expected
     *
     * @param a        - первое число (int)
     * @param b        - второе число (int)
     * @param expected - ожидаемы результат (int)
     *                 ссылка на данные метод "testSubtractValues"
     */
    @Test
    @Parameters(method = "testSubtractValues")
    public void subtractTest(int a, int b, int expected) {
        Assertions.assertEquals(expected, calculator.subtract(a, b));
    }

    private static Object[] testMultiplyValues() {
        return new Object[]{
                new Object[]{50, 50, 2500},
                new Object[]{2, 0, 0},
                new Object[]{2, 5, 10},
                new Object[]{-5, 2, -10},
                new Object[]{1, 2, 2}
        };
    }

    /**
     * Тест метода multiply(int a,int b) который проверяет умножение чисел a * b = expected
     *
     * @param a        - первое число (int)
     * @param b        - второе число (int)
     * @param expected - ожидаемы результат (int)
     *                 ссылка на данные метод "testMultiplyValues"
     */
    @Test
    @Parameters(method = "testMultiplyValues")
    public void multiplyTest(int a, int b, int expected) {
        Assertions.assertEquals(expected, calculator.multiply(a, b));
    }

    private static Object[] testDivideValues() {
        return new Object[]{
                new Object[]{50, 50, 1},
                new Object[]{2, 1, 2},
                new Object[]{0, 5, 0},
                new Object[]{-100, 2, -50},
                new Object[]{-5, 2, -2}
        };
    }

    /**
     * Тест метода power(int a,int b) который проверяет деление чисел a / b = expected
     *
     * @param a        - первое число (int)
     * @param b        - второе число (int)
     * @param expected - ожидаемы результат (int)
     *                 ссылка на данные метод "testDivideValues"
     */
    @Test
    @Parameters(method = "testDivideValues")
    public void divideTest(int a, int b, int expected) {
        Assertions.assertEquals(expected, calculator.divide(a, b));
    }

    /**
     * Тест метода power(int a,int b) который проверяет на ошибку ArithmeticException при делении на 0
     */
    @Test
    public void divideByZeroTest() {
        int a = 12;
        int b = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(a, b));
    }

    private static Object[] testPowerValues() {
        return new Object[]{
                new Object[]{4.0, 4.0, 256.0},
                new Object[]{1.5, 4.0, 5.0625d},
                new Object[]{-3.0, 4.0, 81.0},
                new Object[]{4.0, -3.0, 0.015625d},
                new Object[]{0, 0, 1.0},
                new Object[]{-3.0, 3.0, -27.0}
        };
    }

    /**
     * Тест метода power(double base,double exponent) который проверяет возведение в степень чисел a^b = expected
     *
     * @param base     - число (double)
     * @param exponent - степень (double)
     * @param expected - результат (double)
     *                 ссылка на данные метод "testPowerValues"
     */
    @Test
    @Parameters(method = "testPowerValues")
    public void powerTest(double base, double exponent, double expected) {
        Assertions.assertEquals(expected, calculator.power(base, exponent));
    }

    private static Object[] testFactorialValues() {
        return new Object[]{
                new Object[]{4, 24},
                new Object[]{-1, 1},
                new Object[]{1, 1},
                new Object[]{0, 1},
                new Object[]{3, 6},
        };
    }

    /**
     * Тест метода factorial(int n) который находит факториал числа n
     *
     * @param n        - число (int)
     * @param expected - результат (int)
     *                 ссылка на данные метод "testFactorialValues"
     */
    @Test
    @Parameters(method = "testFactorialValues")
    public void factorialTest(int n, int expected) {
        Assertions.assertEquals(expected, calculator.factorial(n));
    }

    private static Object[] testIsEvenValues() {
        return new Object[]{
                new Object[]{2, true},
                new Object[]{-2, true},
                new Object[]{3, false},
                new Object[]{-3, false},
                new Object[]{0, true}
        };
    }

    /**
     * Тест метода isEven(int n)  который проверяет является ли число n четным(true) или нет(false)
     *
     * @param n        - число (int)
     * @param expected - результат (boolean)
     *                 ссылка на данные метод "testIsEvenValues"
     */
    @Test
    @Parameters(method = "testIsEvenValues")
    public void isEvenTest(int n, boolean expected) {
        Assertions.assertEquals(expected, calculator.isEven(n));
    }

    private static Object[] testFindMaxValues() {
        int[] array1 = {1, 2, 3, 6, 9, 10, -100, 100, -20947, 848};
        int[] array2 = {-1, -2, -3, -6, -9, -10, -100, -100, -20947, -848};
        return new Object[]{
                new Object[]{array1, 848},
                new Object[]{array2, -1}
        };
    }

    /**
     * Тест метода findMax(int[] array) который принимает на вход массив целых чисел и выводит максимальное значение
     *
     * @param array    - массив чисел (int[])
     * @param expected - результат максимальное число (int)
     *                 ссылка на данные метод "testFindMaxValues"
     */
    @Test
    @Parameters(method = "testFindMaxValues")
    public void findMaxTest(int[] array, int expected) {
        Assertions.assertEquals(expected, calculator.findMax(array));
    }

    /**
     * Метод который проверяет на ошибку если в переданный метод findMax() был перед массив со значением NULL
     */
    @Test
    public void findMaxExceptionsTest() {
        Assertions.assertThrows(NullPointerException.class, () -> calculator.findMax(null));
    }

    private static Object[] testIsPrimeValues() {
        return new Object[]{
                new Object[]{2, true},
                new Object[]{3, true},
                new Object[]{7, true},
                new Object[]{11, true},
                new Object[]{4, false},
                new Object[]{8, false},
                new Object[]{10, false}
        };
    }

    /**
     * Тест метода isPrime(int n) который проверяет является ли число n простым(true) или сложным(false)
     *
     * @param n        - число (int)
     * @param expected - результат (boolean)
     *                 ссылка на данные метод "testIsPrimeValues"
     */
    @Test
    @Parameters(method = "testIsPrimeValues")
    public void isPrimeTest(int n, boolean expected) {
        Assertions.assertEquals(expected, calculator.isPrime(n));
    }

    /**
     * Методы которые проверяют на ошибку если в переданный метод isPrime() было передано число меньше или равно 1
     */
    @Test
    public void isPrimeExceptionsOneTest() {
        int a = 1;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.isPrime(a));
    }

    @Test
    public void isPrimeExceptionsLessZeroTest() {
        int a = -1;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.isPrime(a));
    }

    private static Object[] testToBaseStringValues() {
        return new Object[]{
                new Object[]{14, 2, "1110"},
                new Object[]{14, 3, "112"},
                new Object[]{14, 4, "32"},
                new Object[]{14, 5, "24"},
                new Object[]{14, 6, "22"},
                new Object[]{14, 7, "20"},
                new Object[]{14, 8, "16"},
                new Object[]{14, 9, "15"},
                new Object[]{14, 10, "14"},
                new Object[]{14, 11, "13"},
                new Object[]{14, 12, "12"},
                new Object[]{14, 13, "11"},
                new Object[]{14, 14, "10"},
                new Object[]{14, 15, "e"},
                new Object[]{14, 16, "e"},
                new Object[]{-13, 2, "-1101"},
                new Object[]{-13, 3, "-111"},
                new Object[]{-13, 4, "-31"},
                new Object[]{-13, 5, "-23"},
                new Object[]{-13, 6, "-21"},
                new Object[]{-13, 7, "-16"},
                new Object[]{-13, 8, "-15"},
                new Object[]{-13, 9, "-14"},
                new Object[]{-13, 10, "-13"},
                new Object[]{-13, 11, "-12"},
                new Object[]{-13, 12, "-11"},
                new Object[]{-13, 13, "-10"},
                new Object[]{-13, 14, "-d"},
                new Object[]{-13, 15, "-d"},
                new Object[]{-13, 16, "-d"},
        };
    }

    /**
     * Тест метода toBaseString(int n, int base) который переводит число n в систему счисления base и выводит результат в виде String
     *
     * @param n        - число (int)
     * @param base     - в какую систему счисления перевести с 2 до 16 (int)
     * @param expected - число n в системе счисления base (String)
     *                 ссылка на данные метод "testToBaseStringValues"
     */
    @Test
    @Parameters(method = "testToBaseStringValues")
    public void toBaseStringTest(int n, int base, String expected) {
        Assertions.assertEquals(expected, calculator.toBaseString(n, base));
    }

    /**
     * Методы которые проверяют на ошибку если в переданный метод toBaseString() была передана систему счисления base
     * больше 16 и меньше 2
     */
    @Test
    public void toBaseStringExceptionsTest() {
        int n = 143;
        int base = 17;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.toBaseString(n, base));
    }

    @Test
    public void toBaseStringExceptionsLessTwoTest() {
        int n = 143;
        int base = 1;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.toBaseString(n, base));
    }

    private static Object[] testSqrtValues() {
        return new Object[]{
                new Object[]{16, 4},
                new Object[]{25, 5},
                new Object[]{9, 3}
        };
    }

    /**
     * Тест метода sqrt(double a) который проверяет находит ли корень от числа n
     *
     * @param a        - число с которого нужно вычесть корень (double)
     * @param expected - корень числа n (double)
     *                 ссылка на данные метод "testSqrtValues"
     */
    @Test
    @Parameters(method = "testSqrtValues")
    public void sqrtTest(double a, double expected) {
        Assertions.assertEquals(expected, calculator.sqrt(a));
    }
}