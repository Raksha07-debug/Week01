import java.util.Scanner;

class Factor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        int maxFactor = 10; // Initial size of the array
        int index = 0; // Index to keep track of the number of factors
        int factor[] = new int[maxFactor]; // Array to store factors
        
        // Loop to find factors of the number
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factor[index] = i; // Store the factor
                index++;
                
                // Resize the array if needed
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factor, 0, temp, 0, index);
                    factor = temp;
                }
            }
        }
        
        // Print the factors
        System.out.println("Factors are:");
        for (int i = 0; i < index; i++) {
            System.out.println(factor[i]);
        }
    }
}
