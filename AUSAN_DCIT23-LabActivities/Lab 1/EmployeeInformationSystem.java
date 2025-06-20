import java.util.Scanner;

public class EmployeeInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        // Compute values
        String fullName = firstName + " " + lastName;
        double dailySalary = hoursWorked * hourlyWage;

        // Output section
        System.out.println("\nEmployee Information");
        System.out.println("------------------");
        System.out.println("Full Name   : " + fullName);
        System.out.println("Age         : " + age + " years old");
        System.out.println("Daily Salary: PHP " + String.format("%.2f", dailySalary));

        // Close scanner
        scanner.close();
    }
}