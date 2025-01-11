import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the number of students
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        // Arrays to store marks of each student in physics, chemistry, and maths
        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];

        // Loop to take input for marks in physics, chemistry, and maths for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of physics for student " + (i + 1) + ":");
            physics[i] = sc.nextDouble();
            System.out.println("Enter marks of chemistry for student " + (i + 1) + ":");
            chemistry[i] = sc.nextDouble();
            System.out.println("Enter marks of maths for student " + (i + 1) + ":");
            maths[i] = sc.nextDouble();
        }

        // Loop to calculate percentage, grade, and remarks for each student
        for (int i = 0; i < n; i++) {
            double percentage = (physics[i] + chemistry[i] + maths[i]) / 3;
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

            // Print the results for each student
            System.out.println("Student " + (i + 1));
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Level: " + grade);
            System.out.println("Remarks: " + remarks);
            System.out.println();
        }
    }
}
