import java.util.Scanner;
public class Compare{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number >= 10) {
            System.out.println("The number is greater than or equal to 10.");
        } else {
            System.out.println("The number is less than 10.");
        }

        scanner.close();
    }
}
