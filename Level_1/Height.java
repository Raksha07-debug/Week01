import java.util.Scanner;

class Height {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double heights[] = new double[11]; // Array to store the heights of 11 team members

        double sum = 0.0; // Variable to store the sum of heights

        // Prompt the user to enter the heights
        System.out.println("Enter the heights:");
        
        // Loop to read the heights and calculate the sum
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble(); // Read each height
            sum += heights[i]; // Add the height to the sum
        }

        // Calculate and print the mean height of the football team
        System.out.println("The mean height of the football team: " + (sum / 11));
    }
}
