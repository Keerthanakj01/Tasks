import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = firstNumber + secondNumber;
                System.out.println("The result is: " + result);
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        scanner.close();
    }
}

