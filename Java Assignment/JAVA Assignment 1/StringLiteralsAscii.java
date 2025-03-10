public class StringLiteralsAscii {
    public static void main(String[] args) {
        char charLiteral = 'A';  
        int charAscii = (int) charLiteral;  
        System.out.println("Character literal: " + charLiteral + ", ASCII value: " + charAscii);
        String stringLiteral = "Hello";
        System.out.print("String literal: " + stringLiteral + ", ASCII values: ");
   
        for (int i = 0; i < stringLiteral.length(); i++) {
            char currentChar = stringLiteral.charAt(i);
            int asciiValue = (int) currentChar;
            System.out.print(asciiValue + " ");
        }
        System.out.println();  
    }
}
