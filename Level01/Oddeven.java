import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n<0) System.out.println("Not a positive number");
        for (int i=0; i<n; i++){
            if (i%2==0) System.out.println(i + " is even");
            else System.out.println(i + " is odd");
        }
    }
}