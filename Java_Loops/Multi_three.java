import java.util.Scanner;
public class Multi_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int remainder = number % 3;
        switch (remainder) {
            case 0:
                System.out.println("The number is a multiple of 3.");
                break;
            default:
                System.out.println("The number is not a multiple of 3.");
                break;
        }
        scanner.close();
    }
}
