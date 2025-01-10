import java.util.Scanner;
public class Largestofthree {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        // Find the largest number using Math.max() method
        int largest = Math.max(Math.max(num1, num2), num3);
        // Display the result
        if (largest==num1) {System.out.println("Is the first number the largest? YES \nIs the second number the largest? NO \nIs the third number the largest?NO");}
        else if (largest==num2) {System.out.println("Is the first number the largest? NO \nIs the second number the largest? YES \nIs the third number the largest? NO");}
        else {System.out.println("Is the first number the largest? NO \nIs the second number the largest? NO \nIs the third number the largest? YES");}

    }
}