import java.util.Scanner;
// i'm the loops- for,while,do...while
// i also have break and continue with me

public class RepeatAfterME {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        int i,j,k ;
        System.out.print("Enter value of i: ");
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        System.out.print("Enter value of j: ");
        j = scan.nextInt();
        System.out.print("Enter value of k: ");
        k = scan.nextInt();

        while(i <= 5) {
            System.out.println("Hi " + i);
            i++;
        }

        do {
            System.out.println("Heyy " + j);
            j++;
        } while(j <= 5);
                
        for(int n = k; n <= 5; n++) {
            System.out.println("Helllo " + n);
        }
        
        
        System.out.print("Enter value of l: ");
        for(int l = scan.nextInt(); l <= 5; l++) {
            if(l == 3) break;
            System.out.println(l); // prints 1, 2
        }

        System.out.print("Enter value of m: ");
        for(int m = scan.nextInt() ; m <= 5; m++) {
            if(m == 3) continue;
            System.out.println(m); // skips 3
        }
                    
    }
}
