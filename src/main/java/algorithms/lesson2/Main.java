package algorithms.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(count(n));
        System.out.println(laderBall(5));
    }

    public static List<Integer> count(int n) {
        List<Integer> list = new ArrayList<>();
        while (n >= 3) {
            list.add(3);
            n-= 3;
        }
        while (n == 2) {
            list.add(2);
            n-=2;
        }
        while (n == 1) {
            list.add(1);
            n--;
        }
        if (n == 0) {
            return list;
        }
        return list;
    }
    public static int laderBall(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;
        return laderBall(n-1) + laderBall(n-2) + laderBall(n-3);
    }
}

