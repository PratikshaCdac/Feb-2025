import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // Read the first character input

         String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                        ? "Vowel" 
                        : "Consonant";

        System.out.println("The character '" + ch + "' is a " + result + ".");

 }
 }
 