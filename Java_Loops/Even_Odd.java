import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int remainder = number % 2;
        switch (remainder) {
            case 0:
                System.out.println("The number is even.");
                break;
            case 1:
                System.out.println("The number is odd.");
                break;
            default:
                System.out.println("Unexpected error.");
                break;
        }
        scanner.close();
    }
}
