package summarySession.friday180823;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sumRecurs(5));
    }

    static int sum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    static int sumRecurs(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumRecurs( n -1);
    }
}
