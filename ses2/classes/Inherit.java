package ses2.classes;

// parent and child class relationship
abstract class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }

    // Abstract method doesn't have the implementation at the point of creation.
    abstract void isaPetAnimal();

    void eats(String food1) {
        System.out.println("The animal eats: " + food1);
    }
}

interface Flyable {
    void Fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void Fly() {
        System.out.println("A Duck can Fly");
    }

    public void swim() {
        System.out.println("A Duck can Swim");
    }
}

class Dog extends Animal {

    @Override
    void isaPetAnimal() {
        System.out.println("Yes, a Dog can be a Pet");
    }

    // @Override
    // void makeSound() {
    // System.out.println("A Dog Barks");
    // }

    // overloading
    void eats(String food1, String food2) {
        System.out.println("The Dog Eats: " + food1 + " " + food2);
    }
}

class cat extends Animal {
    @Override
    void isaPetAnimal() {
        System.out.println("Yes, a Cat can be a Pet");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.isaPetAnimal();
        dog.eats("Meat", "Biscuits");

        cat CatObj = new cat();
        CatObj.isaPetAnimal();

        Duck duckObj = new Duck();
        duckObj.Fly();
        duckObj.swim();
    }
}