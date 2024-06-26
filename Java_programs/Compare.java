import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Both numbers are equal.");
        } else if (num1 > num2) {
            System.out.println("The first number "+ num1 + " is greater than the second number " + num2 + "");
        } else {
            System.out.println("The second number " + num2 + " is greater than the first number " + num1 + "");
        }
    }
}