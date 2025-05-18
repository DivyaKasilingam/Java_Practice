import java.util.Scanner;
//i'm the switch
public class organized {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int day ;
        System.out.print("Enter your day: ");
        Scanner scan = new Scanner(System.in);
        day = scan.nextInt();

switch(day) {
    case 1: System.out.println("Monday blues!"); break;
    case 2: System.out.println("Tuesday hustle!"); break;
    case 3: System.out.println("Wednesday slay!"); break;
    case 4: System.out.println("Thurssday glow!"); break;
    case 5: System.out.println("Friday tired!"); break;
    default: System.out.println("Weekend vibesss!");
}

    }
}
