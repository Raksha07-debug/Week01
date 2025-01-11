import java.util.Scanner; // Importing the Scanner class for user input

class Largest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input
        System.out.println("Enter the first number"); // Prompting the user to enter the first number
        int number1 = sc.nextInt(); // Reading the first number from the user
        System.out.println("Enter the second number"); // Prompting the user to enter the second number
        int number2 = sc.nextInt(); // Reading the second number from the user
        System.out.println("Enter the third number"); // Prompting the user to enter the third number
        int number3 = sc.nextInt(); // Reading the third number from the user

        // Finding the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("The smallest number is: " + result[0]); // Displaying the smallest number
        System.out.println("The largest number is: " + result[1]); // Displaying the largest number
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // Finding the smallest number using Math.min
        int smallest = Math.min(number1, Math.min(number2, number3));
        // Finding the largest number using Math.max
        int largest = Math.max(number1, Math.max(number2, number3));

        // Returning an array containing the smallest and largest numbers
int []a= {smallest,largest};
        return a;
    }
}
