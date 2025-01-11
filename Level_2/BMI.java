import java.util.Scanner;

class BMI {
    public static void main(String args[]) {
        // Prompt user to enter number of persons
        System.out.println("Enter number of persons:");
        Scanner sc = new Scanner(System.in);
        int person = sc.nextInt();
        
        // Define arrays to store heights, weights, BMI, and status for each person
        double[] heights = new double[person];
        double[] weight = new double[person];
        double[] bmi = new double[person];
        String[] status = new String[person];

        // Loop to take input for height and weight of each person
        for (int i = 0; i < person; i++) {
            System.out.println("Enter the height of person " + (i + 1) + " (in meters):");
            heights[i] = sc.nextDouble();
            System.out.println("Enter weight of person " + (i + 1) + " (in kg):");
            weight[i] = sc.nextDouble();
        }

        // Loop to calculate BMI and determine status for each person
        for (int i = 0; i < person; i++) {
            bmi[i] = weight[i] / (heights[i] * heights[i]);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Loop to display the height, weight, BMI, and status of each person
        for (int i = 0; i < person; i++) {
            System.out.println("Height of person " + (i + 1) + " is " + heights[i] + " meters, weight is " + weight[i] + " kg, BMI is " + bmi[i] + ", and status is " + status[i]);
        }
    }
}
