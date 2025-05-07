package ses2.classes.searching_algorithm;

import java.util.Arrays;

public class LSProblems {
    // 1. You have an array of integers
    // 2. You are given a target Element and
    // 3. You need to return the index of the elements,
    // - whose sum should be equal to the target.

    // Create a method for LS and getting the result.

    public static int[] twoSumResult(int[] arr, int target) {

        // loop thrugh the array and check for sum

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index - 1st loop: " + i);
            System.out.println("Current Element - 1st loop: " + arr[i]);

            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("Index - 2st loop: " + j);
                System.out.println("Current Element - 2st loop: " + arr[j]);

                System.out.println("arr[i]: " + arr[i]);
                System.out.println("arr[j]: " + arr[j]);
                System.out.println("arr[i] + arr[j]: " + arr[i] + " " + arr[j]);

                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }

            }

            // if (arr[i] + arr[i + 1] == target) {
            // return i;
            // }
        }

        return new int[] { -1, -1 };

        // return the indexes of the elements which sums up to the target.

    }

    // return -1 if no elements sum upto the target.

    public static void main(String[] args) {

        // create an array of integers

        int[] Numbers = { 11, 12, 21, 34, 55, 32 };

        int target = 55;

        // invoke the method.
        // pass an array and target in to the method

        int[] arrOfIndexes = twoSumResult(Numbers, target);

        System.out.println(Arrays.toString(arrOfIndexes));

    }
}
