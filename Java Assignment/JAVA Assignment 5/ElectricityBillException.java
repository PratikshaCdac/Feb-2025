import java.util.Scanner;  // Import Scanner class for input
import java.util.InputMismatchException;  // Import InputMismatchException for handling invalid data types

class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed) {
        if (unitsConsumed < 0) {
            throw new IllegalArgumentException("Units consumed cannot be negative");
        }
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = 0.0;
    }

    public void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5; // Rs. 5 per unit for first 100 units
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 5 + (unitsConsumed - 100) * 7; // Rs. 7 per unit for 101 to 300 units
        } else {
            billAmount = 100 * 5 + 200 * 7 + (unitsConsumed - 300) * 10; // Rs. 10 per unit for units above 300
        }
    }

    // Getter method for billAmount
    public double getBillAmount() {
        return billAmount;
    }

    // Getter method for customerName
    public String getCustomerName() {
        return customerName;
    }

    // Getter method for unitsConsumed
    public double getUnitsConsumed() {
        return unitsConsumed;
    }
}

public class ElectricityBillException {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        String customerName = "";
        double unitsConsumed = 0;

        try {
            // Prompt user for customer name
            System.out.print("Enter customer name: ");
            customerName = scanner.nextLine();

            // Prompt user for units consumed
            System.out.print("Enter the number of units consumed: ");
            unitsConsumed = scanner.nextDouble();

            // If unitsConsumed is negative, it will throw an IllegalArgumentException
            ElectricityBill bill = new ElectricityBill(customerName, unitsConsumed);

            // Calculate the bill amount
            bill.calculateBillAmount();

            // Display the bill details
            System.out.println("\nElectricity Bill Details:");
            System.out.println("Customer Name: " + bill.getCustomerName());
            System.out.println("Units Consumed: " + bill.getUnitsConsumed());
            System.out.println("Bill Amount: Rs. " + bill.getBillAmount());
        } 
        // Handle case where input for units is not a valid number
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value for units consumed.");
        } 
        // Handle case where units consumed is negative
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        // Catch any other unexpected exceptions
        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leaks
            scanner.close();
        }
    }
}
