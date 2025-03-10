public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        // Declare two integer variables
        int num1 = 20;
        int num2 = 5;

        // Assignment operator '=' (Assign the value of num2 to num1)
        num1 = num2;
        System.out.println("After num1 = num2, num1: " + num1);  // num1 is now 5

        // Add and assign using '+='
        num1 += num2;  // num1 = num1 + num2
        System.out.println("After num1 += num2, num1: " + num1);  // num1 is now 10

        // Subtract and assign using '-='
        num1 -= num2;  // num1 = num1 - num2
        System.out.println("After num1 -= num2, num1: " + num1);  // num1 is now 5

        // Multiply and assign using '*='
        num1 *= num2;  // num1 = num1 * num2
        System.out.println("After num1 *= num2, num1: " + num1);  // num1 is now 25

        // Divide and assign using '/='
        num1 /= num2;  // num1 = num1 / num2
        System.out.println("After num1 /= num2, num1: " + num1);  // num1 is now 5

        // Modulus and assign using '%='
        num1 %= num2;  // num1 = num1 % num2
        System.out.println("After num1 %= num2, num1: " + num1);  // num1 is now 0
    }
}
