package lesson.lesson19.lesson19_practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ArrayServiceTest {
    private final ArrayService service = new ArrayService();
    private int[] ints;
    private int size;
    private int expected;
    private int index;
    private int value;

    @Test
    void getArrayOfIndexChosenSubArrayProof() {
        int a = 9;
        int first = 1;
        int third = 3;
        int fifth = 5;
        ints = service.getArrayBySize(a);
        Assertions.assertEquals(first, ints[0]);
        Assertions.assertEquals(third, ints[2]);
        Assertions.assertEquals(fifth, ints[4]);
    }

    @Test
    void checkArrayLength() {
        size = 5;
        Assertions.assertEquals(size, service.getArrayBySize(size).length);
    }

    @Test
    void getArrayBySizeExceptionsTest() {
        size = -2;
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.getArrayBySize(size));
    }

    @Test
    void getArrayBySizePositiveTest() {
        size = 5;
        Assertions.assertNotNull(service.getArrayBySize(size));
    }

    @Test
    void getArrayElementIndexPositiveTest() {
        size = 5;
        index = 1;
        expected = 2;
        ints = service.getArrayBySize(size);
        Assertions.assertEquals(expected, service.getArrayElementIndex(index, ints));
    }

    @Test
    void getArrayElementIndexExceptionsIndexOutOfBoundsTest() {
        size = 5;
        index = -21;
        ints = service.getArrayBySize(size);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> service
                .getArrayElementIndex(index, ints));
    }

    @Test
    void getArrayElementIndexExceptionsNullPointerTest() {
        index = 2;
        Assertions.assertThrows(NullPointerException.class, () -> service
                .getArrayElementIndex(index, null));
    }

    @Test
    void setArrayElementIndexPositiveTest() {
        size = 5;
        index = 1;
        value = 21;
        expected = 21;
        ints = service.getArrayBySize(size);
        // я вызову метод присвоение
        service.setArrayElementIndex(index, value, ints);
        // а тут проверю прошло ли
        Assertions.assertEquals(expected, service.getArrayElementIndex(index, ints));
    }

    @Test
    void setArrayElementIndexExceptionsIndexOutOfBoundsTest() {
        size = 5;
        index = -21;
        value = 21;
        ints = service.getArrayBySize(size);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> service
                .setArrayElementIndex(index, value, ints));
    }

    @Test
    void setArrayElementIndexExceptionsNullPointerTest() {
        index = 2;
        Assertions.assertThrows(NullPointerException.class, () -> service
                .setArrayElementIndex(index, value, null));
    }
}