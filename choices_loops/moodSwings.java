import java.util.Scanner;

// i'm the if else

public class moodSwings {
    public static void main(String[] args) {
        System.out.println("hii");
        int age = 18;
        int a ;
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your agee:");
        a = scan.nextInt();
if(a >= 18 & age == 18) {
    System.out.println("You're an adult, go slay the world!");
} else {
    System.out.println("Too young, still cute though!");
}

    }
}
