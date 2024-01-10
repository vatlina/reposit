package accounting;

class WageEmployee extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;
    public WageEmployee(int id, String name, String secondName, double hourlyRate, int hoursWorked) {
        super(id, name, secondName);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        return Math.max(salary, Company.MINIMUM_WAGE);
    }
}