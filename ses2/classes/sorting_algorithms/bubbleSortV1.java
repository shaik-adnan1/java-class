package ses2.classes.sorting_algorithms;

import java.util.Arrays;

public class bubbleSortV1 {
    // Bubble Sort
    // 1. Repetedly compares adjacent elemnents and swaps them if they are in the
    // wrong order.
    // 2. Largest value "bubbles up" to the end with each pass.

    /*
     * 
     * 1. Loop through the array.
     * 2. compare the adjecent items.
     * 3. Swap if needed.
     * 4. Repeat this until no more swaps.
     *
     */

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        boolean swapped;
        int loopCount = 0;
        int count = 0;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            System.out.println("We've looped the array " + count++ + " times.");

            System.out.println("1st loop index i: " + i);
            System.out.println("--------");

            for (int j = 0; j < n - 1 - i; j++) {

                loopCount++;
                System.out.println("------------------------------");
                System.out.println("Loop Number: " + loopCount);
                System.out.println("------------------------------");

                System.out.println("2nd loop index j: " + j);
                System.out.println("2nd loop index j + 1: " + j + 1);
                System.out.println("------------------------------");
                System.out.println("Element at 2nd loop - arr[j]: " + arr[j]);
                System.out.println("Element at 2nd loop - arr[j + 1]: " + arr[j + 1]);
                System.out.println("------------------------------");

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    System.out.println("Temp variable temp: " + temp);
                    System.out.println("----------");
                    arr[j] = arr[j + 1]; // 4, 6
                    System.out.println("Swapping arr[j] with next element");
                    System.out.println("arr[j] after swap: " + arr[j]);
                    System.out.println("------------");
                    // arr[2] = arr[2 + 1] - arr[3] //
                    // arr[2] = 6
                    arr[j + 1] = temp;
                    System.out.println("Swapping arr[j + 1] with next element");
                    System.out.println("arr[j + 1] after swap: " + arr[j + 1]);

                    swapped = true;
                    System.out.println("__________________________________________");
                    System.out.println("We made " + swapCount++ + " switches.");
                    System.out.println(Arrays.toString(arr));
                    System.out.println("__________________________________________");

                }
            }
            System.out.println("---------- New Loop -------------");
            System.out.println("__________________________________________");
            System.out.println("Round of complete swap " + Arrays.toString(arr));
            System.out.println("__________________________________________");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 6, 9, 3, 5, 7, 2, 9, 12, 10 };

        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }

}
