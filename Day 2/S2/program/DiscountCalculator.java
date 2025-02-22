import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the total purchase amount
        System.out.print("Enter total purchase amount (in Rs.): ");
        double totalPurchase = scanner.nextDouble();

        // Input if the user has a membership card
        System.out.print("Do you have a membership card? (yes/no): ");
        String membership = scanner.next();

        // Initialize discount variable
        double discount = 0;

        // Calculate discount based on purchase amount
        if (totalPurchase >= 1000) {
            discount = 20;
        } else if (totalPurchase >= 500) {
            discount = 10;
        } else {
            discount = 5;
        }

        // If the user has a membership, add 5% more discount
        if (membership.equalsIgnoreCase("yes")) {
            discount += 5;
        }

        // Calculate final price
        double discountAmount = (discount / 100) * totalPurchase;
        double finalPrice = totalPurchase - discountAmount;

        // Display the results
        System.out.println("Total Purchase Amount: Rs." + totalPurchase);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discount Amount: Rs." + discountAmount);
        System.out.println("Final Price: Rs." + finalPrice);

        scanner.close();
    }
}
