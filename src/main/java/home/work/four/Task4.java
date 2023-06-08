package home.work.four;

import org.example.Main;

public class Task4 {

    public static int progression(int initial, double step, int quantity) {
        int result = 0;
        int currentNumber = initial;

        while (currentNumber > quantity) {

            result += currentNumber;
            currentNumber *= step;
        }

        return Math.round(result);
    }

}
