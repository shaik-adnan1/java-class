package ses1;
public class Student {
    /*
     *
     *
     * Access Modifier - public, private and protected
     * Return type - int, String, double - if the method doesn't return anything we
     * use the keyword void.
     * MethodName - meaningful name for the method
     * parameters - is the expected values in a function
     * Arguments - actual values of the expected parameters.
     *
     *
     */

    String studentName;
    int age;
    String CollegeName;

    // // Constructor - Special method that initializes an object when it is
    // created.

    // // constructor methodName should be it's class name.
    // // The constructor menthod is invoked as soon as an Object is created on the
    // // class.

    Student(String studentName, int age, String CollegeName) {
        this.studentName = studentName;
        this.age = age;
        this.CollegeName = CollegeName;
    }

    // return the student details
    public String returnStudentDetails(String studentName) {

        if (age < 15) {
            return "The Student " + this.studentName + ", is not eleigible to purse college";
        }

        return "This is " + this.studentName + ", his age is: " + age + ", he is pursuingin: " + CollegeName;
    }

    public String returnStudentName() {
        return "Name of the Student is: " + studentName;
    }

    public String returnAge() {
        return "Name of the Student is: " + age;
    }

    public String returnCollegeName() {
        return "Name of the Student is: " + CollegeName;
    }

    public static void main(String[] args) {
        // creating an object for the class
        // we pass arguments for constructors where we create the Object for a class.
        Student MethodObj = new Student("adnan", 21, "Sdgv");
        Student MethodObj1 = new Student("notTestName", 12, "vgDF");

        /// got the data from the DataBase
        System.out.println(MethodObj.returnStudentDetails("bciwebdfiqkbd"));
        System.out.println(MethodObj.returnStudentName());
        System.out.println(MethodObj.returnAge());
        System.out.println(MethodObj.returnCollegeName());

        /// got the data from the DataBase
        System.out.println(MethodObj1.returnStudentDetails("Adnan"));
        System.out.println(MethodObj1.returnStudentName());
        System.out.println(MethodObj1.returnAge());
        System.out.println(MethodObj1.returnCollegeName());

    }
}