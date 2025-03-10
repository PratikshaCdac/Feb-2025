import java.util.Scanner;
public class IncrementWithoutPlus {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	num = ~(~num);
	System.out.println("Incremented Number: " + num);
    }
}
