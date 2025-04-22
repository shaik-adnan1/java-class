package ses1;
public class HelloWorld {

    // main method
    public static void main(String[] args) {
        // printing to console
        System.out.println("Hey there i am Adnan"); // prints in a new line. 
        System.out.print("i love anime");
        System.out.print("i play circket");


        // Variable (stores a value)
        // Data types
        int age = 20;
        boolean isJava = true;
        char grade = 'A'; // single lettered string in single quotes
        double weatherToday = 3.5; // 15 deciamls 
        String name = "Bakugo";
        float myFloatNum = 3.1433333f; // 7 deciamals precision

        System.out.println(age);
        System.out.println(isJava);
        System.out.println(grade);
        System.out.println(weatherToday);
        System.out.println(name);
        System.out.println(myFloatNum);

        // Operations

        int a = 30;
        int b = 20;

        System.out.println("A + B = " + (a+b)); 
        System.out.println("A - B = " + (a-b));
        System.out.println("A * B = " + (a*b));
        System.out.println("A / B = " + (b/a));
        System.out.println("A % B = " + (a%b));

        // Comparision operators

        // Any comparision operation returns a boolean value 
        System.out.println("A > B = " + (a > b)); // 10 > 20 = false
        System.out.println("A < B = " + (a < b)); // 10 < 20 = true
        System.out.println("A >= B = " + (a >= b)); // 10 >= 20 = false
        System.out.println("A <= B = " + (b <= a)); // 10 <= 20 = true
        System.out.println("A == B = " + (a == b)); // 10 == 20 = false
        System.out.println("A != B = " + (a != b)); // 10 != 20 = true

        // Logical Operators

        /*
         * AND - && - 
         * NOT - ! - 
         */
        
        int c = 50;
        int d = 40;

        // AND operator - returns true if both values are true, else false
        System.out.println((a > b) && (c > d)); // 30 > 20 && 50 > 40 - true && true
        // true and false - false
        // true and true - true
        // false and flase - false 

        // NOT operator - returns opposite of a boolean value 
        // !flase -> returns true
        // !true -> return false

        System.out.println("NOT flase " + !false);
        System.out.println("NOT true " + !true);


    }
} 


