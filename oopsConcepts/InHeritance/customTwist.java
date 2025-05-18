package oopsConcepts.InHeritance;

public class customTwist {
     public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();  // Outputs: Animal makes a sound

        Dog myDog = new Dog();
        myDog.sound();  // Outputs: Dog barks
        myDog.eat();  // ex2 of override
        myAnimal.eat(); 
        
        Animal mycat= new Cat();
        mycat.eat();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    void eat() {
        System.out.println("This animal eats food.");
    }

}

class Dog extends Animal {
    @Override
    void sound() {  // Overriding parent method  ,
        System.out.println("Dog barks");  // thanks mom i will do it my way
    }
    void eat() {
        System.out.println("Dog only eats food.");
    }

}

class Cat extends Animal {
    // without overriding label , java still take it as overriding cuz of the same method name and para in parent and child class
    void sound() {  
        System.out.println("Cat meows");
    }
    void eat() {
        System.out.println("cat only eats fish.");
    }

}


   

