
import java.util.*;
public class GreatestNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the A Number:");
        int a = sc.nextInt();

        System.out.println("Enter the B Number:");
        int b = sc.nextInt();

        System.out.println("Enter the C Number:");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("The greatest number is A: " + a);

        }else if (b >= a && b >= c) {
                System.out.println("The greatest number is B: " + b);
        }else {
            System.out.println("The greatest number is C: " +c); 
        }
    }
    
}
