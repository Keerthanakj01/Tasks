import java.util.Scanner;
public class MultipleOfFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of array element:");
        int n = sc.nextInt();


        System.out.println("Enter the elements in array:");
        int[] a =new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        System.out.println("Multiples of 5 in the array: ");
        for(int i=0; i<n; i++){
            if(a[i]%5==0){
                System.out.println(a[i]);
            }
        }
        


        
    }
    
}
