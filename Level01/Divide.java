import java.util.Scanner;

public class Divide {

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.println("Enter number of chocolates"); // Prompt user to enter number of chocolates
        int numberOfchocolates = sc.nextInt(); // Read number of chocolates from user
        System.out.println("Enter number of children"); // Prompt user to enter number of children
        int numberOfChildren = sc.nextInt(); // Read number of children from user
        Choclate(numberOfChildren, numberOfchocolates); // Call method to calculate and display chocolate distribution
    }

    // Method to calculate and display the number of chocolates each child gets
    public static void Choclate(int numberOfChildren, int numberOfchocolates) {
        int part = numberOfchocolates / numberOfChildren; // Calculate chocolates each child gets
                System.out.println("the number of choclate each children get is "+part+"and remaining choclates are"+remaining);
 // Display the result
    }
}
