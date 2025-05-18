package oopsConcepts.Abstraction;
//Abstraction – The Art of Hiding Complexity
//Abstraction is achieved using:-   1.Abstract Classes    2.Interfaces

// 1.Abstract Classes – Java's Blueprint with a Twist
public class blueprint {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // Dog's implementation
        myDog.eat();    // Inherited concrete method
    }

}

abstract class Animal {
    abstract void sound();  // Abstract method, no body
//abstract class can have abstract methods (methods without implementation) 
    void eat() {  // Concrete method with implementation
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {  // Providing implementation for the abstract method
        System.out.println("Dog barks");
    }
}

/*Key Points:
•	Abstract classes are meant to be inherited.
•	If a class contains any "abstract method", the class must be abstract.
 */
