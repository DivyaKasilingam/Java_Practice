package oopsConcepts.ClassesObjects;
//classes and objects or aka properties or behaviours 
                            // fields and methods

public class fields_behaviours {
     String model;
        int year;
        fields_behaviours(){// custom wihout para
            System.out.println("im the custom makers");
        }
        fields_behaviours(String m, int y) {  // Constructor with parameters
            model = m;
            year = y;
            System.out.println("model: "+model);
            System.out.println("year: "+year);

        }

        void start() {
            System.out.println("Car is starting...");
        }
    @SuppressWarnings({ "unused"}) 
        public static void main(String[] args) {
            fields_behaviours custom= new fields_behaviours();
            fields_behaviours myCar = new  fields_behaviours("Tesla", 2023); ;  // Creating an object of Car
            myCar.model = "Tesla";   // Setting properties
            myCar.year = 2023;
            
            myCar.start();           // Calling method
        }
    }


