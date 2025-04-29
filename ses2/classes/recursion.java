package ses2.classes;

public class recursion {
    // When a methods calls itself it's called recursion.

    // general way of looping and printing numbers
    public static void printNumbers(int n) { // n = 5
        for (int i = 0; 6 < n; i++) {
            // perform some operation.
            System.out.println(i + 1);
        }
    }

    public static void printNumbersRecursion(int n) {
        // we want to print a list of numbers until 5.
        // 1. base case. (stopping condition)
        if (n > 5) {
            return;
        }
        // 2. recursive case.
        System.out.println(n);
        printNumbersRecursion(n + 1);
    }

    // factorial problem.

    public static int factorial(int n) {
        int result = 1;

        if (n == 0 || n == 1) {
            System.out.println("The Factoial is 1");
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("result init: " + result);
            result = result * i;
        }
        return result;
    }

    public static int factorialRecursion(int n) {
        // recursion sey karthey hai :)

        // 1. Base case
        if (n == 0 || n == 1) {
            System.out.println("The Factoial is 1");
            return 1;
        }
        System.out.println("Int in loop: " + n);
        return n * factorialRecursion(n - 1);

    }

    public static void main(String[] args) {
        // printNumbers(5);
        // printNumbersRecursion(1);
        // int factorialResult = factorial(5);
        // int factorialResult1 = factorial(0);
        // System.out.println("Factorial is: " + factorialResult);
        // System.out.println("Factorial is: " + factorialResult1);

        int factorialResult = factorialRecursion(5);

        System.out.println("Factorial is: " + factorialResult);

    }

}
