public class Bonus {
    private double salary;
    private int yearsOfService;

    public Bonus(double salary, int yearsOfService) {
        this.salary = salary;
        this.yearsOfService = yearsOfService;
    }

    public double calculateBonus() {
        if (yearsOfService > 5) {
            return salary * 0.05;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        Bonus bonus = new Bonus(salary, yearsOfService);
        System.out.println("Bonus amount: " + bonus.calculateBonus());
    }
} 