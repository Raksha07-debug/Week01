import java.util.Scanner;

class Mul {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter your number");
        int num = sc.nextInt();

        // Array to store multiplication results
        int arr[] = new int[10];

        // Loop to calculate the multiplication table from 6 to 9
        for (int i = 6; i < 10; i++) {
            arr[i] = num * i; // Store the result in the array
            // Print the multiplication result
            System.out.println(num + " * " + i + " = " + arr[i]);
        }
    }
}
