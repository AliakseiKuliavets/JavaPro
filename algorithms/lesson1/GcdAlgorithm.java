package algorithms.lesson1;

public class GcdAlgorithm {
    public static void main(String[] args) {
        int a = 36000;
        int b = 48000;
        long start;
        long end;
        int result;

        start = System.nanoTime();
        result = findGcd(a, b);
        end = System.nanoTime();
        System.out.println(result);
        System.out.println("Time is: " + (end - start));

        start = System.nanoTime();
        result = findGcEuclidean(a,b);
        end = System.nanoTime();
        System.out.println(result);
        System.out.println("Time is: " + (end - start));
    }
    private static int findGcd(int a, int b){
        int x = Math.min(a,b);
        int y = Math.max(a,b);

        for (int i = x; i > 1; i--) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
        }
        return -1;
    }
    private static int findGcEuclidean(int a, int b){
        int x = Math.min(a,b);
        int y = Math.max(a,b);
        int temp = x;

        while (temp != 0) {
            temp = y % x;
            y = x;
            x = temp;
        }
        return y;
    }
}
