import java.util.Scanner;

public class Digits2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        
        // Define initial maximum number of digits and create array to store digits
        int maxDigit = 10;
        int[] arr = new int[maxDigit];
        int index = 0;
        
        // Variables to store the largest and second largest digits
        int digitLargest = 0;
        int secondLargest = 0;

        // Extract digits from the number and store them in the array
        while (number != 0) {
            // If the array is full, increase its size
            if (maxDigit == index) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    temp[i] = arr[i];
                }
                arr = temp;
            }
            arr[index] = number % 10;
            number /= 10;
            index++;
        }

        // Loop to find the largest and second largest digits
        for (int i = 0; i < index; i++) { // Fix the loop to only iterate over filled positions
            if (arr[i] > digitLargest) {
                secondLargest = digitLargest;
                digitLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != digitLargest) {
                secondLargest = arr[i];
            }
        }

        // Output the largest and second largest digits
        System.out.println("The largest digit is: " + digitLargest);
        System.out.println("The second largest digit is: " + secondLargest);
    }
}
