package ses2.classes.searching_algorithm;

public class BinarySearch {
    // left - 0
    // right - -1
    // mid - left + (rigth - left) / 2

    // if middle element is the target, return position. (search successful).

    // if target is greater than the middle element, search the right half (left =
    // mid + 1)
    // target > middle_element - search the right half.
    // target < middle_element - search the left half.

    // public static int BinarySearchMet(int[] arr, int target) {
    // int left = 0;
    // int right = arr.length - 1;

    // while (left <= right) {
    // int mid = left + (right - left) / 2;
    // // 0 + (7 - 0) / 2;
    // // 3

    // if (arr[mid] == target) {
    // return mid;
    // }
    // if (arr[mid] < target) {
    // left = mid + 1; // right search.
    // } else {
    // right = mid - 1; // left search.
    // }
    // }

    // return -1;

    // }

    // 1. intialize two pointer:
    // a. left pointer.
    // left = 0;
    // b. right pointer.
    // right = array.length - 1
    // 2. Repeat while left <= right
    // a. Compute the middle part.
    // middle = left + (right - left) / 2;
    // b. Compare the middle element with the target.
    // if (arr[mid] == target) return mid; (success scenario).
    // if (arr[mid] < target), move the search to the right half:
    // left = mid + 1;
    // if (arr[mid] > target), move the search to the left half:
    // right = mid - 1;

    // if the loop ends and we didn't find the target, return -1;

    public static int BinarySearchMet(int[] arr, int target) {

        // 1. intialize two pointer:

        // a. left pointer.
        // left = 0;
        int left = 0;
        // b. right pointer.
        // right = array.length - 1
        int right = arr.length - 1;

        // 2. Repeat while left <= right
        // a. Compute the middle part.
        while (left <= right) {

            System.out.println("Left index: " + left);
            System.out.println("Right index: " + right);

            // a. Compute the middle part.
            // middle = left + (right - left) / 2;
            int mid = left + (right - left) / 2;

            System.out.println("Mid index: " + mid);

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
                System.out.println("tarrget is greater: " + left);
            }

            if (arr[mid] > target) {
                right = mid - 1;
                System.out.println("tarrget is smaller: " + right);
            }
            System.out.println("-----------------");
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] Numbers = { 10, 12, 23, 34, 35, 56, 67, 89 }; // 8
        // arr = {1, 2, 4, 4, 4, 5, 6}
        int target = 67;

        int returnedIndex = BinarySearchMet(Numbers, target);
        System.out.println("Index of the target: " + returnedIndex);

    }

}
