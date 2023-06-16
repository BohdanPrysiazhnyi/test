package home.work8;

public class SpecialDeposit extends Deposit{
    public SpecialDeposit(double depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public double income() {
        double percent = 0.01;
        double result = amount();
        for (int i = 0; i < period(); i++) {
            result += result*percent;
            percent +=percent;
        }
        return result;
    }
}
