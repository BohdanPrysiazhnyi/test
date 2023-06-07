package home.work.four;

public class Task4 {
    public static int SumGeometricElements(int init, double step, int alim) {
        int result = 0;
        int currentValue = init;
        if (step == 0 || alim < 0 || step < 0) {
            throw new IllegalArgumentException();
        } else  {
            while (currentValue >= alim){
                result += currentValue;
                currentValue *= step;
            }
        }


        return result;

    }
}
