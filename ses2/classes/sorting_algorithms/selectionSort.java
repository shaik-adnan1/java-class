package ses2.classes.sorting_algorithms;

import java.util.Arrays;

import ses1.arraysOP;

public record selectionSort() {
    // Selection Sort
    // 1. Finds the minimum element and places it at the beginning.
    // 2. repeats for the rest of the array.

    // Create a method for selection sort

    public static void selectionSortMet(int[] arr) {
        int n = arr.length;
        int loopCount = 0;

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n - 1; i++) {
            // loopCount++;
            // System.out.println("---------------");
            // System.out.println("Loop Count: " + loopCount);
            // System.out.println("---------------");
            int minIndex = i;
            // System.out.println("---------------");
            // System.out.println("minumum Index: " + i);
            // System.out.println("element at minumum Index: " + arr[i]);
            // System.out.println("---------------");
            System.out.println("---------------");
            System.out.println("Array minIndex: " + arr[minIndex]);
            System.out.println("---------------");

            for (int j = i + 1; j < n; j++) {
                // System.out.println("---------------");
                // System.out.println("j: " + j);
                // System.out.println("minIndex: " + minIndex);
                // System.out.println("---------------");
                // System.out.println("arr[j]: " + arr[j]);
                // System.out.println("arr[minIndex]: " + arr[minIndex]);
                // System.out.println("---------------");
                if (arr[j] < arr[minIndex]) {

                    minIndex = j;
                  
                }
            }
            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // System.out.println("---------------");
            // System.out.println("after swap arr[j]: " + arr[i]);
            // System.out.println("after swap arr[minIndex]: " + arr[minIndex]);
            // System.out.println("---------------");
            // System.out.println("Swap Count: " + loopCount);
            // System.out.println("Swaap arr: " + Arrays.toString(arr));
        }

    }

    // loop over the array and initialize the minimum index.

    // create a nested loop and compare the current element with the minimum index
    // element

    // do a swap if the with the min index element.

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 2, 3, 9, 10, 2, 1, 4, 2, 1, 6, 4, 1, 8, 9 };
        selectionSortMet(arr);
        System.out.println(Arrays.toString(arr));

    }

}
