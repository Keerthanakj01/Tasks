import java.util.Scanner;
public class SignCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        int sign = (number > 0) ? 1 : (number < 0) ? -1 : 0;
        switch (sign) {
            case 1:
                System.out.println("The number is positive.");
                break;
            case -1:
                System.out.println("The number is negative.");
                break;
            case 0:
                System.out.println("The number is zero.");
                break;
            default:
                System.out.println("Unexpected error.");
                break;
        }
        scanner.close();
    }
}
