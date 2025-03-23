import java.util.Scanner;  
class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;
    public ElectricityBill(String customerName, double unitsConsumed) {
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

public class ElectricityBill1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for customer details
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        
        System.out.print("Enter the number of units consumed: ");
        double unitsConsumed = scanner.nextDouble();

        // Create an ElectricityBill object with customer name and units consumed
        ElectricityBill bill = new ElectricityBill(customerName, unitsConsumed);

        // Calculate the bill amount based on the units consumed
        bill.calculateBillAmount();

        // Display the customer name and calculated bill amount
        System.out.println("\nElectricity Bill Details:");
        System.out.println("Customer Name: " + bill.getCustomerName());
        System.out.println("Units Consumed: " + bill.getUnitsConsumed());
        System.out.println("Bill Amount: Rs. " + bill.getBillAmount());
    }
}
