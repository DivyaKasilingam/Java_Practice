package oopsConcepts.Polymorphism;

//Runtime Polymorphism – The Ultimate Power Move,
//Upcasting & Downcasting – Java’s Switcheroo

public class ultimateMove {
    public static void main(String[] args) {
        Animal myAnimals = new Dog(); // Upcasting is safe and automatic
        myAnimals.sound();

        Dog myDog = (Dog) myAnimals; // Downcasting, make sure it's safe!
        myDog.sound();

        Animal myAnimal = new Animal();  // Animal object
        myAnimal.sound();  // Calls Animal's sound
/* 
        Dog myDog = (Dog) myAnimal; // Downcasting, make sure it's safe!
        myDog.sound();  ERROR class excdeption
meaning- u said it was a dog but its just clearly an animal
no fur, no bark, no tail, "runtime pov- i'm out"-->so decides to throw an error

*/

        myAnimal = new Animal();  // Dog object, runtime binding
        myAnimal.sound();  // Calls Dog's sound (runtime polymorphism)
  
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

//Upcasting (safe, automatic conversion from subclass to superclass)
//Downcasting (convert back from superclass to subclass; might require a check)
    
/*•	Why do we do this? 
This lets Java decide, based on the object type, which method to call. 
It gives us flexibility! */
