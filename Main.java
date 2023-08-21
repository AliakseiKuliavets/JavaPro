
public class Main {
    public static void main(String[] args) {
        int[] array = {3,2,3,4,5};
        int number = 9;
        System.out.println(searchIndex(array, number));
    }

    private static int searchIndex(int[] array, int number) {
        if (array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
