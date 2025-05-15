package ses2.classes.sorting_algorithms;

import java.util.Arrays;

import javax.management.openmbean.ArrayType;

public class insertionSort {

    // Insertion Sort

    // create a method for insertion sort.
    public static void insertionSortMeth(int[] arr) {
        // create a varible to save array length.

        int n = arr.length;

        // create a nested for loop with 2 different indexes
        // in the first loop the condition should be n - 1;

        // int[] arr = { 1, 2, 2, 2, 5, 6, 1, 7, 9, 3, 12, 12, 12, 44, 21, 1, 0 };
        // arr[previousIndex + 1] = arr[previousIndex];
        // j take care of the left part of the array.
        // i takes care of the right part of the array.

        // we start with the second number in the array.
        // We're going to pick each number starting from index 1 and then insert it into
        // the correct spot to the left of it.
        for (int i = 1; i < arr.length; i++) { // i = 1

            // This is the number we are trying to insert.
            // we saved the number, we're holding in our hand. Now we'll look at the numbers
            // before to it to find where to put it.
            int current = arr[i]; // value = 1

            // Start checking from the number just before the one we picked.
            // we'll compare the current number to the one on it's left. if the previous
            // number is bigger, we'll move it to the right.
            int previousIndex = i - 1; // j = 0
                                       // 9 > 3
            while (previousIndex >= 0 && arr[previousIndex] > current) { // 2 > 3

                // we have top Keep going left as long as:
                // we haven't reached then start.
                // and left number is bigger than our current one.

                // we're walking left. if we find a number bigger than ours, we shift it to the
                // right.

                // Move the bigger number one step to the right.
                // int[] arr = { 1, 2, 2, 2, 3, 5, 6, 7, 9, 12, 12, 12, 44, 21, 1, 0 };
                arr[previousIndex + 1] = arr[previousIndex];

                // Move the next number on the left;
                previousIndex--;
            }

            arr[previousIndex + 1] = current; //

        }

        // we need to compare the first indexed element to the next one.

        // if the next element is smaller, then move the smaller element to it's right
        // position

        // else move forward.

    }

    public static void main(String[] args) {

        // create a new array

        int[] arr = { 2, 1, 2, 5, 6, 1, 7, 12, 9, 12, 3, 44, 21, 1, 0 };
        System.out.println(Arrays.toString(arr));

        insertionSortMeth(arr);
        System.out.println(Arrays.toString(arr));

    }
}
