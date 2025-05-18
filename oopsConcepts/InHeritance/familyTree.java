package oopsConcepts.InHeritance;

// family tree "extends" -simple inheritance, family ties "super" in child -parent's methods,

public class familyTree {
     public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method
        myDog.bark();  // Child class method
    }
}
class Animal {  // Parent class
    Animal() {
        System.out.println("Animal constructor.");
    }

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {  // Child class
    Dog() {
        super();  // Calls the parent class constructor
        System.out.println("Dog constructor.");
    }

    void bark() {
        System.out.println("This dog barks.");
    }
}


//________________________________________

/* Constructor in Inheritance – Family Dynamics
When a subclass object is created, the parent class’s constructor is invoked first.
•	If the parent class has a default constructor, it will be called automatically.
•	If the parent class has a parameterized constructor, use super() to pass parameters. */


   

