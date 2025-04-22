package ses1;
/* 
Write a generic class in Java called class Exam2Generic that has two attributes of type S and type F.

Type S class attribute will be used to store the names of a student while the type F attribute will be used to store the final score of a student.

Your code must include the following method - 

1. Appropriate getter and setter methods for all class attributes [0.5 point x 4]

2. Appropriate default constructor to initialize all attributes to the 0 value (or their equivalent) [2 points]
3. Appropriate parameterized constructor to initialize all class attributes to the ones passed as parameters [2 points]

4. A method to print the value of the object's attributes as a String literal [2 points]

5. A method to create an ArrayList of class Exam2Generic objects and initialize them. [2 points]
*/

// 1. create a generic class called class Exam2Generic

// 2. add two attribute types to the class which are S and F.

import java.util.ArrayList;
import java.util.Arrays;

class Exam2Generic<S, F> {
    S name;
    F FinalScore;

    // 1.1 Appropriate getter and setter methods for all class attributes

    @Override
    public String toString() {
        return "The Name is: " + name + " your final score is: " + FinalScore;
    }
    // get
    public S getName() {
        return name;
    }

    // set
    public void setName(S name) {
        this.name = name;
    }

    // get final score

    public F getFinalScore() {
        return FinalScore;
    }

    // set final score
    public void setFinalScore(F FinalScore) {
        this.FinalScore = FinalScore;
    }

    // 2. Appropriate default constructor to initialize all attributes to the 0
    // value

    // 2.1 create a constructor

    public Exam2Generic() {
        // 2.2 Set attributes to zero
        this.name = null;
        this.FinalScore = null;
    }

    // // 3. Appropriate parameterized constructor to initialize all class
    // parameterized constructor.
    public Exam2Generic(S name, F FinalScore) {
        // 3.1 Set attributes to parameter value
        this.name = name;
        this.FinalScore = FinalScore;
    }

    // 4. A method to print the value of the object's attributes as a String literal

    public String printValues() {
        return "Your name is: " + this.name + " and your final score is: " + this.FinalScore;
    }

    // 5. A method to create an ArrayList of class Exam2Generic objects and
    // initialize them

    public void createObjectARRList() {
        ArrayList<Exam2Generic<String, Integer>> students = new ArrayList<>();

        students.add(new Exam2Generic<>("Amaan", 16));
        students.add(new Exam2Generic<>("Amaan2", 16));
        students.add(new Exam2Generic<>("Amaan", 16));

        for (

        Exam2Generic<String, Integer> currentEle : students) {
            System.out.println(currentEle.toString());
        }
    }

}

public class Generics {
    public static void main(String[] args) {

        Exam2Generic<String, Integer> examObj = new Exam2Generic<>("Adan", 77);

        Exam2Generic<String, Integer> examObj2 = new Exam2Generic<>();

        examObj2.setFinalScore(89);
        examObj.setName("Adnan");

        String name = examObj.getName();
        int finalScore = examObj.getFinalScore();

        String displayValues = examObj.printValues();
        System.out.println(displayValues);
        examObj.createObjectARRList();

        System.out.println("Name of the Student is: " + name);
        System.out.println("FinalScore of the Student is: " + finalScore);

        ArrayList<String> namesArr = new ArrayList<>();
        // String[] names = { "Shaik", "Adnan", "Syed", "Saif" };

        namesArr.add("Adnan");
        namesArr.add("Saif");
        //

        System.out.println(namesArr.get(0));
        System.out.println(namesArr.remove("Adnan"));

    }
}

// 3.

// Generics allows us to write code that works with any data type

// useCase: create a class that prints an Integer

// class PrintInteger {
// int theIntergerToPrint;

// public void setIntegerValue(int theIntergerToPrint) {
// this.theIntergerToPrint = theIntergerToPrint;
// }

// public int printInteger() {
// return theIntergerToPrint;
// }

// }

// // usecase: create a class that prints a String

// class PrintString {
// String theStringToPrint;

// public void setStringValue(String theStringToPrint) {
// this.theStringToPrint = theStringToPrint;
// }

// public String printString() {
// return theStringToPrint;
// }

// }

// Problem: Code duplication for different data types
// Solution: A class that can handle any data type

// --- Creating a generic class ---
// class printDataType<S> {
// S valueToPrint; // Integer valueToPrint

// public void setValue(S valueToPrint) { // Interger valueToPrint
// this.valueToPrint = valueToPrint;
// }

// public S printValue() {
// System.out.println("The value to print is: " + valueToPrint);
// return valueToPrint;
// }
// }

// public class Generics {
// public static void main(String[] args) {
// // PrintInteger intObj = new PrintInteger();

// // intObj.setIntegerValue(343);
// // int printValue = intObj.printInteger();
// // System.out.println("The integer to print is: " + printValue);

// // PrintString strObj = new PrintString();
// // strObj.setStringValue("Adnan lvwnksbad");
// // String strPrintValue = strObj.printString();
// // System.out.println("The String to print is: " + strPrintValue);

// printDataType<Integer> intObj2 = new printDataType<>();
// intObj2.setValue(223);
// int valPrnt = intObj2.printValue();
// System.out.println("The generic value to print: " + valPrnt);

// printDataType<String> strObj2 = new printDataType<>();
// strObj2.setValue("Adnan");
// String valPrnt2 = strObj2.printValue();
// System.out.println("The generic value to print: " + valPrnt2);
// }
// }