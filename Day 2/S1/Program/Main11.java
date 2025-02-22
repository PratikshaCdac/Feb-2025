public class Main11 { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        if (arr.length > 5) {  // Check if the index is within bounds
            System.out.println(arr[5]); 
        } else {
            System.out.println("Index out of bounds");
        }
    } 
}