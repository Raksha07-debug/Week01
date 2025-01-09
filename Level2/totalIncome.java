import java.util.Scanner;

class TotalIncome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter their salary
        System.out.println("Enter your salary:");
        
        // Read the salary entered by the user
        int salary = sc.nextInt();
        
        // Prompt user to enter their bonus
        System.out.println("Enter your bonus:");
        
        // Read the bonus entered by the user
        int bonus = sc.nextInt();
        
        // Calculate the total income (salary + bonus)
        int exactSalary = bonus + salary;
        
        // Display the total income along with salary and bonus
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + exactSalary);
    }
}
