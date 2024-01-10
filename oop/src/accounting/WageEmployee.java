package accounting;

class WageEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public WageEmployee(int id, String name, String secondName, int hoursWorked, double hourlyRate) {
        super(id, name, secondName);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        double baseSalary = hoursWorked * hourlyRate;
        return Math.max(baseSalary, Company.MINIMUM_WAGE);
    }
}