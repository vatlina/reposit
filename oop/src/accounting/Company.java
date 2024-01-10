package accounting;
/*Создать программу для бухгалтерии, которая сможет делать следующее:
1. добавлять сотрудников в штат
2. удалять сотрудников из штата
3. рассчитывать зарплату для двух категорий сотрудников
- сотрудник с почасовой оплатой
- менеджер по продажам
4. Добавление и удаление сотрудников, а также методы для вывода на экран списка сотрудников и суммирования зарплат всех сотрудников должны находиться в классе Company.
5. В программе должны также быть классы WageEmployee и SalesManager с полями id, name, secondName, количество проработанных часов, а также метод для расчета зарплаты.
6. У сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен учитывать минимальный размер оплаты труда.
7. У менеджера по продажам нет фиксированной оплаты, его зарплата рассчитывается как процент от объема продаж. Но его метод оплаты труда также должен учитывать минимальный размер оплаты труда.
8. Программа должна быть написана с использованием свойств наследования.
9. добавить возможность сортировки сотрудников по фамилии
10. Добавить дополнительные возможности сортировки сотрудников:
- по id,
— по имени и если имена одинаковые, то по id.*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Company {
    public static final double MINIMUM_WAGE = 1000.0;
    public static final double COMMISSION_RATE = 0.1;

    private final List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void removeEmployee(int employeeId) {
        employees.removeIf(employee -> employee.getId() == employeeId);
    }
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public double calculateTotalSalaries() {
        double totalSalaries = 0.0;
        for (Employee employee : employees) {
            totalSalaries += employee.calculateSalary();
        }
        return totalSalaries;
    }
    public void sortEmployeesBySecondName() {
        employees.sort(Comparator.comparing(Employee::getSecondName));
    }
    public void sortEmployeesById() {
        employees.sort(Comparator.comparingInt(Employee::getId));
    }
    public void sortEmployeesByNameAndId() {
        employees.sort(Comparator.comparing(Employee::getName).thenComparingInt(Employee::getId));
    }
}
