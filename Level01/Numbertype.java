import java.util.Scanner;
public class Numbertype {
    public static void main(String[] args) {
        // Taking input from user 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num>0) System.out.println("Positive number");
        else if (num<0) System.out.println("Negative number");
        else System.out.println("Zero");
    }
}