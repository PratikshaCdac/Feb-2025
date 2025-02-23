import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take base input
        System.out.print("Input base number: ");
        int base = scanner.nextInt();

        // Take exponent input
        System.out.print("Input exponent number: ");
        int exponent = scanner.nextInt();

        // Calculate power using Math.pow method
        int result = (int) Math.pow(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power " + exponent + " is " + result);

        // Close the scanner
        scanner.close();
    }
}
