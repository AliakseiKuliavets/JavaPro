package practice.some.Algoritms;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k =3;
        rotate(array, k);

        System.out.println("Rotated array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    private static void rotate(int[] array, int k) {
        int length = array.length;
        k %= length;

        reverse(array, 0, length - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, length - 1);
    }
}
