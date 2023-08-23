
public class Main {
    public void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(nums,target));
    }
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] + nums[i+1] == target) {
                return new int[]{i , i+1};
            }
        }
        return new int[]{-1};
    }
}
