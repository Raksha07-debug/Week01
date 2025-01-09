
import java.util.Scanner;

public class ParkRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the lengths of the three sides of the triangle
        System.out.print("Enter the length of side 1 in meters: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 2 in meters: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 3 in meters: ");
        double side3 = scanner.nextDouble();
        
        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        
   
        double targetDistance = 5000;
        
        // Calculate the total number of rounds
        double rounds = targetDistance / perimeter;
        
        // Output the result
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds));
        
        scanner.close();
    }
}
