import java.util.Scanner;
public class Average
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
double d;
d=(a+b+c)/3;
System.out.println("Average of three number's are:" + d);

}
}