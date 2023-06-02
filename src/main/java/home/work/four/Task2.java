package home.work.four;

public class Task2 {
    public static int[] transform(int array [], SortOrder order){
        if (Task1.sortOrder(array,order)){
            for (int i = 0; i < array.length; i++) {
                array [i] += i;
            }
        }
        return array;
    }
}
