import java.util.Scanner; // Importing the Scanner class for user input

class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object
        System.out.println("Enter a number"); // Prompting the user to enter a number
        int n = sc.nextInt(); // Reading the user input as an integer
        sumNat(n); // Calling the sumNat method with the user input
    }
    
    public static void sumNat(int n) {
        int sum = 0; // Initializing the sum to 0
        for (int i = 0; i <= n; i++) { // Looping from 0 to the user input
            sum += i; // Adding the current value of i to the sum
        }
        
        System.out.println("The sum of natural numbers is " + sum); // Printing the sum of natural numbers
    }
}
