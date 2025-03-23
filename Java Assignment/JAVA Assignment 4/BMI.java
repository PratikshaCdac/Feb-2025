
import java.util.Scanner;

class BMICalculator {
    // Fields for height (in meters) and weight (in kilograms)
    private double height;
    private double weight;

    // Parameterized constructor to initialize height and weight
    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // Getter and Setter methods for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getter and Setter methods for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        return weight / (height * height);
    }
}


  // Importing Scanner for user input

public class BMI {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user for height and weight
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Create an object of BMICalculator with user input values
        BMICalculator bmiCalculator = new BMICalculator(height, weight);

        // Calculate BMI using the calculateBMI() method
        double bmi = bmiCalculator.calculateBMI();

        // Display the BMI result
        System.out.println("Your BMI is: " + bmi);
     
    }
}
