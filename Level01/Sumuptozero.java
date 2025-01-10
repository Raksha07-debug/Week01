import java.util.Scanner;
public class Sumuptozero {
    public static void main(String[] args) {
        // This program takes input from the user until they enter zero,
        // then it calculates and prints the sum of all the numbers entered.        
        boolean f=true;
        System.out.println("Enter numbers (0 to stop): ");  // Asking the user to enter numbers.
        Scanner scanner = new Scanner(System.in);   
        double sum=0;
        // Loop until the user enters zero.
        while(f){
            double n=scanner.nextDouble();
            if (n==0){
                f=false;
            }
            sum+=n;
        }
        System.out.println(sum);

    }
}