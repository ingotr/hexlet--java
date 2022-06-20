package io.hexlet.arrays;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][] matrix1 = new int[0][0];
        var result1 = MultiArray.flattenMatrix(matrix1);
        System.out.println(Arrays.toString(result1));

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        var result2 = MultiArray.flattenMatrix(matrix2);
        System.out.println(Arrays.toString(result2));

        int[][] matrix3 = {{1, 2}, {4, 5}, {8, 9}, {11, 12}};
        var result3 = MultiArray.flattenMatrix(matrix3);
        System.out.println(Arrays.toString(result3));
    }

    public static int[] flattenMatrix(int[][] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int[] result = new int[0];

        if (arr.length <= 2) {
            result = new int[arr[0].length + arr[1].length];
            System.arraycopy(arr[0], 0, result, 0, arr[0].length);
            System.arraycopy(arr[1], 0, result, arr[0].length, arr[1].length);
            return result;
        }

        if (arr.length > 2) {
            result = new int[arr[0].length + arr[1].length + arr[2].length + arr[3].length];
            System.arraycopy(arr[0], 0, result, 0, arr[0].length);
            System.arraycopy(arr[1], 0, result, arr[0].length, arr[1].length);
            System.arraycopy(arr[2], 0, result, arr[0].length + arr[1].length, arr[2].length);
            System.arraycopy(arr[3], 0, result, arr[0].length + arr[1].length + arr[2].length, arr[3].length);
        }

        return result;
    }
}
