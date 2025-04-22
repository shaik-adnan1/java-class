package ses1;
// // public class methods {
// //     /*
// //      *
// //      *
// //      * Access Modifier - public, private and protected
// //      * Return type - int, String, double - if the method doesn't return anything we
// //      * use the keyword void.
// //      * MethodName - meaningful name for the method
// //      * parameters - is the expected values in a function
// //      * Arguments - actual values of the expected parameters.
// //      *
// //      *
// //      */

// //     // String studentNameMain;
// //     // int age;
// //     // String CollegeName;

// //     // Constructor - Special method that initializes an object when it is created.

// //     // constructor methodName should be it's class name.
// //     // The constructor menthod is invoked as soon as an Object is created on the
// //     // class.

// //     // methods(int number, String name) {
// //     // System.out.println("Constructor invoked." + name + " , " + number);
// //     // }

// //     // return the student details
// //     public String returnStudentDetails(String studentName, int age, String collegeName) {

// //         if (age < 15) {
// //             return "The Student " + studentName + ", is not eleigible to purse college";
// //         }

// //         return "This is " + studentName + ", his age is: " + age + ", he is pursuingin: " + collegeName;
// //     }

// //     public String returnStudentName(String studentNameMain) {
// //         return "Name of the Student is: " + studentNameMain;
// //     }

// //     public String returnAge(int age) {
// //         return "Name of the Student is: " + age;
// //     }

// //     public String returnCollegeName(String CollegeName) {
// //         return "Name of the Student is: " + CollegeName;
// //     }

// //     public static void main(String[] args) {
// //         // creating an object for the class
// //         // we pass arguments for constructors where we create the Object for a class.
// //         methods MethodObj = new methods();

// //         /// got the data from the DataBase
// //         System.out.println(MethodObj.returnStudentDetails("Adnan", 20, "VIT AP"));
// //         System.out.println(MethodObj.returnStudentName("Adnan"));
// //         System.out.println(MethodObj.returnAge(20));
// //         System.out.println(MethodObj.returnCollegeName("VIT AP"));

// //         System.out.println(MethodObj.returnStudentDetails("Student2", 25, "AP"));
// //         System.out.println(MethodObj.returnStudentName("Student2"));
// //         System.out.println(MethodObj.returnAge(25));
// //         System.out.println(MethodObj.returnCollegeName("AP"));
// //     }
// // }

// class Student {
//     int rollno;// instance variable
//     String name;
//     String college = "ITS";// static variable
//     static int id = 0;
//     // constructor

//     Student(int r, String n) {
//         rollno = r;
//         name = n;
//     }

//     // method to display the values
//     void display() {
//         id++;
//         System.out.println(rollno + " " + name + " " + college + " " + id);
//     }
// }

// // Main class to show the values of objects
// public class methods {
//     public static void main(String args[]) {
//         Student s1 = new Student(111, "Karan");
//         Student s2 = new Student(222, "Aryan");
//         // we can change the college of all objects by the single line of code
//         // Student.college="BBDIT";
//         s1.display();
//         s2.display();
//     }
// }

// class Counter {
//     static int count = 0;// will get memory each time when the instance is

//     Counter() {
//         count++;// incrementing value
//         System.out.println(count);
//     }
// }

// // public class methods {
// // public static void main(String args[]) {
// // // Creating objects

// // // count
// // Counter c1 = new Counter(); // count
// // Counter c2 = new Counter(); // count
// // Counter c3 = new Counter(); // count

// // }
// // }

abstract class Shape {

    // area method will return the area of the specified shape.
    abstract double area();

    // Concrete method
    public void printArea() {
        double calculatedArea = area(); // calculatedArea = 287.82;
        System.out.println("The area is: " + calculatedArea);
    }
}

class reactangle extends Shape {
    private double length;
    private double width;

    @Override
    double area() {

        // taking user input using scanner classes
        length = 12.3;
        width = 23.4;

        return length * width;

    }

    // inherited method
    // public void printArea() {
    // double calculatedArea = area(); // calculatedArea = 287.82;
    // System.out.println("The area is: " + calculatedArea);
    // }
}

public class methods {
    public static void main(String[] args) {
        reactangle recObj = new reactangle();
        recObj.printArea();
    }
}
