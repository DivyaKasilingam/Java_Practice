package oopsConcepts.Polymorphism;

// 2.Runtime - method overriding (run-err)

public class changingGame {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();  // Outputs: Animal makes a sound

        Dog myDog = new Dog();
        myDog.sound();  // Outputs: Dog barks
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {  // Overriding the parent method
        System.out.println("Dog barks");
    }
}

/*•	Why do we do this? 
This allows the child class to modify the behavior of the inherited method. */
