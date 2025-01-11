import java.util.Scanner;

class Park {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the first side of the park in meters
        System.out.println("Enter first side of the park in meter:");
        int s1 = sc.nextInt();

        // Prompt user to enter the second side of the park in meters
        System.out.println("Enter second side of the park in meter:");
        int s2 = sc.nextInt();

        // Prompt user to enter the third side of the park in meters
        System.out.println("Enter third side of the park in meter:");
        int s3 = sc.nextInt();

        // Call the method to calculate the number of rounds needed to complete 5 km
        Round(s1, s2, s3);
    }

    // Method to calculate and print the number of rounds needed to complete 5 km
    public static void Round(int s1, int s2, int s3) {
        // Calculate the perimeter of the park
        int perimeter = s1 + s2 + s3;

        // Calculate the number of rounds needed to complete 5 km
        int round = 5000 / perimeter;

        // Print the result
        System.out.println("The number of rounds needed to complete 5 km is " + round);
    }
}
