import java.util.Scanner; // Import the Scanner class for user input

class Q16 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes using the formula (n * (n - 1)) / 2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Print the maximum number of possible handshakes
        System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);

        // Close the Scanner object
        scanner.close();
    }
}
