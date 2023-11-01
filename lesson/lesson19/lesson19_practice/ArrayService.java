package lesson19_practice;

public class ArrayService {

    public int[] getArrayBySize(int size) {
        if (size < 0) {
            throw new IllegalArgumentException();
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public int getArrayElementIndex(int index, int[] array) {
        if (array == null){
            throw new NullPointerException("Нельзя передавать пустой массив");
        }
        if (index < 0 || index > array.length - 1) {
            throw new IndexOutOfBoundsException("Индекс должен быть больше или равно 0 и меньше чем длинна массива");
        }
        return array[index];
    }

    public void setArrayElementIndex(int index,int value, int[] array) {
        if (array == null){
            throw new NullPointerException("Нельзя передавать пустой массив");
        }
        if (index < 0 || index > array.length - 1) {
            throw new IndexOutOfBoundsException("Индекс должен быть больше или равно 0 и меньше чем длинна массива");
        }
        array[index] = value;
    }
}
