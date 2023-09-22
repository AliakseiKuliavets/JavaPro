package homeWork.algorit._19_09_23;

//Дан отсортированный массив, в котором все элементы встречаются дважды (один за другим), а один элемент появляется только один раз.
//        Написать метод для нахождения этого элемента.
//        Решить задачу
//
//
//        через простой цикл
//        2*. через бинарный поиск
public class Methods {

    // через простой цикл
    public void findAnElementThatAppearsOnce(int[] myArray) {
        if (myArray.length == 0) {
            System.out.println("Array is Empty");
        }
        if (myArray.length == 1) {
            System.out.println("Уникальный элемент: " + myArray[0]);
        }
        if (myArray[myArray.length-1] != myArray[myArray.length - 2]) {
            System.out.println("Уникальный элемент: " + myArray[myArray.length-1]);
        }
        for (int i = 1; i < myArray.length; i += 2) {
            if (myArray[i - 1] != myArray[i]) {
                System.out.println("Уникальный элемент: " + myArray[i - 1]);
                break;
            }
        }
    }

    //через бинарный поиск
    public void findAnElementThatAppearsOnceBinary(int[] myArray) {
        if (myArray.length == 0) {
            System.out.println("Array is Empty");
        }
        if (myArray.length == 1) {
            System.out.println(myArray[0]);
        }
        int left = 0;
        int right = myArray.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == 0 || mid == myArray.length - 1) {
                System.out.println("Уникальный элемент: " + myArray[mid]);
                return;
            }

            if (myArray[mid] != myArray[mid - 1] && myArray[mid] != myArray[mid + 1]) {
                System.out.println("Уникальный элемент: " + myArray[mid]);
                return;
            } else if (myArray[mid] == myArray[mid - 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
