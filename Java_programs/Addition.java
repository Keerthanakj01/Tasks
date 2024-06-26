public class Addition {

    public static int add(int a, int b, int c ){
        return a + b + c;
    }
    
    public static void main(String[] args) {
        int sum = add(5 ,10, 15);

        System.out.println("The sum of their three Arguments:" +sum);
    }
}