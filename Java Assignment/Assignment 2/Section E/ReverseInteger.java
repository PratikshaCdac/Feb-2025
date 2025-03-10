import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        int num = sc.nextInt();  // Example input
        int rev = 0;      // Variable to store the reversed number

        // Reversing the number
        while (num != 0) {
            rev = rev * 10 + num % 10;  // Get last digit and add it to rev
            num = num / 10;  // Remove the last digit
        }

        System.out.println("Reversed Number: " + rev);  // Output the reversed number
    }
}
