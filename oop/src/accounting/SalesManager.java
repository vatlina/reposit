package accounting;

class SalesManager extends Employee {
    private final double salesVolume;
    public SalesManager(int id, String name, String secondName, double salesVolume, int i) {
        super(id, name, secondName);
        this.salesVolume = salesVolume;
    }
    @Override
    public double calculateSalary() {
        double salary = salesVolume * Company.COMMISSION_RATE;
        return Math.max(salary, Company.MINIMUM_WAGE);
    }
}
