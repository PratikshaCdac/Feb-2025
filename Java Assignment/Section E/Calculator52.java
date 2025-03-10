import java.util.Scanner;
class Calculator52
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the operation which you want to do(+,-,*,/");
		char c = sc.next().charAt(0);
		double result;
		switch(c){
			case '+':
                result = a + b;
				System.out.println("Result: " + result);
                break;
            case '-':
                result = a - b; 
				System.out.println("Result: " + result);
                break;
            case '*':
                result = a * b;
				System.out.println("Result: " + result);				
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
					System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please use one of +, -, *, /.");
        }
		//System.out.println("Result: " + result);
		
	}
}
		
		
