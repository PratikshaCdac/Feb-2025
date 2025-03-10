import java.util.Scanner;
public class CharacterCheck {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0); 

        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a letter";

        System.out.println(result);
    }
}
