import java.util.*;

class Frequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        
        // Prompt user to enter a number
        System.out.println("Enter your number:");
        int num = sc.nextInt();
        int temp = num; // Initialize temp with the input number
        int count = 0;
        
        // Calculate the number of digits
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        
        // Array to store the digits
        int[] digit = new int[count];
        temp = num; // Reset temp to original number
        
        // Extract digits and store in the array
        for (int i = 0; i < count; i++) {
            digit[i] = temp % 10;
            temp /= 10;
        }
        
        // Array to count frequency of each digit
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digit[i]]++;
        }
        
        // Print the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
