import java.util.Scanner;
public class Naturalsum {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = sc.nextInt();
        // Check if the number is positive
        if (n>0) {
            System.out.println("The sum of "+n+" natural numbers is "+n*(n+1)/2);
        }
        else{
            System.out.println("The number "+n+" is not a natural number");
        }

    }
}