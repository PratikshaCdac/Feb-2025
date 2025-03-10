import java.util.Scanner;
class DivisibleBy3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		while (a >= 3) {
            a -= 3;
        }
		if (a == 0) {
            System.out.println("The number is divisible by 3.");
        } 
		else {
            System.out.println("The number is NOT divisible by 3.");
        }
	}
}