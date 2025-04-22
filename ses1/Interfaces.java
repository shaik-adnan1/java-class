package ses1;

/*
    
    
    Developing a transportation system, that includes different types of vehicles: Cars, Bike, Truck etc...

    Each vehicle has a common behavior
    Start the Vehicle
    Stop the Vehicle

    But they also have unique behaviors:
    Car has an AC System
    Bike has kick start mechanism

    This can be resolved using inheritance -

    BUT The problem is with the common method start()
    What if:

    Car starts with a key
    Bike starts with a Kick
    A truck starts using button


    //Parent Class
    /* 
    class Vehicle{
        void start() {
            System.out.println("Start the Vehicle");
        }
        void stop() {
            System.out.println("Stop the vehicle");
        }
    }
    */

// ------------ Abstract Classes -------------

// can change a class to an abstract class using "abstract" class - to inherite common and unique methods

abstract class Vehicle {

    // We can use both Abstract method and as well as Conceret methods

    // Abstract method- no implementation, it must be implemented in a subclass
    abstract String start();

    // Concrete method
    void stop() {
        System.out.println("Stop the vehicle");
    }
}

// Child Classes
class Bike extends Vehicle {
    @Override
    String start() {
        String CarStart = "This car starts with a key";
        // System.out.println("This bike starts with a kick");
        return CarStart;
    }

    void kickStart() {
        System.out.println("Bike is kick-started");
    }
}

class Car extends Vehicle {
    @Override
    String start() {
        String BikeStart = "This Bike starts with a key";
        // System.out.println("This Bike starts with a key");
        return BikeStart;
    }

    void turnOnAC() {
        System.out.println("Turn on AC");
    }
}

// public class Interfaces {
// public static void main(String[] args) {
// Car myCar = new Car();
// Bike myBike = new Bike();
// System.out.println(myCar.start());
// System.out.println(myBike.start());
// }
// }

// Choosing between Interface and an Abstract class
/*
 * 
 * 
 * 
 */

// ------------ INTERFACES ----------------

// Define the interface with the keyword "interface"

// Car and a Bird

// interface Movable {

// // We can only use Abstract method
// void move(); // Abstract method (no method)

// void turn(); // Abstract method (no method)
// }

// interface Eatable {
// void eat(); // abstract method
// }

// // Inheriting from a interface into the class -

// class Car implements Movable {
// @Override
// public void move() {
// System.out.println("Car moves on wheels");
// }

// @Override
// public void turn() {
// System.out.println("Car turn using the steering wheel");
// }
// }

// class Bird implements Movable, Eatable {

// @Override
// public void move() {
// System.out.println("Bird flies in the sky");
// }

// @Override
// public void turn() {
// System.out.println("Bird turn using it's wings");
// }

// @Override
// public void eat() {
// System.out.println("Bird eats worms");
// }
// }

// class Person implements Eatable {
// @Override
// public void eat() {
// System.out.println("Person eats Ramen");
// }
// }

// public class Interfaces {
// public static void main(String[] args) {
// Car myCarObj = new Car();
// myCarObj.move();
// }
// }