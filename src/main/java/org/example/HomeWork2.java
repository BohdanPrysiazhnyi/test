package org.example;

public class HomeWork2 {
    /*Task 1*.
For a positive integer n calculate the result value, which is equal to the sum of the odd numbers of n.
Example,
n = 1234 result = 4;
n = 246 result = 0;*/
    public static int task1 (int z){
        int result = 0;
        String lenth = Integer.toString(z);
        int loop[] = new int[lenth.length()];
        for (int i = 0; i <loop.length ; i++) {
            loop [i] = lenth.charAt(i) -'0';
        }
        for (int i = 0; i < loop.length; i++) {
            if (loop [i] % 2 !=0){
                result = loop[i] + result;
            }

        }
        return result;
    }

    /*Task 2.
For a positive integer n calculate the result value, which is equal to the amount of the “1” in the binary
representation of n.
Example,
n = 14 = 1110 result = 3;
n = 128 = 1000 0000 result = 1;*/
    public static int task2 (int z){
        int result = 0;
        String intToBinary = Integer.toBinaryString(z);
        int[] array = new int[intToBinary.length()];
        for (int i = 0; i < array.length; i++) {
           array[i] = intToBinary.charAt(i)-'0';
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                result = array[i] + result;
            }
        }
        return result;
    }
}
