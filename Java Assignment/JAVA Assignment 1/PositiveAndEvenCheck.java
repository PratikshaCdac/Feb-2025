import java.util.Scanner;

public class PositiveAndEvenCheck {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is positive and even using logical operators
        if (number > 0 && number % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("The number is positive but odd.");
        } else if (number <= 0 && number % 2 == 0) {
            System.out.println("The number is non-positive and even.");
        } else {
            System.out.println("The number is non-positive and odd.");
        }

    }
}
