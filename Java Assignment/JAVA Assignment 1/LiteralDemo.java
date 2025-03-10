public class LiteralDemo {
    public static void main(String[] args) {
       
        int binary = 0b1010; // Binary representation of 10
        System.out.println("Binary literal (0b1010) = " + binary);

        int octal = 012; // Octal representation of 10
        System.out.println("Octal literal (012) = " + octal);

        int hexadecimal = 0xA; // Hexadecimal representation of 10
        System.out.println("Hexadecimal literal (0xA) = " + hexadecimal);

        float floatLiteral = 3.14f; // Floating-point literal (with 'f' to specify float type)
        double doubleLiteral = 3.14159; // Floating-point literal (default is double type)
        
        System.out.println("Floating-point literal (3.14f) = " + floatLiteral);
        System.out.println("Floating-point literal (3.14159) = " + doubleLiteral);
    }
}
