package oopsConcepts.Encapsulation;

import java.util.Scanner;

//Validating Data with Setters – Keep Things Clean

public class validWithSetter {
     @SuppressWarnings("resource")
    public static void main(String[] args) {
        Account account = new Account();
        int bal ;
        System.out.print("Enter Balance to set: ");
        Scanner scan = new Scanner(System.in);
        bal = scan.nextInt();
        account.setBalance(bal);  // Valid balance
        System.out.println(account.getBalance());

        account.setBalance(-100);  // Invalid balance
    }
// can validate the data before modifying the field by adding logic inside the setter method.
}

class Account {
    private double balance;

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method with validation
    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance must be positive!");
        }
    }
}


   
