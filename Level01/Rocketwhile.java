import java.util.Scanner;
public class Rocketwhile {
    public static void main(String[] args) {
        // Get user input for the countdown value.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the countdown value:");
        int counter = scanner.nextInt();
        // Print the countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
} 