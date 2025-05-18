package oopsConcepts.Polymorphism;
//java's shape shifting power has 2 types

// 1.Compile time - method overloading (comp-over)

public class multitasker {
     public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));     // Calls int version
        System.out.println(calc.add(5.5, 10.2)); // Calls double version
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

/*•	Why do we do this? 
Java doesn’t allow two methods with the same signature,
so we overload methods to do multiple things using the same name.  */
   

