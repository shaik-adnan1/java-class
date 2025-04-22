package ses1;
import java.util.Arrays;

public class arraysOP {
    // Array

    // An array is a collection of multiple values stored in memory location.
    // It basically allowa you to store multiple elements of the same type.

    public static void main(String[] args) {

        // SYNTAX
        // datatype[] arrayname = {actualyArray};
        // String[] MYNames = {"adnan", "shaik", "Saif", "4"};

        // int[] MYNamesInt = {1, 3, 4, 5}; // length of the array = 4

        // // Print the whole array
        // System.out.println(Arrays.toString(MYNames));
        // System.out.println(Arrays.toString(MYNamesInt));

        // // Accessing individual elements from an Array
        // System.out.println("Second element from MYNames: " + MYNames[1]);
        // System.out.println("Third element from MYNamesInt: " + MYNamesInt[2]);

        // // Modify elements in an Array
        // MYNames[3] = "Syed";
        // System.out.println("Modified array: " + Arrays.toString(MYNames));

        // Looping/iterating through an Array

        // for(intialization; condition; update) {}
        int[] HousePrices = { 109982, 8232929, 1281920, 282192, 812990 };

        for (int currentHoursePrice : HousePrices) {
            if (currentHoursePrice > 10000000) {
                System.out.println("This house is a LUxurios house with price: " + currentHoursePrice);
            } else if (currentHoursePrice > 5000000 && currentHoursePrice < 10000000) {
                System.out.println("This house is a Moderate house with price: " + currentHoursePrice);
            } else {
                System.out.println("This house is a Humble house with price: " + currentHoursePrice);
            }
        }
    }
}