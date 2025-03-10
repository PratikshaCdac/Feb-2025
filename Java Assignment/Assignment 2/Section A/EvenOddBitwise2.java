import java.util.Scanner;

public class EvenOddBitwise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Use bitwise AND operator to check if the number is even or odd
        if ((number & 1) == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }

    }
}
