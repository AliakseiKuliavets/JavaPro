package practice.leetcode.removeElem;

public class RemoveElem {
    public static void main(String[] args) {
        int[] num = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(num,val));
    }
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int uniqueNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[uniqueNum] = nums[i];
                uniqueNum++;
            }
        }
        return uniqueNum;
    }
}
