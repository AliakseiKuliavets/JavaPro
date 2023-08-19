package practice.some.Algoritms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int number = 4;
        System.out.println(binarySearch(array,number));
    }
    private static int binarySearch(int[] arrays,int elemToSearch) {
        int firstElem = 0;
        int lastElem = arrays.length - 1;

        while (firstElem <= lastElem) {
            int middleIndex = (firstElem + lastElem) / 2;
            if (arrays[middleIndex] == elemToSearch) {
                return middleIndex;
            } else if (arrays[middleIndex] < elemToSearch) {
                firstElem = middleIndex + 1;
            } else {
                lastElem = middleIndex - 1;
            }
        }
        return -1;
    }
}
