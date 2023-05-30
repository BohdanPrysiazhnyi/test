package org.example;

public class HomeWork3 {
    /*Task 1:
 In a given array of integers nums swap values of the first and the last array elements,
 the second and the penultimate etc., if the two exchanged values are even.
Example:
{10, 5, 3, 4} =>  {4, 5, 3, 10}
{100, 2, 3, 4, 5} => {100, 4, 3, 2, 5}
{100, 2, 3, 45, 33, 8, 4, 54} => {54, 4, 3, 45, 33, 8, 2, 100} */
    public static int [] task1 (int [] array){
        int [] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 || array[array.length-i] % 2 == 0) {
                result [i] = array[array.length - i];
            }
        }
    }
}
