import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // Read the number from user

        int absValue = (num < 0) ? -num : num;

        System.out.println("The absolute value is: " + absValue);

    }
}
