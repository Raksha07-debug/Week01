import java.util.*;

class TwoDArr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        int index = 0; // Index for the 1D array
        
        // Declare a 2D array with the given dimensions
        int arr[][] = new int[row][col];
        // Declare a 1D array with a size equal to the product of rows and columns
        int one[] = new int[row * col];

        // Read elements into the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Flatten the 2D array into the 1D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                one[index++] = arr[i][j];
            }
        }

        // Print the 2D array
        System.out.println("2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Print the 1D array
        System.out.println("1D array:");
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i] + " ");
        }
        System.out.println();
    }
}
