import java.util.Scanner;
public class Naturalsumwhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of natural numbers to sum
        int sumWhile = 0;
        int i = 1;

        while (i <= n) {
            sumWhile += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum of " + n + " natural numbers using while loop: " + sumWhile);
        System.out.println("Sum of " + n + " natural numbers using formula: " + sumFormula);

        if (sumWhile == sumFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("Computations are incorrect.");
        }
    }
}