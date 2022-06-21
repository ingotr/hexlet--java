package io.hexlet.arrays;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers1 = {};
        int[] numbers2 = {10, 1, 3};
        int[] numbers3 = {0, 4, 0, 10, -3};

        bubbleSort(numbers1);
        bubbleSort(numbers2);
        bubbleSort(numbers3);

        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(numbers3));
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;

        do {
            swapped = false;

            int temp;
            for (int i = 0; i < arr.length - 1; i++) {
                temp = arr[i];
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
