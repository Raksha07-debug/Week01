import java.util.Scanner;

class OddEv {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        // Prompt the user to enter a number
        int number = sc.nextInt();
        
        // Check if the number is less than or equal to 0, and print an error message if true
        if (number <= 0) {
            System.out.println("Error");
        }
        
        // Calculate the size of the arrays to store even and odd indices
        int size = number / 2 + 1;

        // Initialize arrays to store even and odd indices
        int evIndex[] = new int[size];
        int odIndex[] = new int[size];

        // Variables to keep track of the current index in even and odd arrays
        int eveIndex = 0;
        int oddIndex = 0;

        // Loop to iterate through numbers from 0 to (number - 1)
        for (int i = 0; i < number; i++) {
            // Check if the current number is even and store it in the even index array
            if (i % 2 == 0) {
                evIndex[eveIndex++] = i;
            } else { // Otherwise, store it in the odd index array
                odIndex[oddIndex++] = i;
            }
        }

        // Print a newline for better readability
        System.out.println();

        // Print all even indices
        for (int i = 0; i < eveIndex; i++) {
            System.out.println(evIndex[i]);
        }

        // Print all odd indices
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(odIndex[i]);
        }
    }
}
