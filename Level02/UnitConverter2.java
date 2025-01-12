import java.util.Scanner;

public class UnitConverter2 {

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
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");
        System.out.println(miles + " miles is " + convertYardsToFeet(miles) + " yards.");
        System.out.println(meter + " meters is " + convertMetersToInches(meter) + " inches.");
        System.out.println(feet + " feet is " + convertInchesToMeters(feet) + " meters.");
        System.out.println(feet + " feet is " + convertInchesToCentimeters(feet) + " centimeters.");
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

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}
