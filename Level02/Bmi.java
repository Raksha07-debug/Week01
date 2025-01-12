import java.util.Scanner;

public class Bmi {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double data[][] = new double[10][3]; // 2D array to store weight, height, and BMI

        // Taking user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI for each person and update the array
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            data[i][2] = FindBmi(height, weight);
        }

        // Display the height, weight, BMI, and status of each individual
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = data[i][2];
            String status = getStatus(bmi);
            System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f cm, BMI = %.2f, Status = %s%n", 
                              i + 1, weight, height, bmi, status);
        }

        // Output array of all persons' BMI statuses
        String[] bmisStatusArr = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            bmisStatusArr[i] = getStatus(data[i][2]);
        }

        // Display BMI status of all persons
        System.out.println("\nBMI status of all persons:");
        for (String status : bmisStatusArr) {
            System.out.println(status);
        }
        
        sc.close(); // Close the scanner
    }

    // Method to calculate BMI
    public static double FindBmi(double height, double weight) {
        double heightM = height / 100; // Convert height from cm to meters
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
