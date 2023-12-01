package practice.leetcode.day_23_12_01;

import java.util.Arrays;

public class Some {
    public static void main(String[] args) {
        int[] nums = {3,2,6,5,0,3};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2){
            return  0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
