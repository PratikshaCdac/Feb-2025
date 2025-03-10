import java.util.Scanner;

public class LargestNumberUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int n3 = sc.nextInt();

        // Use ternary operator to find the largest number
        int largest = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);

        // Display the result
        System.out.println("The largest number is: " + largest);
    }
}
