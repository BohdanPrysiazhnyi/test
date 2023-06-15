package home.work7;

public class Manager extends Employee{
    private int quantity;

    public Manager(String name, double salary, int quantity) {
        super(name, salary);
        this.quantity = quantity;
    }

    @Override
    public void setBonus(double amount) {
        if (quantity <= 0) throw new IllegalArgumentException("qwerty");
        else if (quantity > 150) {
            bonus = amount + 1000;
        } else if (quantity > 100){
            bonus = amount + 500;
        } else bonus = amount;
    }
}
