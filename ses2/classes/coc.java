package ses2.classes;

// Class = Blueprint or template
// Object = Real-world instance made from the blueprint. 

// Object is an instance of a class. 

class Student {
    // Static keyword means the variable or the methods belongs to the class, not
    // the objects of the class
    String UniversityName;
    String myName;
    int myAge;
    String ClassType;

    // Constructors.
    // A constructor is an automatic mehtod that is inbuilt in a class.
    // we use parameters for a constructors.

    Student(int myAge, String myName, String ClassType, String UniversityName) {
        this.myAge = myAge;
        this.myName = myName;
        this.ClassType = ClassType;
        this.UniversityName = UniversityName;
    }

    public void printStudent() {
        System.out.println("Student Details: " + " Name: " + myName + " Age: " + myAge + " ClassType: " + ClassType
                + " UniversityName: " + UniversityName);
    }

}

public class coc {
    public static void main(String[] args) {
        String[] StudentsNames = { "Adnan", "Saif", "Bob", "Mark", "Saifulla" };

        // create 5 students from the array... and print their details...

    }
}
