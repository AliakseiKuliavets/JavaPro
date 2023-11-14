package homeWork._08_11_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;


class MethodsTest {
    private static final String stringName = "D:\\tel_ran\\JavaPro\\src\\main\\java\\homeWork\\_08_11_2023\\1.txt";

    private List<String> lines = Arrays.asList(
            "+1-240-701-5763x6875 - Bryan Edwards",
            "(432)461-5121 - Margaret Herman",
            "+1-159-322-4388x60509 - Jeffery Blake",
            "8853301072 - Bob Griffin MD",
            "(885)624-5862x792 - Dana Edwards"
    );
    private List<String> stringListName = Methods.stringName(lines);
    private Map<Character, Long> characterLongMap = Methods.returnKeyStartNameLetterValueCount(stringListName);
    private List<String> stringListLastName = Methods.stringLastName(lines);

    private List<String> stringsNumberPhone = Arrays.asList(
            "+1-240-701-5763x6875",
            "(432)461-5121",
            "+1-159-322-4388x60509"
    );

    // ---------------------------------------1. Lines Read ----------------------------------------------

    /**
     * Тест метода readFileToList(String fileName) который проверяет не возвращает ли данный метод NULL
     */
    @Test
    public void stringNameReturnNotNullTest() {
        Assertions.assertNotNull(Methods.readFileToList(stringName));
    }

