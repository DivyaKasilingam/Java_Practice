package oopsConcepts.ClassesObjects;

// * partydebate static vs non static
// java self reflection is 'this' keyword

public class selfREflection {
    String model;
    static int wheels = 4;  // * Common to all cars

    selfREflection(String model) {
        this.model = model;  // "this" refers to the local variable variable
        //for the parameter thing no need to use 'this' at all
        // model= model; gives error since it has same variable name so to avoid it 
        // we use 'this' keyword
        System.out.println(model);
        System.out.println(wheels);

       
    }
    @SuppressWarnings("unused" )

    public static void main(String[] args) {
        selfREflection oldcar = new selfREflection("tesla");
        int speed= 100;  // * Different for each car
        System.out.println(speed);    // * nonstatic can be used within the block/scope
        System.out.println(wheels);  // * static can be used anywhere
    }
    
}
