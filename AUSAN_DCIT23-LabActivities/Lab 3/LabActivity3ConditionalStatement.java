import java.util.Scanner; // Import Scanner for user input

public class LabActivity3ConditionalStatement {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter hours worked per day: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter role code (1-Manager, 2-Supervisor, 3-Staff, 4-Intern): ");
        int roleCode = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Step 2: Compute required details
        String fullName = lastName.toUpperCase() + ", " + firstName.toUpperCase(); // Full name in uppercase
        int yearsToRetirement = Math.abs(65 - age); // Compute years to retirement
        double dailySalary = hoursWorked * hourlyWage; // Compute daily salary
        double weeklySalary = dailySalary * 5; // Weekly salary (5 working days)
        double monthlySalary = weeklySalary * 4; // Monthly salary (4 weeks)
        double grossYearlySalary = monthlySalary * 12; // Gross yearly salary (12 months)
        double netYearlySalary = grossYearlySalary - (grossYearlySalary * 0.32) - 1500; // Deduct tax and benefits

        // Determine the position based on role code
        String position;
        switch (roleCode) {
            case 1:
                position = "Manager";
                break;
            case 2:
                position = "Supervisor";
                break;
            case 3:
                position = "Staff";
                break;
            case 4:
                position = "Intern";
                break;
            default:
                position = "Unknown";
        }

        // Step 3: Display results
        System.out.println("\nEmployee Information");
        System.out.println("----------------------------");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age + " years old");
        System.out.println("Position: " + position);
        System.out.println("Years to Retirement: " + yearsToRetirement + " years");
        System.out.printf("Daily Salary: Php %.2f%n", dailySalary);
        System.out.printf("Weekly Salary: Php %.2f%n", weeklySalary);
        System.out.printf("Monthly Salary: Php %.2f%n", monthlySalary);
        System.out.printf("Gross Yearly Salary: Php %.2f%n", grossYearlySalary);
        System.out.printf("Net Yearly Salary: Php %.2f%n", netYearlySalary); // Display with 2 decimal places
    }
}