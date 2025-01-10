import java.util.Scanner;

public class Rocketfor {
    public static void main(String[] args) {
        // Get user input for the countdown value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the countdown value:");
        int counter = scanner.nextInt();
        scanner.close();
        //print counter
        for (int i = counter; i >0; i--) {
            System.out.println(i);
        }
    }
}
