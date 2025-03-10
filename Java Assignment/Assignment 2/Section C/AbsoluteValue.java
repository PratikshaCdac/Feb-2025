import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

        // Find the absolute value using bitwise operators
        int mask = num >> 31;         // Extract the sign bit (either 0 or -1)
        int abs = (num + mask) ^ mask; // Adjust the number based on the sign

        System.out.println("Original Number: " + num);
        System.out.println("Absolute Value: " + abs);
    }
}
