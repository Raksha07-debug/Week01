import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter values for conversions
        System.out.println("Enter Kilometer value: ");
        double km = sc.nextDouble();
        System.out.println("Enter Miles value: ");
        double miles = sc.nextDouble();
        System.out.println("Enter Meter value: ");
        double meter = sc.nextDouble();
        System.out.println("Enter Feet value: ");
        double feet = sc.nextDouble();

        // Convert and display the results
        System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");
        System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");
        System.out.println(meter + " meters is " + convertMetersToFeet(meter) + " feet.");
        System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
    }

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
}
