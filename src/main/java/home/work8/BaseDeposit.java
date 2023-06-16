package home.work8;

public class BaseDeposit extends Deposit{
    public BaseDeposit(double depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public double income() {
        double result = amount();
        for (int i = 0; i < period(); i++) {
            result += result * 0.05;
        }
        return result;
    }
}
