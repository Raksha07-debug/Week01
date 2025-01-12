import java.util.Scanner;

public class NaturalNum {

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");

        // Read user input
        int number = sc.nextInt();

        // If the number is less than or equal to 0, break the loop
        while (number <= 0) break;

        // Calculate and display the sum using recursion
        System.out.println("Result with recursion: " + recursion(number));

        // Calculate and display the sum using the formula
        System.out.println("Result with formula: " + formulae(number));
        if(recursion(number)==formulae(number)){
            System.out.println("both the values from recursion and formula are same ");
        }
    }

    // Method to calculate the sum using the formula n * (n + 1) / 2
    public static int formulae(int n) {
        return n * (n + 1) / 2;
    }

    // Recursive method to calculate the sum
    public static int recursion(int n) {
        if (n == 1) return 1;
        else return n + recursion(n - 1);
    }
}
