import java.util.Scanner;
public class Sumup {
    public static void main(String[] args) {
        // Using a Scanner object to read user input.
        Scanner input = new Scanner(System.in);
        double sum = 0.0;
        System.out.println("Enter numbers (negative or zero to stop): ");  // Requesting user input for numbers to sum up.
        while (true) {
            double n=input.nextDouble();
            // If user enters a non-numeric value or a negative number, break the loop.
            if(n<=0) break;
            sum+=n;
        }
        System.out.println(sum);
    }
    
}