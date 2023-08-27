package practice.leetcode.SQRTx;

public class SqrtX {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(sqrtX(a));
    }
    private static int sqrtX(int a) {
        if (a == 0) {
            return 0;
        }
        return (int) Math.sqrt(a);
    }
}
