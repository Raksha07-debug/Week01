import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the year
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        // Check if the year is greater than or equal to 1582
        if (year >= 1582) {
            // Check if the year is a leap year
            if (CheckLeap(year)) {
                System.out.println("It is a leap year");
            } else {
                System.out.println("Not a leap year");
            }
        }
        // If the year is less than 1582, prompt the user to enter a valid year again
        if (year < 1582) {
            System.out.println("Enter a valid year (>= 1582)");
        }
    }

    // Method to check if the year is a leap year
    public static boolean CheckLeap(int year) {
        // A leap year is divisible by 4 and not divisible by 100 or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
