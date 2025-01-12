import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote
    public static boolean canStudentVote(int age) {
        // Validate the age for a negative number
        if (age < 0) {
            return false; // Cannot vote
        }
        // Check if the age is 18 or above
        return age >= 18; // Can vote if age is 18 or above
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Loop to take input for each student's age
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Loop to check if each student can vote and display the result
        for (int i = 0; i < 10; i++) {
            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }
}
