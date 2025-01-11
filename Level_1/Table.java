import java.util.Scanner;

class Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter a number
        System.out.println("enter your number");
        int num = sc.nextInt();
        
        int arr[] = new int[10]; // Array to store the multiplication table
        
        // Generating the multiplication table and storing it in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num * (i + 1);
        }
        
        // Printing the multiplication table
        for (int i = 0; i < arr.length; i++) {
            System.out.println(num + " X " + (i + 1) + " = " + arr[i]);
        }
    }
}
