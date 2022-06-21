package io.hexlet.arrays;

import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] numbers1 = {10, 13, 14, 18, 24, 30};
        int[] numbers2 = {10, 11, 24};
        var result = getIntersectionOfSortedArrays(numbers1, numbers2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getIntersectionOfSortedArrays(int[] firstArr, int[] secondArr) {
        int i = 0;
        int j = 0;
        int[] result = new int[0];
        int resultIndex = -1;

        while (i < firstArr.length && j < secondArr.length) {
            if (firstArr[i] < secondArr[j]) {
                i++;
            } else if (firstArr[i] > secondArr[j]) {
                j++;
            } else {
                result = resize(result);
                result[++resultIndex] = firstArr[i];
                i++;
                j++;
            }
        }
        return result;
    }

    public static int[] resize(int[] arr) {
        int len = arr.length;
        int[] copy = new int[len + 1];
        System.arraycopy(arr, 0, copy, 0, len);
        return copy;
    }
}
