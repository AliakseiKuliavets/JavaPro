package practice.leetcode.day_23_12_27;

import java.util.*;

import static java.lang.Math.random;

public class Some {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
        System.out.println(Arrays.toString(getNoZeroIntegers(10000)));

        for (int i = 0; i < 20; i++) {
            System.out.println(UUID.randomUUID());
        }
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : stones) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            int x = queue.poll();
            if (queue.isEmpty()) {
                return x;
            }
            int y = queue.poll();
            queue.add(x - y);
        }
        return 0;
    }

    public static int[] getNoZeroIntegers(int n) {
        int a = n;
        int b = 0;
        while (n > 0) {
            a--;
            b++;
            if (nonZero(a) && nonZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[0];
    }

    private static boolean nonZero(int n) {
        while (n > 0) {
            if (n % 10 == 0)
                return false;
            n /= 10;
        }
        return true;
    }
}
