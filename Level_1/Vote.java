import java.util.Scanner;

class Vote {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ages of students");

        // Reading a single age input (not used further in the code)
        int age = sc.nextInt();

        int arr[] = new int[10]; // Array to store ages of 10 students

        // Reading ages into the array
        for (int i = 0; i < arr.length; i++) 
            arr[i] = sc.nextInt();

        // Processing the ages in the array
        for (int i = 0; i < arr.length; i++) {
            // Checking if the student can vote
            if (arr[i] >= 18)
                System.out.println("Student with age " + arr[i] + " can vote");
            else if (arr[i] < 0)
                System.out.println("invalid age"); // Invalid age check
            else
                System.out.println("Student with the age " + arr[i] + " cannot vote");
        }
    }
}
