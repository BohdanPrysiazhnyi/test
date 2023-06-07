package home.work.four;

public class Task3 {

    public static int progression (int initial, int step, int quantity){
        int result = initial;
        int currentNumber = initial;
        for (int i = 1; i < quantity; i++) {
            currentNumber += step;
            result *= currentNumber;
        }
        return result;
    }

}
