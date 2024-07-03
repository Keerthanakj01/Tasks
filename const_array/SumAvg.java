
import java.util.Scanner;

public class SumAvg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];

        System.out.println("enter the elements in array:");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum += a[i];
        }

        double avg = sum / n;

        System.out.println("Sum of the Array elements: "+sum);
        System.out.println("Average of the Array Elements: "+avg);

       
    }
}
