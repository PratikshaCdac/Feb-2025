import java.util.Scanner;
public class MultiplyByEight {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
        int result = num << 3;
        System.out.println("Number: " + num);
        System.out.println("After multiplying by 8: " + result);
    }
}
