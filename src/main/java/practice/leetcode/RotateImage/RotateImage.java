package practice.leetcode.RotateImage;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(array);
    }
    public static void rotate(int[][] matrix) {
        int M = matrix.length;

        for(int i = 0; i < M; i++) {
            for(int j = i; j < M; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < M/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][M-1-j];
                matrix[i][M-1-j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
