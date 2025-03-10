import java.util.Scanner;
public class StudentResult {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int percentage=sc.nextInt();
        

        // Using ternary operator to check if the percentage is >= 40
        String result = (percentage >= 40) ? "Pass" : "Fail";

        System.out.println(result);
    }
}
