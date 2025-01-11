import java.util.Scanner;

public class TrignoFunc {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the value for angle
        System.out.println("Enter the value for angle:");
        double angle = sc.nextDouble();
        
        // Create an instance of the TrignoFunc class
        TrignoFunc obj = new TrignoFunc();
        
        // Call the calculateTrigonometricFunctions method and store the results in an array
        double[] a = obj.calculateTrigonometricFunctions(angle);
        
        // Print the results of the trigonometric functions
        System.out.println("Value for sine: " + a[0]);
        System.out.println("Value for cosine: " + a[1]);
        System.out.println("Value for tangent: " + a[2]);
    }

    // Method to calculate the sine, cosine, and tangent of an angle
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate the sine, cosine, and tangent of the angle
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        
        // Store the results in an array
        double[] a = {sin, cos, tan};
        
        return a;
    }
}
