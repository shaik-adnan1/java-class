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

    public static int BinarySearchMet(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 0 + (7 - 0) / 2;
            // 3

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1; // right search.
            } else {
                right = mid - 1; // left search.
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] Numbers = { 10, 12, 23, 34, 35, 56, 67, 89 }; // 8
        int target = 2983;

        int returnedIndex = BinarySearchMet(Numbers, target);
        System.out.println("Index og the target: " + returnedIndex);

    }

}
