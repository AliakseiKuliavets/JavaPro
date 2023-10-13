package homeWork.algorit._13_10_23;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(7, 2));
        System.out.println(sum(12, 3));
        System.out.println(sumRec(7, 2,1));

    }

    private static int sum(int n, int m) {
        if (m < 0) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % m == 0) {
                sum += i;
            }
        }
        return sum;
    }
    private static int sumRec(int n, int m, int current) {
        if (current > n) {
            return 0;
        }
        if (current % m == 0) {
            return current + sumRec(n, m, current + 1);
        } else {
            return sumRec(n, m, current + 1);
        }
    }
}
