package accounting;
/*Создать программу для бухгалтерии, которая сможет делать следующее:
1. добавлять сотрудников в штат
2. удалять сотрудников из штата
3. рассчитывать зарплату для двух категорий сотрудников
- сотрудник с почасовой оплатой
- менеджер по продажам
4. Добавление и удаление сотрудников  а также методы для вывода на экран списка сотрудников  и суммирования зарплат всех сотрудников  должны находиться в классе Company.
5. В программе должны также быть классы WageEmployee  и SalesManager  с полями id, name, secondName, количество проработанных часов а также метод для расчета зарплаты.
6. У сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен  учитывать минимальный размер оплаты труда.
7. У менеджера по продажам нет фиксированной оплаты , его  зарплата рассчитывается как процент от объема продаж. Но его метод оплаты труда также должен учитывать минимальный размер оплаты труда.
8. Программа должна быть написана с использованием свойств наследования.
9. добавить возможность сортировки сотрудников по фамилии*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Company {
    public static final double MINIMUM_WAGE = 1000;
    private List<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double calculateTotalSalaries() {
        double totalSalaries = 0;
        for (Employee employee : employees) {
            totalSalaries += employee.calculateSalary();
        }
        return totalSalaries;
    }

    public void sortEmployeesBySecondName() {
        Collections.sort(employees, Comparator.comparing(Employee::getSecondName));
    }

    public static void main(String[] args) {

        Company company = new Company();

        // Добавляем сотрудников
        company.addEmployee(new WageEmployee(1, "John", "Doe", 40, 25.0));
        company.addEmployee(new SalesManager(2, "Jane", "Smith", 100000, 0.05));
        company.addEmployee(new WageEmployee(3, "Bob", "Johnson", 30, 20.0));
        company.addEmployee(new WageEmployee(4, "Rod", "Stewart", 25, 90));
        company.addEmployee(new SalesManager(5, "Bob", "Dylan", 70000, 11));
        System.out.println("Employees before sorting:");
        company.printEmployees();

        company.sortEmployeesBySecondName();

        System.out.println("\nEmployees after sorting:");
        company.printEmployees();

        System.out.println("\nTotal salaries: " + company.calculateTotalSalaries());
    }
}