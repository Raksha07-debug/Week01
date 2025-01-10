import java.util.Scanner;
public class Firstsmall {
    public static void main(String[] args) {
        // Take input from the user for three numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        // Compare the numbers and print the result
        if (a<b && a<c){
            System.out.println("Is the first number the smallest? Yes" );
        }
        else{
            System.out.println("Is the first number the smallest? No");
        }
    }
}