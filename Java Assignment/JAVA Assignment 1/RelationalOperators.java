import java.util.Scanner;
public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();

        // Compare using '==' (equal to)
        System.out.println("num1 == num2: " + (num1 == num2));

        // Compare using '!=' (not equal to)
        System.out.println("num1 != num2: " + (num1 != num2));

        // Compare using '>' (greater than)
        System.out.println("num1 > num2: " + (num1 > num2));

        // Compare using '<' (less than)
        System.out.println("num1 < num2: " + (num1 < num2));

        // Compare using '>=' (greater than or equal to)
        System.out.println("num1 >= num2: " + (num1 >= num2));

        // Compare using '<=' (less than or equal to)
        System.out.println("num1 <= num2: " + (num1 <= num2));
    }
}
