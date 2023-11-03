package practice.leetcode.climbingStairs;
public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(new ClimbingStairs().climbingStairs(n));
    }
    private int climbingStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
