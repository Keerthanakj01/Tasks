public class ChainExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        // Chaining methods
        sb.append("Hello")
          .append(" ")
          .append("World")
          .append("!");
        
        System.out.println(sb.toString());  
    }
}
