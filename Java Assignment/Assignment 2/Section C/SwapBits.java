import java.util.Scanner;
public class SwapBits {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
        int evenMask = 0xAAAAAAAA;
        int oddMask = 0x55555555;

        int evenBits = num & evenMask;
        int oddBits = num & oddMask;

        evenBits >>= 1;
        oddBits <<= 1;

        int result = evenBits | oddBits;

        System.out.println("Original number: " + num);
        System.out.println("After swapping odd and even bits: " + result);
    }
}
