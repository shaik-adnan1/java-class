package ses2.classes;

public class problems {
    // Traverse the array and return the maximum value using linear search logic.
    public static int returnMax(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 21, 24, 122, 23, 44, 23, 56 };

        int maxVal = returnMax(arr);

        System.out.println("The Maximum value from the array is: " + maxVal);

    }
}