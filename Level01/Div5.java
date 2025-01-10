import java.util.Scanner;
public class Div5{
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        // Checking if the number is divisible by 5
        if (n % 5 == 0) {
            System.out.println("Is the number "+n+"divisible by 5? Yes");
        }
        else {
            System.out.println("Is the number "+n+" divisible by 5? No");
        }
    }
}