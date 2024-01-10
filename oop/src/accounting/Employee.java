package accounting;

abstract class Employee {
    protected int id;
    protected String name;
    protected String secondName;

    public Employee(int id, String name, String secondName) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
    }
    public abstract double calculateSalary();

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + calculateSalary() +
                '}';
    }
}