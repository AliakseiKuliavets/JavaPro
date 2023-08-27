package practice.leetcode.searchInsertPosition;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] array = {1,3,5,6};
        int value = 7;
        System.out.println(searchPositionIndex(array,value));
    }
    private static int searchPositionIndex(int[] array, int value){
        if (array.length == 0) {
            return -1;
        }


        int left = 0;
        int right = array.length -1;
        while (left <= right) {
            int midl = (left + right) / 2;
            if (array[midl] == value){
                return midl;
            } else if (array[midl] < value) {
                left = midl + 1;
            } else {
                right = midl - 1;
            }
        }
        return left;
    }
}
