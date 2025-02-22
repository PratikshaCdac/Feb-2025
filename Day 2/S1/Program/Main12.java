public class Main12 {
    public static void main(String[] args) { 
        int count = 0;
        while (true) {  // Infinite loop, but can break at a condition
            System.out.println("Finite Loop");
            count++;
            if (count >= 5) {
                break;  // Exit the loop after 5 iterations
            }
        } 
    } 
}
