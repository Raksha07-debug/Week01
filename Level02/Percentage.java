import java.util.Scanner;  // Import the Scanner class for user input

class Percentage {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        // Prompt user to enter marks for physics
        System.out.println("enter marks for physics ");
        float physics = sc.nextFloat();  // Read user input for physics marks

        // Prompt user to enter marks for chemistry
        System.out.println("enter marks for chemistry");
        float chemistry = sc.nextFloat();  // Read user input for chemistry marks

        // Prompt user to enter marks for maths
        System.out.println("enter marks for maths ");
        float maths = sc.nextFloat();  // Read user input for maths marks

        // Calculate the average marks
        float avg = physics + chemistry + maths / 3;
        
        // Determine and display the grade based on the average marks
        if (avg >= 80) {
            System.out.println("The average mark is " + avg + " and grade is A Level 4, above agency normalized standards");
        } else if (avg >= 70 && avg < 80) {
            System.out.println("The average mark is " + avg + " and grade is B Level 3, at agency above normalized students");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("The average marks is " + avg + " and grade is C Level 2, below but approaching agency normalized standards");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("The average marks is " + avg + " and grade is D Level 1, well below agency normalized standards");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("The average marks is " + avg + " and grade is E Level 1, too below agency normalized standards");
        } else {
            System.out.println("The average marks is " + avg + " The grade is R Remedial standards");
        }
    }
}
