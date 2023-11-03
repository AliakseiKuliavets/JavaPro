package summarySession.friday180823;

public class RecursionTask {
    public static void main(String[] args) {
        System.out.println(power(2,4));
        System.out.println(powerRec(2,4));
    }
    public static long power(int a, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= a;
        }
        return result;
    }

    public static long powerRec(int a, int power) {
        if (power == 0) {
            return 1;
        }
        return powerRec(a, power - 1) * a;
    }
}
