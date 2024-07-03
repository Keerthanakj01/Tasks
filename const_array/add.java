import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        System.out.println("Sum of the array elements: " + sum);

    }
}
