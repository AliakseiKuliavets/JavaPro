package algorithms.lesson3;

public class FindMax {
    public static void main(String[] args) {
        int[] data = {1, 6, 12, 1, 55, 99, 21, 10};
        System.out.println(findMax(data));
        System.out.println(findMaxDivideAndConquer(data, 0));
        System.out.println(power(2, 8));
    }

    private static int findMaxDivideAndConquer(int[] data, int currentIndex) {
        if (currentIndex == data.length - 1) {
            return data[currentIndex];
        }
        int max = findMaxDivideAndConquer(data, currentIndex + 1);
        return Math.max(data[currentIndex], max);
    }

    private static int findMax(int[] data) {
        int max = data[0];
        for (int datum : data) {
            if (datum > max) {
                max = datum;
            }
        }
        return max;
    }



    private static int power(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * power(x, y - 1);
    }
}
