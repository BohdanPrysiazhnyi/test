package org.example;

public class HomeWork3 {
    /*Task 1:
 In a given array of integers nums swap values of the first and the last array elements,
 the second and the penultimate etc., if the two exchanged values are even.
Example:
{10, 5, 3, 4} =>  {4, 5, 3, 10}
{100, 2, 3, 4, 5} => {100, 4, 3, 2, 5}
{100, 2, 3, 45, 33, 8, 4, 54} => {54, 4, 3, 45, 33, 8, 2, 100} */
    public static int[] task1(int[] array) {
        int lastIndex = array.length - 1;
        int swap;
        for (int i = 0; i < array.length - 1; i++) {
            int pairIndex = lastIndex - i;
            if (pairIndex > i && array[i] % 2 == 0 && array[pairIndex] % 2 == 0){
                swap = array[i];
                array [i] = array[pairIndex];
                array[pairIndex] = swap;
            }
        }
        return array;
    }

    /* Task 2:
In a given array of integers nums calculate integer result value,
that is equal to the distance between the first and the last entry of the maximum value in the array.
Example:
{4, 100, 3, 4} result = 0
{5, 50, 50, 4, 5} result = 1
{5, 350, 350, 4, 350} result = 3
{10, 10, 10, 10, 10} result = 4  */
    public static int task2(int[] array) {
        int result = 0;
        if (array.length <= 0) {
            throw new UnsupportedOperationException();
        } else {
            int maxValue = array[0];
            int maxIndex = 0;
            int maxIndex2 = 0;
            for (int i = 0; i < array.length; i++) {
                if (maxValue < array[i]) {
                    maxValue = array[i];
                    maxIndex = i;
                    maxIndex2 = 0;
                } else if (maxValue == array[i]) {
                    maxIndex2 = i;
                }
                if (maxIndex2 > 0) {
                    result = maxIndex2 - maxIndex;
                }
            }
        }
        return result;
    }

    /*Task 3:
        In a predetermined two-dimensional integer array (square matrix)
        matrix insert 0 into elements to the left side of the main diagonal, and 1 into elements to the right side of the diagonal.
        Example:
    {{2, 4, 3, 3},  =>   {{2, 1, 1, 1},
     {5, 7, 8, 5},        {0, 7, 1, 1},
     {2, 4, 3, 3},        {0, 0, 3, 1},
     {5, 7, 8, 5}}        {0, 0, 0, 5}} */
public static int [][] matrix (int [][] matrix1){
    for (int i = 0; i < matrix1.length; i++) {
        for (int j = 0; j < matrix1[i].length; j++) {
            if (i<j){
                matrix1[i][j]=1;
            } else if (i>j){
                matrix1[i][j]=0;
            }
        }

    }
    return matrix1;
}
}
