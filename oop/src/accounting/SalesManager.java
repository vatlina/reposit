package accounting;

class SalesManager extends Employee {
    private double salesVolume;
    private double commissionRate;

    public SalesManager(int id, String name, String secondName, double salesVolume, double commissionRate) {
        super(id, name, secondName);
        this.salesVolume = salesVolume;
        this.commissionRate = commissionRate;
    }
    @Override
    public double calculateSalary() {
        double baseSalary = salesVolume * commissionRate;
        return Math.max(baseSalary, Company.MINIMUM_WAGE);
    }
}
