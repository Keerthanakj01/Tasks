import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
    int age;
    @SuppressWarnings("resource")
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the age");
    age=sc.nextInt();
        if(age >= 18) {
            System.out.println("The person is eligible to vote:");
        }
        else{
            System.out.println("The person is not eligible to vote:");
        }
    }
}
