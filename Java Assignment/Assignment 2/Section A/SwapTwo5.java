import java.util.Scanner;
class SwapTwo5
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Before swapping a: "+a+" and b: "+b);
	a+=b;
	b=a-b;
	a-=b;
	System.out.println("After swapping a: "+a+" and b: "+b);
	}
}