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
}
