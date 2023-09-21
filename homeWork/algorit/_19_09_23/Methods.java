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
            System.out.println(myArray[0]);
        }
        for (int i = 1; i < myArray.length; i += 2) {
            if (myArray[i - 1] != myArray[i]) {
                System.out.println(myArray[i - 1]);
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
        while (left < right) {
            int midl = (left + right) / 2;
            int leftNumber = midl - 1;
            int rightNumber = midl + 1;
            if (myArray[midl] != myArray[leftNumber] && myArray[midl] != myArray[rightNumber]) {
                System.out.println(myArray[midl]);
                break;
            } else if (myArray[midl] == leftNumber && myArray[midl] != rightNumber) {
                right++;
            } else {
                left--;
            }
        }
    }
}
