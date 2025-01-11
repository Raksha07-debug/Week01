import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary of employees");

        // Arrays to store salary, years of service, bonus, and new salary for each employee
        double[] salary = new double[10];
        double[] yearOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10]; 

        // Variables to store total old salary, total new salary, and total bonus
        double oldSalary = 0.0;
        double totalNewSalary = 0.0;
        double addBonus = 0.0;

        // Loop to take input for salary and years of service for each employee
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.println("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();
                System.out.println("Enter years of service for employee " + (i + 1) + ": ");
                yearOfService[i] = sc.nextDouble();
                
                // Validate input
                if (salary[i] >= 0 && yearOfService[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter valid numbers.");
                }
            }
        }

        // Loop to calculate the bonus, new salary, and accumulate totals
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            
            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];
            
            // Accumulate totals
            addBonus += bonus[i];
            oldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output the total old salary, total new salary, and total bonus payout
        System.out.println("Total old salary of all employees: " + oldSalary);
        System.out.println("Total new salary of all employees: " + totalNewSalary);
        System.out.println("Total bonus payout: " + addBonus);
    }
}
