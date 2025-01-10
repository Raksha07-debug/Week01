import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        // Take input for month and day
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month:");
        int month = scanner.nextInt();
        System.out.println("Enter Day:");
        int day = scanner.nextInt();
        //check if month is Spring session
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}