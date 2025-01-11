import java.util.Scanner;

class Hands {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the number of students
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        
        // Call the method to calculate the maximum number of handshakes
        MaxHand(n);
    }

    // Method to calculate and print the maximum number of handshakes
    public static void MaxHand(int n) {
        int maxHandShake = (n * (n - 1)) / 2;
        System.out.println("Maximum number of handshakes: " + maxHandShake);
    }
}
