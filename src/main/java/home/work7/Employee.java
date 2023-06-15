package home.work7;

public abstract class Employee {
    private String name;
    private double salary;
    protected double bonus;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void setBonus(double amount);

    public double toPay() {
        return bonus + salary;
    }

}
