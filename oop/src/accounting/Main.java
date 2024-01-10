package accounting;
public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        company.addEmployee(new WageEmployee(1, "John", "Doe", 40.0, (int) 25.0));
        company.addEmployee(new SalesManager(2, "Jane", "Smith", 100000.0, 0));
        company.addEmployee(new WageEmployee(3, "Bob", "Johnson", 30.0, (int) 20.0));
        company.addEmployee(new WageEmployee(4, "Rod", "Stewart", 25, 90));
        company.addEmployee(new SalesManager(5, "Bob", "Dylan", 70000, 11));

        System.out.println("Employees:");
        company.displayEmployees();

        System.out.println("\nTotal Salaries: $" + company.calculateTotalSalaries());

        company.sortEmployeesBySecondName();
        System.out.println("\nEmployees sorted by second name:");
        company.displayEmployees();

        company.sortEmployeesById();
        System.out.println("\nEmployees sorted by id:");
        company.displayEmployees();

        company.sortEmployeesByNameAndId();
        System.out.println("\nEmployees sorted by name and id:");
        company.displayEmployees();
    }
}