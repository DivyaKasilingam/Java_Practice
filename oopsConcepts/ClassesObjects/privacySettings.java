package oopsConcepts.ClassesObjects;

//an ex of this,access modifiers

public class privacySettings {
    private String model= "Tesla"; // Private: Can only be accessed within this class
    privacySettings(){
        System.out.println(model); //tesla
    }
    public String getModel(String model) {
      
        System.out.println(this.model); //tesla

        return model; // kyota , Public getter method
    }

    public String setModel(String model) {
        this.model = model;
        model="verna";
        System.out.println(this.model);  //hyundai
        return model;   //verna
    }

    public static void main(String[] args) {
        privacySettings keyobj = new privacySettings();
        System.out.println( keyobj.getModel("kyota"));
        System.out.println( keyobj.setModel("Hyundai"));

    }
    
}
