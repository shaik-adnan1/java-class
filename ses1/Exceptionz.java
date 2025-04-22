// package ses1;
// // public class Exceptionz {

// // // Exception and Exception handling

// // public static void main(String[] args) {
// // // // An Exception is an unwanted event/error that occurs during the
// execution
// // // of our code/program
// // // // that blocks/disrupts the normal flow

// // // int a = 10;
// // // int b = 0;

// // // int result = a/b;

// // // //There is an error with the print statement because int result = a/b =
// 10/0,
// // // which is not a number
// // // // Code will stop running when there is an error
// // // System.out.println(result);
// // // System.out.println("My name is Saif");

// // // This is where exception handling comes into play
// // // try catch exception handling is like an if else statement but for
// errors
// // // try checks for errors
// // // catch handles the error so that the rest of the code runs
// // // types of Exception

// // // 1. ArithmeticException - Exceptions related to Arithmetic operations
// // // 2. NullPointerException - Exceptions that return null.
// // // 3. ArrayIndexOutOfBoundsException -
// // // 4. FileNotFoundException

// // try {
// // int a = 10;
// // int b = 0;

// // int result = a / b; // 10/0 -> error
// // System.out.println(result);

// // int[] numbers = { 1, 3, 2, 5, 8, 2 };
// // System.out.println(numbers[20]); // -> index out of bound

// // } catch (ArrayIndexOutOfBoundsException ArrE) {
// // // inside catch, we write Exception e to store the error, in our case
// result
// // // a/b
// // System.out.println(ArrE);
// // System.out.println("Array index out of bound error occured");
// // } catch (ArithmeticException ArE) {
// // System.out.println(ArE);
// // System.out.println("Arithematic exception error occured");
// // } catch (Exception err) {
// // System.out.println(err);
// // System.out.println("Array index out of bound error occured");
// // }
// // System.out.println("My name is Saif");

// // //
// // }
// // }

// import java.io.*;

// public class Exceptionz {
// int age = 16;

// static void checkAge(int age) throws AgeNotEligibleException {
// if (age < 16) {
// System.out.println("You must be 16 or older");
// throw new AgeNotEligibleException("You must be 16 or older");
// }

// System.out.println("You are Eligible for a license");
// }

// public static void main(String[] args) {

// try {
// int a = 10;
// int b = 5;
// int result = a / b;

// int[] RandomArray = { 1, 5, 8, 3, 4 };
// System.out.println(RandomArray[2]);
// System.out.println("The result of dividing" + a + " and" + b + "is " +
// result);

// checkAge(12);

// // Nullpointer Exception
// // String StudentName = null;
// // System.out.println(StudentName.length());

// // FileNotFoundException

// // FileReader reader = new FileReader("kjcnakjdca.txt");
// // System.out.println(reader);

// //
// FileReader file = new FileReader("Generics.java");
// file.close();
// file.read();

// } catch (ArithmeticException error) {
// System.out.println("The error is --> " + error);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("The error for your array is --> " + e);
// } catch (NullPointerException NEx) {
// System.out.println("The error for your null is --> " + NEx);
// } catch (FileNotFoundException FNF) {
// System.out.println("The error for your FNF is --> " + FNF);
// } catch (IOException IOExec) {
// System.out.println("The error for your FNF is --> " + IOExec);
// } catch (Error ComE) {
// System.out.println("The error for your comming Exception is --> " + ComE);
// } catch (AgeNotEligibleException e) {
// System.out.println(e);
// } catch (Exception e) {
// System.out.println(e);
// } finally {

// }

// // setAge(-10);

// System.out.println("Code is running at line 107");
// }

// // static void setAge(int age) {
// // if (age < 0) {
// // throw new IllegalArgumentException("The age can't be negative");
// // }
// // }

// }