import java.util.Scanner;

class SimpleInt {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter principal amount
        System.out.println("Enter principal amount:");
        int principal = sc.nextInt();

        // Prompt user to enter rate of interest
        System.out.println("Enter rate of interest:");
        int rate = sc.nextInt();

        // Prompt user to enter time period
        System.out.println("Enter time period:");
        int time = sc.nextInt();

        // Calculate and print the simple interest
        Interest(principal, rate, time);
    }

    // Method to calculate and print the simple interest
    public static void Interest(int principal, int rate, int time) {
        int si = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate " + rate + ", and Time " + time);
    }
}
