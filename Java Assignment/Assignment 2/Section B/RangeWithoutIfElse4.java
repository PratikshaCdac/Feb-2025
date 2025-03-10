import java.util.Scanner;

public class RangeWithoutIfElse4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println((number >= 20 && number <= 50) ? "The number is within the range 20 to 50." : "The number is out of the range 20 to 50.");

        
    }
}
