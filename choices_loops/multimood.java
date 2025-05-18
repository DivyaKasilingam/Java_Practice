import java.util.Scanner;

//i'm the if else if

public class multimood {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int m;
        System.out.print("Enter your marks: ");
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();

if(m>= 90) {
    System.out.println("A+ babe!!");
} else if(m >= 75) {
    System.out.println("B+ and still bossin it!");
} else {
    System.out.println("Work a lil more, smarty pants!");
}

    }
    
}
