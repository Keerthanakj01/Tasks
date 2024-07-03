import java.util.Arrays;
public class smallest {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,8,9};
        
        Arrays.sort(array);
        
        int smallest = array[0];
        
        System.out.println("Smallest element in the array: " + smallest);
    }
}
