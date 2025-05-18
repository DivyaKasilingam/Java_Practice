package oopsConcepts.ExceptionHandling;

//Try and Catch – The Error Catchers
//Finally – The Cleanup Crew

public class trioTCF {
            @SuppressWarnings({  "unused" })
            public static void main(String[] args) {
            try {
                int result = 10 / 0;  //// This will cause an ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            } finally {
                System.out.println("This will always execute!");
                // always runs no matter what happens in try-catch block
            }
        }
}
