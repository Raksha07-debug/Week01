import java.util.Scanner;  // Import the Scanner class for user input

class LeapYear2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        int year = sc.nextInt();  // Read user input for the year

        // Check if the year is a leap year
        if ( year >= 1582 && year % 400 == 0 && year % 100 != 0) {
            System.out.println("it is a leap year ");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
