import java.util.Scanner; 
class LeapYear {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        int year = sc.nextInt();  // Read user input for the year
        
        if(year >= 1582) {
            // Check if the year is a leap year
            if (year % 400 == 0) { 
                System.out.println(year + " is a Leap Year."); 
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            } 
        } else {
            // Display message if the year is before 1582
            System.out.println("The year must be >= 1582."); 
        }
    }
}
