package home.work8;

import com.sun.source.tree.BreakTree;

public class LongDeposit extends Deposit{
    public LongDeposit(double depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public double income() {
        double result = amount();
        if (period() > 6) {
            for (int i = 6; i < period(); i++) {
                result += result * 0.15;
            }
            return result;
        }
        return result;
    }

}
