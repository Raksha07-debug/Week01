import java.util.Scanner;

class Percentage2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter number of students
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        
        // Define a 2D array to store marks for physics, chemistry, and maths for each student
        double[][] marks = new double[n][3];

        // Loop to take input for marks in physics, chemistry, and maths for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for physics for student " + (i + 1) + ":");
            marks[i][0] = sc.nextDouble();
            
            // Validate input for physics marks
            while (marks[i][0] <= 0) {
                System.out.println("Invalid input. Enter again:");
                marks[i][0] = sc.nextDouble();
            }

            System.out.println("Enter marks for chemistry for student " + (i + 1) + ":");
            marks[i][1] = sc.nextDouble();
            
            // Validate input for chemistry marks
            while (marks[i][1] <= 0) {
                System.out.println("Invalid input. Enter again:");
                marks[i][1] = sc.nextDouble();
            }

            System.out.println("Enter marks for maths for student " + (i + 1) + ":");
            marks[i][2] = sc.nextDouble();
            
            // Validate input for maths marks
            while (marks[i][2] <= 0) {
                System.out.println("Invalid input. Enter again:");
                marks[i][2] = sc.nextDouble();
            }
        }

        // Loop to calculate percentage, grade, and remarks for each student
        for (int i = 0; i < n; i++) {
            double percentage = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            String grade = "";
            String remarks = "";

            // Determine grade and remarks based on percentage
            if (percentage >= 80) {
                grade = "A";
                remarks = "Level=4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Level=3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Level=2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Level=1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grade = "E";
                remarks = "Level=1, too below agency-normalized standards";
            } else {
                grade = "R";
                remarks = "Remedial standards";
            }

            // Display results for each student
            System.out.println("Student " + (i + 1));
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Level: " + grade);
            System.out.println("Remarks: " + remarks);
            System.out.println();
        }
    }
}
