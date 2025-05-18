package oopsConcepts.Encapsulation;

//The Power of private and Getter/Setter Methods

public class fieldPrivate {
     public static void main(String[] args) {
        Person person = new Person();
        person.setName("Soph");  // Using setter to set the value
        System.out.println(person.getName());  // Using getter to get the value
    }

}

class Person {
    private String name;  // Private field

    // Getter method
    public String getName() {
        return name; // then it returns the updated name since its call after that
    }

    // Setter method
    public void setName(String name) {
        this.name = name;  // now name is changed into soph
    }
   
}


   
