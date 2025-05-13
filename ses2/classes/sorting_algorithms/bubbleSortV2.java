package ses2.classes.sorting_algorithms;

import java.util.*;

public class bubbleSortV2 {

    // first recognize if you want to switch or not
    // if yes, then write a if statement condition which states the following
    // if the next element is smaller than previous, switch
    // to switch, you save the first element as the second element and vice versa
    // use a temp variable as a substitute variable that holds the first element's
    // value in the switch
    public static void DoubSort(int[] arr) {
        int n = arr.length;
        int count = 0;
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.println("We've looped the array " + count++ + " times.");

                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("__________________________________________");
                    System.out.println("We made " + swapCount++ + " switches.");
                    System.out.println(Arrays.toString(arr));
                    System.out.println("__________________________________________");

                }
            }
            System.out.println("__________________________________________");
            System.out.println("Round of complete swap " + Arrays.toString(arr));
            System.out.println("__________________________________________");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 1, 5, 7, 9, 6 };
        System.out.println(Arrays.toString(arr));
        DoubSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
