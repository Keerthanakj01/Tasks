import java.util.Arrays;
public class largest {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,8,9};
        
        Arrays.sort(array);
        
        int Largest = array[array.length - 1];
        
        System.out.println("Largest element in the array: " + Largest);
    }
}
