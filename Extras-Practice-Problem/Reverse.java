import java.util.Scanner; // Import the Scanner class to read user input

public class Reverse {
    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Read the input string from the user
        String s = sc.nextLine();
        
        // Initialize an empty string to store the reversed string
        String rev = "";
        // Loop through each character in the string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            // Add each character to the reversed string
            rev = rev + s.charAt(i);
        }
        
        // Print the reversed string
        System.out.println("Reversed string is: " + rev);
    }
}
