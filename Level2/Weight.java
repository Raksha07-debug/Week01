import java.util.Scanner;

class Weight {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter their weight in kilograms
        System.out.println("Enter weight");
        double weight = sc.nextDouble();
        
        // Convert the weight from kilograms to pounds
        double pound = weight * 2.2;
        
        // Display the weight in both pounds and kilograms
        System.out.println("The weight of the person in pounds is " + pound + " and in kg is " + weight);
    }
}
