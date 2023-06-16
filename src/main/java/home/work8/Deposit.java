package home.work8;

public abstract class Deposit {
    protected double amount;
    protected int period;

    public Deposit(double depositAmount, int depositPeriod) {
        this.amount = depositAmount;
        this.period = depositPeriod;
    }

    public double amount() {
        return amount;
    }

    public int period() {
        return period;
    }
    public abstract double income();
}
