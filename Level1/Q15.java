import java.util.Scanner; // Import the Scanner class for user input

public class Q15 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the unit price of the item
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scanner.nextDouble();

        // Prompt the user to enter the quantity of items to be bought
        System.out.print("Enter the quantity of items: ");
        int quantity = scanner.nextInt();

        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;

        // Print the total purchase price with the provided unit price and quantity
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and the unit price is INR " + unitPrice);

        // Close the Scanner object
        scanner.close();
    }
}
