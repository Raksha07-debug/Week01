import java.util.Scanner;

class Swap {
    public static void main(String args[]) {
        // Create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("enter first number ");
        int number1 = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.println("enter second number ");
        int number2 = sc.nextInt();

        // Swap the values of number1 and number2 without using a temporary variable
        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;

        // Display the numbers after swapping
        System.out.println("After swapping:");
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
    }
}
