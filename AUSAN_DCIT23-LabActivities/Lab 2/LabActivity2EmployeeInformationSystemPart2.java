import java.util.Scanner; // Import Scanner for user input

public class LabActivity2EmployeeInformationSystemPart2 {
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

        // Close the scanner
        scanner.close();

        // Step 2: Compute required details
        String fullName = lastName.toUpperCase() + ", " + firstName.toUpperCase(); // Full name in uppercase
        int yearsToRetirement = Math.abs(65 - age); // Compute years to retirement
        int dailySalary = (int) Math.round(hoursWorked * hourlyWage); // Round daily salary
        int weeklySalary = dailySalary * 5; // Weekly salary (5 working days)
        int monthlySalary = weeklySalary * 4; // Monthly salary (4 weeks)
        int grossYearlySalary = monthlySalary * 12; // Gross yearly salary (12 months)
        double netYearlySalary = grossYearlySalary - (grossYearlySalary * 0.32) - 1500; // Deduct tax and benefits

        // Step 3: Display results
        System.out.println("\nEmployee Information");
        System.out.println("----------------------------");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age + " years old");
        System.out.println("Years to Retirement: " + yearsToRetirement + " years");
        System.out.println("Daily Salary: Php " + dailySalary);
        System.out.println("Weekly Salary: Php " + weeklySalary);
        System.out.println("Monthly Salary: Php " + monthlySalary);
        System.out.println("Gross Yearly Salary: Php " + grossYearlySalary);
        System.out.printf("Net Yearly Salary: Php %.2f\n", netYearlySalary); // Display with 2 decimal places
    }
}