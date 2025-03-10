import java.util.Scanner;
public class CountBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
        int count = 0; 
        while (num != 0) {
            num = num & (num - 1);  
            count++; 
        }

        System.out.println("Number of 1s in binary representation: " + count);
    }
}
