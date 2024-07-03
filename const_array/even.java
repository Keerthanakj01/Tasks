import java.util.Scanner;
public class even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of array element:");
        int n = sc.nextInt();


        System.out.println("Enter the elements in array:");
        int[] a =new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        System.out.println("Even number in the Array: ");
        for(int i=0; i<n; i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
        


        
    }
    
}
