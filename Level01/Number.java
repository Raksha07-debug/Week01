import java.util.Scanner;

class Number {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        // Call the CheckNum method and print the result
        int result = CheckNum(num);
        System.out.println("Result: " + result);
    }

    // Method to check if the number is positive, negative, or zero
    public static int CheckNum(int n) {
        if (n > 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
