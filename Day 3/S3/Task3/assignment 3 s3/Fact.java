//Write a program to compute the factorial of the number 10.
class Fact {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 1; i <= 10; i++) {
            fact = fact*i; // Add each number to sum
            
        }
        System.out.println("The factorial of the first 10 numbers is: " + fact);
    }
}