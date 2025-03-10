import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

        // Perform addition
        int addition = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + addition);

        // Perform subtraction
        int subtraction = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + subtraction);

        // Perform multiplication
        int multiplication = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + multiplication);

        // Perform division (integer division)
        int division = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + division);

        // Perform modulus (remainder)
        int modulus = a % b;;
        System.out.println("Modulus: " + a + " % " + b + " = " + modulus);
    }
}
