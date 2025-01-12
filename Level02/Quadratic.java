import java.util.Scanner;

public class Quadratic {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for coefficient 'a'
        System.out.println("Enter value of a");
        double a = sc.nextInt();
        
        // Prompt user for coefficient 'b'
        System.out.println("Enter value of b");
        double b = sc.nextInt();
        
        // Prompt user for coefficient 'c'
        System.out.println("Enter value of c");
        double c = sc.nextInt();

        // Calculate the roots of the quadratic equation
        double[] roots = roots(a, b, c);
        
        // Display the roots based on the number of roots found
        if (roots.length == 2) {
            System.out.println("Roots are " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Root is " + roots[0]);
        } else {
            System.out.println("No real roots");
        }

        sc.close(); // Close the scanner
    }
    
    // Method to calculate the roots of the quadratic equation
    public static double[] roots(double a, double b, double c) {
        double delta = Math.pow(b, 2) + 4 * a * c; // Calculate the discriminant

        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots
            return new double[]{};
        }
    }
}
