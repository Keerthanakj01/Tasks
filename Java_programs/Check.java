import java.util.*;
public class Check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 10) {
            System.out.println(num + " is greater than or equal to 10.");
        } else {
            System.out.println(num + " is less than 10.");
        }
    }
    
}
