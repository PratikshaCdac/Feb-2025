// Class to represent a complex number
class ComplexNumbers {  // Corrected class name to match constructor
    // Member variables for real and imaginary parts
    private double real;
    private double imaginary;

    // Default constructor (sets real and imaginary parts to 0)
    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Constructor that initializes the real part only
    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    // Constructor that initializes both real and imaginary parts
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    // Method to multiply two complex numbers
    public ComplexNumber multiply(ComplexNumber other) {
        double realProduct = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryProduct = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(realProduct, imaginaryProduct);
    }

    // Method to display the complex number in the form: a + bi
    public void display() {
        if (imaginary < 0) {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        } else {
            System.out.println(real + " + " + imaginary + "i");
        }
    }
}

// Main class to test the ComplexNumber class
public class Main {
    public static void main(String[] args) {
        // Creating two complex numbers: 3 + 2i and 4 - 2i
        ComplexNumber num1 = new ComplexNumber(3, 2);  // 3 + 2i
        ComplexNumber num2 = new ComplexNumber(4, -2); // 4 - 2i

        // Displaying the complex numbers
        System.out.print("Complex Number 1: ");
        num1.display();
        
        System.out.print("Complex Number 2: ");
        num2.display();

        // Adding the two complex numbers
        ComplexNumber sum = num1.add(num2);
        System.out.print("Sum: ");
        sum.display();

        // Multiplying the two complex numbers
        ComplexNumber product = num1.multiply(num2);
        System.out.print("Product: ");
        product.display();
    }
}
