package practice.leetcode.HowManyTimesRotates;

public class HowManyTimesRotates {
    public static void main(String[] args) {
        int[] array = {8, 9, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(searchIndex(array));
    }

    private static int searchIndex(int[] arrays) {
        int start = 0;
        int end = arrays.length - 1;

        while (start <= end) {
            if (arrays[start] <= arrays[end]) {
                return start;
            }
            int mid = (start + end) / 2;
            int next = (mid + 1) % arrays.length;
            int prev = (mid - 1 + arrays.length) % arrays.length;

            if (arrays[mid] >= arrays[next]) {
                start = mid + 1;
            } else if (arrays[mid] >= arrays[prev]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
