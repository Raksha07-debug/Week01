import java.util.Scanner;

class SpringSeason {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the month
        System.out.println("Enter month:");
        int month = sc.nextInt();
        
        // Prompt user to enter the day
        System.out.println("Enter day:");
        int day = sc.nextInt();
        
        // Check if it's Spring Season and print the result
        if (CheckSpring(month, day) == true) {
            System.out.println("It is Spring Season");
        } else {
            System.out.println("It's not Spring Season");
        }
    }

    // Method to check if the given date is within the Spring Season
    public static boolean CheckSpring(int month, int day) {
        if (month == 3 && day >= 20) {
            return true;
        } else if (month == 4 || month == 5) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
