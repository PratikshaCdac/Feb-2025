import java.util.Scanner;

public class StringCharASCII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);;
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.println("\nCharacter: " + c + ", ASCII Value: " + (int) c);

        System.out.println(s + ", ASCII Values are: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Character: " + s.charAt(i) + ", ASCII Value: " + (int) s.charAt(i));
        }
    }
}
