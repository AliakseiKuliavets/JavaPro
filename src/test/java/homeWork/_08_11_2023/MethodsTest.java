package homeWork._08_11_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;


class MethodsTest {
    private static final String stringName = "D:\\tel_ran\\JavaPro\\src\\main\\java\\homeWork\\_08_11_2023\\1.txt";
    private List<String> stringListName = Arrays.asList("Bryan", "Margaret", "Jeffery", "Bob");
    private Map<Character, Long> characterLongMap = Methods.returnKeyStartNameLetterValueCount(stringListName);


    // ---------------------------------------------1-----------------------------------------------

    /**
     * Тест метода stringName(String fileName) который проверяет не возвращает ли данный метод NULL
     */
    @Test
    public void stringNameReturnNotNullTest() {
        Assertions.assertNotNull(Methods.stringName(stringName));
    }

    /**
     * Тест метода stringName(String fileName) который проверяет на ошибку IllegalArgumentException,
     * если fileName == null
     */
    @Test
    public void stringNameIllegalArgumentExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Methods.stringName(null));
    }

    /**
     * Тест метода stringName(String fileName) который проверяет на ошибку RuntimeException,
     * если в fileName был передан неправильный путь
     */
    @Test
    public void stringNameRuntimeExceptionTest() {
        Assertions.assertThrows(RuntimeException.class, () -> Methods.stringName("hcsvjjac"));
    }

    //----------------------------------------------------2---------------------------------------------

    /**
     * Тест метода returnKeyStartNameLetterValueCount(List<String> stringListName) который сравнивает результат,
     * размер List<String> == 4 ("Bryan", "Margaret", "Jeffery","Bob")
     * размер  Map<Character, Long> == 3 [B=2, M=1, J=1]
     */
    @Test
    public void returnKeyStartNameLetterValueCountPositiveTest() {
        Assertions.assertEquals(3, Methods.returnKeyStartNameLetterValueCount(stringListName).size());
    }

    /**
     * Тест метода returnKeyStartNameLetterValueCount(List<String> stringListName) который поверяет не возвращает ли
     * данный метод NULL
     */
    @Test
    public void returnKeyStartNameLetterValueCountReturnNotNullPositiveTest() {
        Assertions.assertNotNull(Methods.returnKeyStartNameLetterValueCount(stringListName));
    }

    /**
     * Тест метода returnKeyStartNameLetterValueCount(List<String> stringListName) который поверяет на ошибку
     * IllegalArgumentException если stringListName == null
     */
    @Test

    public void returnKeyStartNameLetterValueCountIllegalArgumentExceptionListEqualsNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Methods.returnKeyStartNameLetterValueCount(null));
    }

    /**
     * Тест метода returnKeyStartNameLetterValueCount(List<String> stringListName) который поверяет на ошибку
     * IllegalArgumentException если stringListName был пуст
     */
    @Test
    public void returnKeyStartNameLetterValueCountIllegalArgumentExceptionEmptyListTest() {
        stringListName = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class, () -> Methods.returnKeyStartNameLetterValueCount(stringListName));
    }

    //----------------------------------------------------3---------------------------------------------

    /**
     * Тест метода  returnMostPopularLetterName(Map<Character, Long> characterLongMap) который сравнивает результат,
     * данные Map<Character, Long> characterLongMap = [B=2, M=1, J=1]
     * вернет Optional[B=2]
     */
    @Test
    public void returnMostPopularLetterNameNullPositiveTest() {
        Assertions.assertEquals("Optional[B=2]", Methods.returnMostPopularLetterName(characterLongMap));
    }

    /**
     * Тест метода returnMostPopularLetterName(Map<Character, Long> characterLongMap) который поверяет не возвращает ли
     * данный метод NULL
     */
    @Test
    public void returnMostPopularLetterNamePositiveReturnNotNullTest() {
        Assertions.assertNotNull(Methods.returnMostPopularLetterName(characterLongMap));
    }

    /**
     * Тест метода returnMostPopularLetterName(Map<Character, Long> characterLongMap) который поверяет на ошибку
     * IllegalArgumentException если characterLongMap == NULL
     */
    @Test
    public void returnMostPopularLetterNameIllegalArgumentExceptionMapIsNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Methods.returnMostPopularLetterName(null));
    }

    /**
     * Тест метода returnMostPopularLetterName(Map<Character, Long> characterLongMap) который поверяет на ошибку
     * IllegalArgumentException если characterLongMap был пуст
     */
    @Test
    public void returnMostPopularLetterNameIllegalArgumentExceptionMapIsEmptyTest() {
        characterLongMap = new HashMap<>();
        Assertions.assertThrows(IllegalArgumentException.class, () -> Methods.returnMostPopularLetterName(characterLongMap));
    }

    //----------------------------------------------------5---------------------------------------------

    /**
     * Тест метода returnSortedLengthName(List<String> stringListName) который сравнивает результат,
     * данные List<String> stringListName ("Bryan", "Margaret", "Jeffery","Bob")
     * вернет ("Bob", "Bryan", "Jeffery", "Margaret")
     */
    @Test
    public void returnSortedLengthNamePositiveTest() {
        List<String> list = Arrays.asList("Bob", "Bryan", "Jeffery", "Margaret");
        Assertions.assertEquals(list, Methods.returnSortedLengthName(stringListName));
    }

    /**
     * Тест метода returnSortedLengthName(List<String> stringListName) который поверяет не возвращает ли
     * данный метод NULL
     */
    @Test
    public void returnSortedLengthNamePositiveReturnNotNullTest() {
        Assertions.assertNotNull(Methods.returnSortedLengthName(stringListName));
    }

    /**
     * Тест метода returnSortedLengthName(List<String> stringListName) который поверяет на ошибку
     * IllegalArgumentException если stringListName == null
     */
    @Test
    public void returnSortedLengthNameIllegalArgumentExceptionListIsNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Methods.returnSortedLengthName(null));
    }

    /**
     * Тест метода returnSortedLengthName(List<String> stringListName) который поверяет на ошибку
     * IllegalArgumentException если stringListName был пуст
     */
    @Test
    public void returnSortedLengthNameIllegalArgumentExceptionListIsEmptyTest() {
        stringListName = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class, () -> Methods.returnSortedLengthName(stringListName));
    }

    //----------------------------------------------------7---------------------------------------------

    /**
     * Тест метода returnFirstLastLetterAlphabetName(List<String> stringListName) который сравнивает результат,
     * данные List<String> stringListName ("Bryan", "Margaret", "Jeffery","Bob")
     * вернет ("Margaret", "Jeffery", "Bryan", "Bob")
     */
    @Test
    public void returnFirstLastLetterAlphabetNamePositiveTest() {
        List<String> list = Arrays.asList("Margaret", "Jeffery", "Bryan", "Bob");
        Assertions.assertEquals(list, Methods.returnFirstLastLetterAlphabetName(stringListName));
    }

    /**
     * Тест метода returnFirstLastLetterAlphabetName(List<String> stringListName) который поверяет не возвращает ли
     * данный метод NULL
     */
    @Test
    public void returnFirstLastLetterAlphabetNamePositiveReturnNotNullTest() {
        Assertions.assertNotNull(Methods.returnFirstLastLetterAlphabetName(stringListName));
    }

    /**
     * Тест метода  returnFirstLastLetterAlphabetName(List<String> stringListName) который поверяет на ошибку
     * IllegalArgumentException если stringListName == null
     */
    @Test
    public void returnFirstLastLetterAlphabetNameIllegalArgumentExceptionListIsNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Methods.returnFirstLastLetterAlphabetName(null));
    }

    /**
     * Тест метода returnFirstLastLetterAlphabetName(List<String> stringListName) который поверяет на ошибку
     * IllegalArgumentException если stringListName был пуст
     */
    @Test
    public void returnFirstLastLetterAlphabetNameIllegalArgumentExceptionListIsEmptyTest() {
        stringListName = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class, () -> Methods.returnFirstLastLetterAlphabetName(stringListName));
    }


    //----------------------------------------------------9---------------------------------------------

    /**
     * Тест метода returnAvgLengthName(List<String> stringListName) который сравнивает результат,
     * данные List<String> stringListName ("Bryan", "Margaret", "Jeffery","Bob")
     * вернет 5.75 (double)
     */
    @Test
    public void returnAvgLengthNamePositiveTest() {
        Assertions.assertEquals(5.75, Methods.returnAvgLengthName(stringListName));
    }

    /**
     * Тест метода  returnAvgLengthName(List<String> stringListName) который поверяет не возвращает ли данный метод NULL
     */
    @Test

    public void returnAvgNamePositiveReturnNotNullTest() {
        Assertions.assertNotNull(Methods.returnAvgLengthName(stringListName));
    }

    /**
     * Тест метода  returnAvgLengthName(List<String> stringListName) который поверяет на ошибку IllegalArgumentException
     * если stringListName == null
     */
    @Test
    public void returnAvgNameIllegalArgumentExceptionListIsNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Methods.returnAvgLengthName(null));
    }

    /**
     * Тест метода returnAvgLengthName(List<String> stringListName) который поверяет на ошибку IllegalArgumentException
     * если stringListName был пуст
     */
    @Test
    public void returnAvgNameIllegalArgumentExceptionListIsEmptyTest() {
        stringListName = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class, () -> Methods.returnAvgLengthName(stringListName));
    }
}