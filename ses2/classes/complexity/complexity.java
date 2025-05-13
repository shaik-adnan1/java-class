package ses2.classes.complexity;

public class complexity {
    // O(1) -- constant time;
    // Execution time does not depend on the input size.

    public static void printArrElement(int[] arr) {
        int a = 10; // constant - O(1).

        if (a == 10) { // constant - O(1).
            System.out.println("A is 10"); // constant - O(1).
        }
        System.out.println(arr[0]); // constant - O(1).

    }

    // n*n*n + n =

    // O(n)
    // Time grows linearly with input size.
    public static void arrLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // time complexity - O(n) -
        }
    }

    // Time grows propotional to the cubic of the input size
    public static void arrNestedLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // time complexity - O(n) -
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i]); // time complexity - O(n) -
                for (int k = j + 1; k < arr.length; k++) {
                    System.out.println(arr[i]); // time complexity - O(n) -
                }
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]); // time complexity - O(n) -
        }

    }

    public static int sumUp(int n) {
        long start = System.nanoTime(); // time at start
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
            System.out.println(sum);
        }
        long end = System.nanoTime(); // time at end
        System.out
                .println("Execution time: Start: " + start + ". End: " + end + ". Total time: " + (end - start) + "ns");
        return sum;
    }

    // Time grows propotional to the cubic of the input size
    public static void arrLog(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) { // inputSize / 2
            System.out.println(arr[i]); // time complexity - O(log n) -
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]); // time complexity - O(n) -
        }

    }

    public static void main(String[] args) {
        // int[] arr = { 134, 2, 4, 5, 7, 9 }; // constant - O(1).

        // printArrElement(arr); // O(1) + O(1) + O(1) + O(1)
        // arrLoop(arr); //
        // // 4.O(1) - O(1)
        // // 1

        // arrNestedLoop(arr); // O(n) * O(n) * O(n) + O(n) - O(n^3) + O(n);
        // // n^3 + n;
        // // Time compleity - n^3

        // arrLog(arr); // O(logn) + O(n) - log n + n - n
        // n3 + 4n + n2 + n4 + 1; -

        sumUp(1000000);
    }

}
