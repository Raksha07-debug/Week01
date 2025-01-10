import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        // Prompt the user to enter their age
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        // Check if the user is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is "+age+" and can vote.");
        }
        else{
            System.out.println("The person's age is "+age+" and cannot vote.");
        }
    }
    
}