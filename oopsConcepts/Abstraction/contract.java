package oopsConcepts.Abstraction;

//Interfaces – Java’s Contract

public class contract {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();  // Dog's implementation

        Animal myCat = new Cat();
        myCat.sound();  // Cat's implementation
    }

}
/* interface-->contract -->implementing class must follow.

 interface only can have method declarations (without body) and constants. */
interface Animal {
    void sound();  // Abstract method
}

class Dog implements Animal {  // Implementing the interface
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {  // Another class implementing the interface
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

/*Key Points:
•	A class implements an interface.
•	An interface can be implemented by multiple classes, ensuring flexibility.
 */

