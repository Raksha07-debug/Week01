import java.util.Scanner;

public class FriendsInfo {

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Arrays to store ages and heights of 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Loop to take input for each friend's age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Find and display the youngest friend
        int youngestIndex = findYoungest(ages);
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + ".");

        // Find and display the tallest friend
        int tallestIndex = findTallest(heights);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");
    }

    // Method to find the youngest of the 3 friends
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find the tallest of the 3 friends
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }
}
