import java.util.Scanner;

class DivideChoclate {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the number of chocolates
        System.out.println("Enter number of chocolates");
        int numberOfchocolates = sc.nextInt();
        
        // Prompt user to enter the number of children
        System.out.println("Enter number of children");
        int numberOfChildren = sc.nextInt();
        
        // Calculate the remaining chocolates after division
        int remainingChoc = numberOfchocolates % numberOfChildren;
        
        // Calculate the number of chocolates each child gets
        int get = numberOfchocolates / numberOfChildren;
        
        // Print the result
        System.out.println("The number of chocolates each child gets is " + get + " and the number of remaining chocolates are " + remainingChoc);
    }
}
