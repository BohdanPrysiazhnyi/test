package home.work7;

public class SalesPerson extends Employee {
    private int percent;

    public SalesPerson(String name, double salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }


    @Override
    public void setBonus(double amount) {
        if (percent <= 0) throw new IllegalArgumentException("exception");
        else if (percent > 200) {
            bonus = amount * 3;
        } else if (percent > 100) {
            bonus = amount * 2;
        } else {
            bonus = amount;
        }
    }
}
