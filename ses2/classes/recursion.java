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

    // Problem: Write a function to return the nth Fibonacci number.

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("sum: " + sum);

            sum = a + b;

            a = b;
            b = sum;
        }

        return sum;
    }

    public static int fibonacciRecursion(int n) {
        // 1. Base Cases.
        if (n <= 1)
            return n;

        System.out.println("--------- start recursion -----------");
        System.out.println("N - 1: " + (n - 1));
        System.out.println("N - 2: " + (n - 2));
        System.out.println("--------- end recursion -----------");

        int sum = fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        // fibonacciRecursion((5 - 1) = 4) + fibonacciRecursion(5 - 2);
        // fibonacciRecursion((4 - 1) = 3) + fibonacciRecursion((4 - 2) = 2) +
        // fibonacciRecursion(3 - 1) + fibonacciRecursion(3 - 2)
        // fibonacciRecursion(3 - 1) + fibonacciRecursion(3 - 2) + fibonacciRecursion(2
        // - 1) + fibonacciRecursion(2 - 1) + fibonacciRecursion(2 - 2) + 1
        // fibonacciRecursion(2 - 1) + 1 + 1 + 1 + 0 + 1
        // 1 + 1 + 1 + 1 + 0 + 1
        // 5
        return sum;
    }

    // Problem: Given an integer array, write a recursive method to compute the sum
    // of its elements.

    public static int ArraySumMethod(int[] numberArray) {

        int sum = 0;

        for (int index = 0; index < numberArray.length; index++) {
            System.out.println("Sum: " + sum);
            System.out.println("numberArray[index]: " + numberArray[index]);

            sum = sum + numberArray[index];
        }

        return sum;
    }

    public static int ArraySumRecursion(int[] arr, int index) {

        // 1. Base case

        if (index == arr.length) {
            return 0;
        }

        // 2. recursive case.

        // arr[index] + ArraySumRecursion(arr, index + 1)
        // 1 +
        // 1 + arr[index + 1] + arr[index + 2] + arr[index + 3] + arr[index + 4] +
        // arr[index + 4] + ArraySumRecursion(arr, index + 1)

        System.out.println("Arr[index]: " + arr[index]);
        System.out.println("Index: " + index);

        int sum = arr[index] + ArraySumRecursion(arr, index + 1);
        return sum;
    }

    // Problem: Write a recursive function to check if a string is a palindrome.

    // public static Boolean isPalindrome(String word, int left, int right) {
    // if (left >= right) {
    // return true;
    // }

    // if (word.charAt(left) != word.charAt(right)) {
    // return false;
    // }

    // return isPalindrome(word, left + 1, right - 1);

    // }

    // Check if a given word is Palindrome.

    public static String isPalindrome(String word) {

        int left = 0;
        int right = word.length() - 1;

        System.out.println(word.charAt(left));
        System.out.println(word.charAt(right));

        // T E N E T
        // 0 1 2 3 4

        while (left < right) {
            System.out.println(" ----------- Before --------");
            System.out.println("Left before the condtion: " + left);
            System.out.println("Right before the condtion: " + right);
            System.out.println(
                    "left Character: -" + (word.charAt(left)) + "-. Right Character: -" + word.charAt(right) + "-");
            System.out.println(" ----------- After --------");

            System.out.println("left != right: " + (word.charAt(left) != word.charAt(right)));
            if (word.charAt(left) != word.charAt(right)) {
                // T != T -> false
                // D != T -> true
                return "The word is not a Palindrome";
            }
            left++;
            right--;
            System.out.println("Left after the condtion: " + left);
            System.out.println("Right after the condtion: " + right);
        }

        return "The word is a Palindrome";
    }

    public static Boolean isPalindromeRecursion(String word, int left, int right) {
        // 1. Base Case (stoping the function execution)

        // D
        // 0

        // left: 0
        // right: 0

        // r a c e c a r
        // 0 1 2 3 4 5 6

        // left: 0
        // right: 6

        // left: 1
        // right: 5

        // left: 2
        // right: 4

        // left: 3
        // right: 3

        if (left >= right) {
            return true; // the word is a palindrome
        }
        if (word.charAt(left) != word.charAt(right)) {
            return false; // nnot a palindrome
        }

        // 2. Recursive Case
        return isPalindromeRecursion(word, left + 1, right - 1);
    }

    public static void main(String[] args) {
        // int[] arrayNum = { 1, 2, 32, 12, 33, 5, 456 };
        // int ArraySumRecursionRes = ArraySumRecursion(arrayNum, 0);

        // printNumbers(5);
        // printNumbersRecursion(1);
        // int factorialResult = factorial(5);
        // int factorialResult1 = factorial(0);
        // System.out.println("Factorial is: " + factorialResult);
        // System.out.println("Factorial is: " + factorialResult1);

        // int factorialResult = factorialRecursion(5);

        // int ArraySumMethodRes = ArraySumMethod(arrayNum);

        // System.out.println("ArraySumMethodres: " + ArraySumMethodRes);

        // int fibonacciRes = fibonacci(2);

        // int[] ArrayNumbers = { 1, 22, 31, 54, 2, 234, 312 };

        // int ArraySumRes = ArraySum(ArrayNumbers, 0);

        // String word = "teneT";
        // Boolean isPalindromeRes = isPalindrome(word, 0, word.length() - 1);

        // System.out.println("fibonacciRes: " + fibonacciRes);
        // System.out.println("The word: " + word + " is a palindrome: " +
        // isPalindromeRes);
        // System.out.println("Factorial is: " + factorialResult);
        // System.out.println("Array sum result: " + ArraySumRes);

        // Problem: Write a recursive function to check if a string is a palindrome.

        // String isPalindromeRes = isPalindrome("D");
        // System.out.println(isPalindromeRes);

        int fibonacciResult = fibonacciRecursion(10);

        System.out.println("fibonacciResult: " + fibonacciResult);

    }
}

//

/**
 * 
 * 
 * factorial of 3
 * 
 * factorial for 1 = 1
 * 
 * 
 * 3*2*1
 * 
 * 3 * 3 - 1 * 3 - 2
 * 
 * 
 * 
 * for factorial of 'n'
 * 
 * we need to stop the excecution at n.
 * 
 * 
 * fibonacci of 5
 * 
 * 0+1=1 -> 1+1=2 -> 2+1=3 -> 3+2=5 -> 5+3=8 -> 8+5=13
 * 
 * fibonacci of 'n'
 * 
 * we need to stop the execution at 5.
 * 
 * palindrome
 * 
 * stopping condition
 * 1. if two letters from left and right doesn't match. -> the word is not a
 * palindrome.
 * or
 * 2. if we reached the center. -> the word is a palindrome
 * 
 * 
 * 
 * 
 */