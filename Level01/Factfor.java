import java.util.Scanner;
public class Factfor {
    public static void main(String[] args) {
        // Taking input from user
        Scanner sc = new Scanner(System.in);
System.out.println("enter your number");
        int n = sc.nextInt();
        // Checking if the number is negative or zero
        if (n<=0){
            System.out.println("Negitive number");
        }
        else{
            int fact = 1;
            // Calculating factorial using for loop
            for(int i=1; i<=n; i++) {
                fact *= i;

            }
            System.out.println("Factorial of "+n+" is: "+fact);
        }
    }
}