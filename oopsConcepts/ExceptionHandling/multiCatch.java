package oopsConcepts.ExceptionHandling;

//Multiple Catch Blocks – Handling Different Errors

public class multiCatch {
    @SuppressWarnings({ "unused", "null" })
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            String str = null;
            System.out.println(str.length());  // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (NullPointerException e) {
            System.out.println("Null value encountered!");
        }
    }

    
}
