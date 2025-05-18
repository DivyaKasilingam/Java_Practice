package oopsConcepts.ExceptionHandling;

import java.util.Scanner;

//Throwing Exceptions – You Get an Exception!
//'throw' keyword

public class throwExcep {
         @SuppressWarnings({ "resource", "unused" })
        public static void main(String[] args) {
            AgeValidator validator = new AgeValidator();
          
            int A ;
            System.out.print("Enter your AGE: ");
            Scanner scan = new Scanner(System.in);
            A = scan.nextInt();
            validator.validateAge(A);  // This will throw an exception acc to user i/p
            validator.validateAge(16);  // This will throw an exception

        }
}
class AgeValidator {
        void validateAge(int age) {
            if (age < 18) {
                throw new ArithmeticException("Age must be 18 or older.");
                //manually throw an exception when something goes wrong
            } else {
                System.out.println("Age is valid.");
            }
        }
    }