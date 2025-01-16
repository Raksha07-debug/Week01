import java.util.Scanner;

public class StringLengthFinder {
    
    // Method to find the length of a string without using the built-in length() method
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Access each character until an exception is thrown
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Do nothing, just exit the loop
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.next();

        // Find length using the user-defined method
        int userDefinedLength = findStringLength(userInput);

        // Find length using the built-in length() method
        int builtInLength = userInput.length();

        // Display the result
        System.out.println("User-defined length: " + userDefinedLength);
        System.out.println("Built-in length: " + builtInLength);
    }
}
