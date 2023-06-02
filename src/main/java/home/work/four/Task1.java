package home.work.four;

public class Task1 {
    public static boolean sortOrder(int[] array, SortOrder order) {
        //if (array==null || array.length==0) throw IllegalArgumentException();
        if (order == SortOrder.ASC) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
            if (order == SortOrder.DESC) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
