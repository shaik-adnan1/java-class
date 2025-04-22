package ses2.classes;

// Arrays / Array Lists and Array Operations. 

import java.util.Arrays;

import java.util.ArrayList;

class Student {
    String name;
    int age;
    String UniversityName;

    Student(String name, int age, String UniversityName) {
        this.name = name;
        this.age = age;
        this.UniversityName = UniversityName;
    }

    void printStudentInfo() {
        System.out.println("Name: " + name + ". Age: " + age + ". University Name: " + UniversityName);
    }

    @Override
    public String toString() {
        return "Student{name= '" + name + "', age: '" + age + "', University Name: '" + UniversityName + "'}";
    }
}

public class newClasses {
    // Array is a collection of elements of the same data type.
    // Array has a fixed size, meaning once created, you cannot change the size.

    public void PrintMyName() {
        System.out.println("Hey Adnan");
    }

    public static void PrintArray() {
        // 1. Create an array.
        String[] names = { "Adnan", "Saif", "Shaik", "Syed" };

        int[] numbers = new int[10];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 50; // create an array of 5 elements.
        numbers[3] = 40;
        numbers[4] = 30;

        // 2. Print it's elements.
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        System.out.println("The length of the array is : " + numbers.length);

        int max = numbers[0];
        for (int currentNumber : numbers) {
            System.out.println(currentNumber);
            if (currentNumber > max) {
                // 10 > 10 -> false
                // 20 > 10 -> true
                // max = currentNumber; // max = 20
                // 50 > 20 - > true
                // max = currentNumber; // max = 50
                // 40 > 50 => false
                // 30 > 50 -> false
                max = currentNumber;
            }
        }
        System.out.println("max number in the array: " + max);

        int sum = 0;
        for (int currentNumber : numbers) {
            sum = sum + currentNumber; // sum = 80
        }
        System.out.println("Sum is : " + sum);

        // ----------------- ArrayList -----------------

        // An ArrayList is a resizable array.

        ArrayList<String> students = new ArrayList<>();

        // retrieve a value from an ArrayList based on an index.

        // Adding new elements to Arraylist.
        // add()

        students.add("Amir");
        students.add("Bob");
        students.add("Christopher");

        // System.out.println(students);

        students.add("Amir");
        students.add("Bob");
        students.add("Christopher");

        System.out.println(students);
        System.out.println("Student at index 2 is: " + students.get(2));

        // set values in an ArrayList
        // set()
        students.set(2, "Adnan");

        System.out.println(students);

        // remove a value in an arrayList
        // remove()
        students.remove(4);
        System.out.println(students);

        // get the Length of an Array list.
        // size()

        System.out.println(students.size());

    }

    public static void main(String[] args) {
        // PrintArray();
        // ArraysClass myArr = new ArraysClass();
        // myArr.PrintMyName();

        // Create an ArrayList and store the student detail object inside that
        // ArrayList.

        // Create 3 different ArrayList
        // 1 for Student name
        // 2 for Student age
        // 3 for Student UniversityName

        ArrayList<String> studentName = new ArrayList<>(
                Arrays.asList("Adnan", "Shaik", "Saif", "Syed", "Bob", "Marley"));
        ArrayList<Integer> studentAges = new ArrayList<>(Arrays.asList(20, 20, 20,
                20, 23, 34));
        ArrayList<String> studentUniversities = new ArrayList<>(
                Arrays.asList("VITAP", "SRM", "UTSA", "Cambirdge", "Oxford", "Osmania"));

        // Create an array to store the Student details Object.
        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; i < studentName.size(); i++) {
            Student s = new Student(studentName.get(i), studentAges.get(i), studentUniversities.get(i));
            studentList.add(s);
        }

        System.out.println(studentList);

    }

}