    /**
     * Тест метода readFileToList(String fileName) который проверяет на ошибку IllegalArgumentException,
     * если fileName == null
     */
    @Test
    public void stringNameIllegalArgumentExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Methods.readFileToList(null));
    }

    /**
     * Тест метода readFileToList(String fileName) который проверяет на ошибку RuntimeException,
     * если в fileName был передан неправильный путь
     */
    @Test
    public void stringNameRuntimeExceptionTest() {
        Assertions.assertThrows(RuntimeException.class, () -> Methods.readFileToList("some23232"));
    }

    // ---------------------------------------1. stringNameList ----------------------------------------------

    /**
     * Тест метода stringName(List<String> lines) который достает с каждой строки имена,
     * На вход:
     * private List<String> lines = Arrays.asList(
     * "+1-240-701-5763x6875 - Bryan Edwards",
     * "(432)461-5121 - Margaret Herman",
     * "+1-159-322-4388x60509 - Jeffery Blake",
     * "8853301072 - Bob Griffin MD",
     * "(885)624-5862x792 - Dana Edwards"
     * );
     * На выход:
     * List<String> names.size() == 5
     */
    @Test
    public void stringNameReturnSizeListPositiveTest() {
        Assertions.assertEquals(5, Methods.stringName(lines).size());
    }

    /**
     * Тест метода stringName(List<String> lines) который достает с каждой строки имена,
     * На вход:
     * private List<String> lines = Arrays.asList(
     * "+1-240-701-5763x6875 - Bryan Edwards",
     * "(432)461-5121 - Margaret Herman",
     * "+1-159-322-4388x60509 - Jeffery Blake",
     * "8853301072 - Bob Griffin MD",
     * "(885)624-5862x792 - Dana Edwards"
     * );
     * На выход:
     * List<String> names.get(0) == Bryan
     * List<String> names.get(1) == Margaret
     */
    @Test
    public void stringNameReturnPositiveTest() {
        String name1 = "Bryan";
        String name2 = "Margaret";
        Assertions.assertEquals(name1, Methods.stringName(lines).get(0));
        Assertions.assertEquals(name2, Methods.stringName(lines).get(1));
    }

    /**
     * Тест метода stringName(List<String> lines) который поверяет не возвращает ли
     * данный метод NULL
     */
    @Test
    public void stringNameReturnNotNullPositiveTest() {
        Assertions.assertNotNull(Methods.stringName(lines));
    }

    /**
     * Тест метода stringName(List<String> lines) который поверяет на ошибку
     * IllegalArgumentException если stringListName == null
     */
    @Test

    public void stringNameIllegalArgumentExceptionListEqualsNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.stringName(null));
    }

    /**
     * Тест метода stringName(List<String> lines) который поверяет на ошибку
     * IllegalArgumentException если lines был пуст
     */
    @Test
    public void stringNameIllegalArgumentExceptionEmptyListTest() {
        lines = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.stringName(lines));
    }

    // ---------------------------------------1. stringLastNameList ------------------------------------

    /**
     * Тест метода stringLastName(List<String> lines) который достает с каждой строки имена,
     * На вход:
     * private List<String> lines = Arrays.asList(
     * "+1-240-701-5763x6875 - Bryan Edwards",
     * "(432)461-5121 - Margaret Herman",
     * "+1-159-322-4388x60509 - Jeffery Blake",
     * "8853301072 - Bob Griffin MD",
     * "(885)624-5862x792 - Dana Edwards"
     * );
     * На выход:
     * List<String> lastName.size() == 5
     */
    @Test
    public void stringLastNameReturnSizeListPositiveTest() {
        Assertions.assertEquals(5, Methods.stringLastName(lines).size());
    }

    /**
     * Тест метода stringLastName(List<String> lines) который достает с каждой строки имена,
     * На вход:
     * private List<String> lines = Arrays.asList(
     * "+1-240-701-5763x6875 - Bryan Edwards",
     * "(432)461-5121 - Margaret Herman",
     * "+1-159-322-4388x60509 - Jeffery Blake",
     * "8853301072 - Bob Griffin MD",
     * "(885)624-5862x792 - Dana Edwards"
     * );
     * На выход:
     * List<String> lastName.get(0) == Edwards
     * List<String> lastName.get(1) == Herman
     */
    @Test
    public void stringLastNameReturnPositiveTest() {
        String name1 = "Edwards";
        String name2 = "Herman";
        Assertions.assertEquals(name1, Methods.stringLastName(lines).get(0));
        Assertions.assertEquals(name2, Methods.stringLastName(lines).get(1));
    }

    /**
     * Тест метода stringLastName(List<String> lines) который поверяет не возвращает ли
     * данный метод NULL
     */
    @Test
    public void stringLastNameReturnNotNullPositiveTest() {
        Assertions.assertNotNull(Methods.stringLastName(lines));
    }

    /**
     * Тест метода stringLastName(List<String> lines) который поверяет на ошибку
     * IllegalArgumentException если stringListName == null
     */
    @Test

    public void stringLastNameIllegalArgumentExceptionListEqualsNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.stringLastName(null));
    }

    /**
     * Тест метода stringLastName(List<String> lines) который поверяет на ошибку
     * IllegalArgumentException если lines был пуст
     */
    @Test
    public void stringLastNameIllegalArgumentExceptionEmptyListTest() {
        lines = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.stringLastName(lines));
    }
    //----------------------------------------------------2---------------------------------------------

    /**
     * Тест метода returnKeyStartNameLetterValueCount(List<String> stringListName) который создает Map
     * где ключ - первая буква имени, а значение - количество таких имен
     * На вход:
     * размер List<String> == 4 ("Bryan", "Margaret", "Jeffery","Bob","Dana")
     * На выход:
     * размер  Map<Character, Long> map.size() == 3 [B=2, M=1, J=1, D=1]
     */
    @Test
    public void returnKeyStartNameLetterValueCountMapLengthPositiveTest() {
        Assertions.assertEquals(4, Methods.returnKeyStartNameLetterValueCount(stringListName).size());
    }

    /**
     * Тест метода returnKeyStartNameLetterValueCount(List<String> stringListName) который создает Map
     * где ключ - первая буква имени, а значение - количество таких имен
     * На вход:
     * размер List<String> == 4 ("Bryan", "Margaret", "Jeffery","Bob","Dana")
     * На выход:
     * размер  Map<Character, Long> map.get('B') == [B=2]
     */
    @Test
    public void returnKeyStartNameLetterValueCountPositiveTest() {
        Assertions.assertEquals(2, Methods.returnKeyStartNameLetterValueCount(stringListName).get('B'));
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
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnKeyStartNameLetterValueCount(null));
    }

    /**
     * Тест метода returnKeyStartNameLetterValueCount(List<String> stringListName) который поверяет на ошибку
     * IllegalArgumentException если stringListName был пуст
     */
    @Test
    public void returnKeyStartNameLetterValueCountIllegalArgumentExceptionEmptyListTest() {
        stringListName = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnKeyStartNameLetterValueCount(stringListName));
    }

    //----------------------------------------------------3---------------------------------------------

    /**
     * Тест метода  returnMostPopularLetterName(Map<Character, Long> characterLongMap) который находит
     * самую часто встречаемою первую букву в именах
     * На вход:
     * данные Map<Character, Long> characterLongMap = [B=2, M=1, J=1, D=1]
     * На выход:
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
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnMostPopularLetterName(null));
    }

    /**
     * Тест метода returnMostPopularLetterName(Map<Character, Long> characterLongMap) который поверяет на ошибку
     * IllegalArgumentException если characterLongMap был пуст
     */
    @Test
    public void returnMostPopularLetterNameIllegalArgumentExceptionMapIsEmptyTest() {
        characterLongMap = new HashMap<>();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnMostPopularLetterName(characterLongMap));
    }

    //----------------------------------------------------4---------------------------------------------

    /**
     * Тест метода  returnInLongNumberPhone(List<String> stringsNumberPhone) который преобразует каждый каждый номер
     * в числовой формат.
     * На вход:
     * данные private List<String> stringsNumberPhone = Arrays.asList(
     * "+1-240-701-5763x6875",
     * "(432)461-5121",
     * "+1-159-322-4388x60509",
     * "8853301072",
     * "(885)624-5862x792"
     * );
     * На выход:
     * List<Long> list.get(0) == 124070157636875L,
     * List<Long> list.get(1) == 4324615121L
     * Достаточно проверить пару элементов из массива
     */
    @Test
    public void returnInLongNumberPhonePositiveTest() {
        long numberPhone1 = 124070157636875L;
        long numberPhone2 = 4324615121L;
        Assertions.assertEquals(numberPhone1, Methods.returnInLongNumberPhone(stringsNumberPhone).get(0));
        Assertions.assertEquals(numberPhone2, Methods.returnInLongNumberPhone(stringsNumberPhone).get(1));
    }

    /**
     * Тест метода  returnInLongNumberPhone(List<String> stringsNumberPhone) который преобразует каждый каждый номер
     * в числовой формат.
     * На вход:
     * данные private List<String> stringsNumberPhone = Arrays.asList(
     * "+1-240-701-5763x6875",
     * "(432)461-5121",
     * "+1-159-322-4388x60509"
     * );
     * На выход:
     * List<Long> list.size() == 5
     */
    @Test
    public void returnInLongNumberPhoneSizePositiveTest() {
        Assertions.assertEquals(5, Methods.returnInLongNumberPhone(stringsNumberPhone).size());
    }

    /**
     * Тест метода returnInLongNumberPhone(List<String> stringsNumberPhone) который поверяет не возвращает ли
     * данный метод NULL
     */
    @Test
    public void returnInLongNumberPhonePositiveReturnNotNullTest() {
        Assertions.assertNotNull(Methods.returnInLongNumberPhone(stringsNumberPhone));
    }

    /**
     * Тест метода returnInLongNumberPhone(List<String> stringsNumberPhone) который поверяет на ошибку
     * IllegalArgumentException если stringsNumberPhone == null
     */
    @Test
    public void returnInLongNumberPhoneIllegalArgumentExceptionListIsNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnInLongNumberPhone(null));
    }

    /**
     * Тест метода returnInLongNumberPhone(List<String> stringsNumberPhone) который поверяет на ошибку
     * IllegalArgumentException если stringsNumberPhone был пуст
     */
    @Test
    public void returnInLongNumberPhoneIllegalArgumentExceptionListIsEmptyTest() {
        stringsNumberPhone = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnInLongNumberPhone(stringsNumberPhone));
    }
    //----------------------------------------------------5---------------------------------------------

    /**
     * Тест метода returnSortedLengthName(List<String> stringListName) который  группирует имена по длине имени.
     * На вход:
     * данные List<String> stringListName ("Bryan", "Margaret", "Jeffery","Bob", "Dana")
     * На выход:
     * List<String> name.get(0) == "Bob"
     * List<String> name.get(1) == "Bryan"
     * Достаточно проверить пару элементов из массива
     */
    @Test
    public void returnSortedLengthNamePositiveTest() {
        String name1 = "Bob";
        String name2 = "Bryan";
        Assertions.assertEquals(name1, Methods.returnSortedLengthName(stringListName).get(0));
        Assertions.assertEquals(name2, Methods.returnSortedLengthName(stringListName).get(1));
    }

    /**
     * Тест метода returnSortedLengthName(List<String> stringListName) который группирует имена по длине имени.
     * На вход:
     * данные List<String> stringListName ("Bryan", "Margaret", "Jeffery","Bob", "Dana")
     * На выход:
     * List<String> name.size() == 5
     */
    @Test
    public void returnSortedLengthNameSizeListPositiveTest() {
        Assertions.assertEquals(5, Methods.returnSortedLengthName(stringListName).size());
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
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnSortedLengthName(null));
    }

    /**
     * Тест метода returnSortedLengthName(List<String> stringListName) который поверяет на ошибку
     * IllegalArgumentException если stringListName был пуст
     */
    @Test
    public void returnSortedLengthNameIllegalArgumentExceptionListIsEmptyTest() {
        stringListName = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnSortedLengthName(stringListName));
    }
    //----------------------------------------------------6---------------------------------------------

    /**
     * Тест метода returnUniqueLastName(List<String> stringListLastName) который находит уникальные фамилии.
     * На вход:
     * данные List<String> stringListLastName = Arrays.asList(
     * "Edwards", "Edwards", "Herman", "Blake", "Griffin"
     * );
     * На выход:
     * List<String> list.size() == 4
     */
    @Test
    public void returnUniqueLastNameListSizePositiveTest() {
        Assertions.assertEquals(4, Methods.returnUniqueLastName(stringListLastName).size());
    }

    /**
     * Тест метода returnUniqueLastName(List<String> stringListLastName) который находит уникальные фамилии.
     * На вход:
     * данные List<String> stringListLastName = Arrays.asList(
     * "Edwards", "Edwards", "Herman", "Blake", "Griffin"
     * );
     * На выход:
     * List<String> list.get(0) == "Edwards"
     * List<String> list.get(1) == "Herman"
     */
    @Test
    public void returnUniqueLastNamePositiveTest() {
        String lastName1 = "Edwards";
        String lastName2 = "Herman";
        Assertions.assertEquals(lastName1, Methods.returnUniqueLastName(stringListLastName).get(0));
        Assertions.assertEquals(lastName2, Methods.returnUniqueLastName(stringListLastName).get(1));
    }

    /**
     * Тест метода returnUniqueLastName(List<String> stringListLastName) который поверяет не возвращает ли
     * данный метод NULL
     */
    @Test
    public void returnUniqueLastNamePositiveReturnNotNullTest() {
        Assertions.assertNotNull(Methods.returnUniqueLastName(stringListLastName));
    }

    /**
     * Тест метода  returnUniqueLastName(List<String> stringListLastName) который поверяет на ошибку
     * IllegalArgumentException если stringListLastName == null
     */
    @Test
    public void returnUniqueLastNameIllegalArgumentExceptionListIsNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnUniqueLastName(null));
    }

    /**
     * Тест метода returnUniqueLastName(List<String> stringListLastName) который поверяет на ошибку
     * IllegalArgumentException если stringListLastName был пуст
     */
    @Test
    public void returnUniqueLastNameIllegalArgumentExceptionListIsEmptyTest() {
        stringListLastName = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnUniqueLastName(stringListLastName));
    }
    //----------------------------------------------------7---------------------------------------------

    /**
     * Тест метода returnFirstLastLetterAlphabetName(List<String> stringListName) который сортирует в обратном
     * алфавитном порядке.
     * На вход:
     * данные List<String> stringListName ("Bryan", "Margaret", "Jeffery","Bob","Dana")
     * На выход:
     * вернет ("Margaret", "Jeffery", "Dana", "Bryan", "Bob")
     */
    @Test
    public void returnFirstLastLetterAlphabetNamePositiveTest() {
        List<String> list = Arrays.asList("Margaret", "Jeffery", "Dana", "Bryan", "Bob");
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
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnFirstLastLetterAlphabetName(null));
    }

    /**
     * Тест метода returnFirstLastLetterAlphabetName(List<String> stringListName) который поверяет на ошибку
     * IllegalArgumentException если stringListName был пуст
     */
    @Test
    public void returnFirstLastLetterAlphabetNameIllegalArgumentExceptionListIsEmptyTest() {
        stringListName = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnFirstLastLetterAlphabetName(stringListName));
    }


    //----------------------------------------------------9---------------------------------------------

    /**
     * Тест метода returnAvgLengthName(List<String> stringListName) который рассчитывает среднюю длину имени
     * На вход:
     * данные List<String> stringListName ("Bryan", "Margaret", "Jeffery","Bob","Dana")
     * На выход:
     * вернет 5.4 (double)
     */
    @Test
    public void returnAvgLengthNamePositiveTest() {
        Assertions.assertEquals(5.4d, Methods.returnAvgLengthName(stringListName));
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
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Methods.returnAvgLengthName(null));
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