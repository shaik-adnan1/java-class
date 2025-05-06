package ses2.classes.searching_algorithm;

public class LinearSearch {
    // Linear Search

    // Linear search is an algorithm to search for a speicific element in a data
    // structure.
    // Search for a target value inside an array using linear search.
    public static int linearSearch(int[] arr, int target) {
        // Checks through each element one by one

        // 1. you have an array (data stucture).
        // 2. you want to find a specific target element in that array.
        // 3. if the target element is found. we want to return the index at that point.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] StudentIds = { 1, 2, 22, 23, 12, 15, 3 };
        int target = 3;

        int targetElementIndex = linearSearch(StudentIds, target);
        System.out.println("Index at the which the Target Element was Found: " + targetElementIndex);
    }

}
