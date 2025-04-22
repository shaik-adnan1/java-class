package ses1;

// CORE BASICS

// Conditional Statements
// Loops
// Methods
// Class and constructors
// Arrays and operations

/*
 * 
 *  ------------- CONDITIONAL STATEMENTS -------------------
 * 
 *  if Statement - Exectues a block of code IF a condition is true.
 *  else Statement - This block of code is executed wheen the IF condition fails. (only when tagged along with an IF condition)
 * 
 *  else if - Checks for another condition and Executes this block if the condition is true. 
 * 
 * 
 * 
 *  Switch - Statement is used when multiple values need to be checked instead os using multiple if-else. 
 * 
 * ------------- LOOPS -------------------
 * 
 * // for - A block of code is executed in a loop/recursively when we know how many times the loop should run.
 * 
 */

public class Core {
    public static void main(String[] args) {

        /*
         * if (condition1) {
         * 
         * // if conditio is true then this block of code will be executed.
         * 
         * } else if (condition) {
         * 
         * // Checks for another condition and Executes this block if the condition is
         * true.
         * 
         * }
         * else {
         * // This block of code will be executed when the IF condition fails
         * }
         */

        // String dayOfWeek = "Monday";

        // if (dayOfWeek == "Monday") {
        // System.out.println("You need to go to college at 10:00");
        // } else if (dayOfWeek == "Tuesday") {
        // System.out.println("You need to go to college at 11:00");
        // } else if (dayOfWeek == "Wednesday") {
        // System.out.println("You need to go to college at 12:00");
        // } else {
        // System.out.println("You can go out Playing Cricket");
        // }

        // Switch Statements

        // switch (dayOfWeek) {
        // case "Monday":
        // // Code for Execution
        // System.out.println("You need to go to college at 10:00");
        // break;
        // case "Tuesday":
        // // Code for Execution
        // System.out.println("Send a Notificaiton about session");
        // break;
        // case "Wednesday":
        // // Code for Execution
        // System.out.println("You need to go to college at 12:00");
        // break;
        // default:
        // System.out.println("You can go out Playing Cricket");
        // }

        // FOR LOOPS

        // for(intialization; condition; update) {

        // }

        // Print 1 to 5

        // 1 <= 5 - true
        // i++ - 1+1 = 2
        // 2 <= 5 - true
        // i++ = 2+1 = 3
        // 3 <= 5 - true
        // i++ = 3+1 = 4
        // 4 <= 5 - true
        // i++ = 4+1 = 5
        // 5 <= 5 - true
        // i++ = 5+1 = 6
        // 6 <= 5 - false

        for (int i = 1; i <= 5; i++) {
            // Code for execution
            System.out.println("Number:" + i);
        }

        // Print 5 to 1
        for (int i = 5; i >= 1; i--) {
            System.out.println("Number: " + i);
        }

        // 7 days week -
        // 0 - Monday, 1 - Tuesday ... 6 - Sunday

        for (int i = 0; i <= 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("Today is Monday: " + i);
                    break;
                case 1:
                    System.out.println("Today is Tuesday: " + i);
                    break;
                case 2:
                    System.out.println("Today is Wednesday: " + i);

                    break;
                case 3:
                    System.out.println("Today is Thursday: " + i);

                    break;
                case 4:
                    System.out.println("Today is Friday: " + i);

                    break;
                case 5:
                    System.out.println("Today is Saturday: " + i);

                    break;
                case 6:
                    System.out.println("Today is Sunday: " + i);

                    break;

                default:
                    System.out.println("Today you ded: " + i);

                    break;
            }
        }
    }
}
