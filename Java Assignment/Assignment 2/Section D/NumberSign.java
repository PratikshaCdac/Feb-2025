import java.util.Scanner;
public class NumberSign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println("The number is: " + result);
    }
}
