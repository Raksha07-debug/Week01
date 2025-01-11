import java.util.Scanner;

public class Heights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store heights and ages of the three friends
        int[] heights = new int[3];
        int[] age = new int[3];
        
        // Names of the friends for reference
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input loop to take heights and ages
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter heights for " + names[i] + ": ");
            heights[i] = sc.nextInt();
            System.out.println("Enter ages for " + names[i] + ": ");
            age[i] = sc.nextInt();
        }

        // Find the youngest friend
        int youngIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngIndex]) {
                youngIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output the results
        System.out.println("The youngest friend is " + names[youngIndex] + " with age " + age[youngIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex]);
    }
}
