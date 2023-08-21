import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,4,1,3};
        reversArray(array);
        System.out.println(Arrays.toString(array));
    }
    private static void reversArray(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty");
        }

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
}
