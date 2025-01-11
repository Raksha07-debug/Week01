import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        
        // Define maximum number of digits and create array to store digits
        int maxDigit = 10;
        int arr[] = new int[maxDigit];
        int index = 0;
        
        // Variables to store the largest and second largest digits
        int digitLargest = 0;
        int secondLargest = 0;

        // Extract digits from the number and store them in the array
        while (number != 0 && index < maxDigit) {
            arr[index] = number % 10;
            number /= 10;
            index++;
        }

        // Loop to find the largest and second largest digits
        for (int i = 0; i < arr.length; i++) {
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
