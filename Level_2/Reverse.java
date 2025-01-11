import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        
        // Define an array to store the digits, and index to track array position
        int[] arr = new int[10];
        int index = 0;
        
        // Variable to count the number of digits
        int count = 0;
        
        // Extract digits from the number and store them in the array
        while (number != 0) {
            arr[index++] = number % 10;
            number /= 10;
            count++;
        }
        
        // Display the elements of the array in reverse order
        System.out.println("The number in reverse order is:");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
        }
    }
}
