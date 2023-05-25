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
n = 128 = 1000 0000 result = 1; */
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

    /*Task 3.
For a positive integer n, calculate the result value, which is equal to the sum of the first n Fibonacci numbers.
Note. Fibonacci numbers are a series of numbers in which each next number is equal to the sum of the two
preceding ones: 0, 1, 1, 2, 3, 5, 8, 13... (the value of the fist element in Fibonacci numbers is "0", the values of the second and the third elements are equal to "1", for other elements use the formula F(n)=F(n-1)+F(n-2))
Example,
n = 8 result = 33;
n = 11 result = 143; */

    public static int task3 (int z){
        int result = 0 ;
        int var1 = 0;
        int var2 = 1;
        int var3;
        if (z <= 0 || z ==1){
            result = 0;
        } else if (z == 2){
            result = 1;
        } else if (z > 2) {
            for (int i = 2; i < z; i++) {
                var3 =  var1 + var2  ;
                result = var3 + result;
                var1 = var2;
                var2 = var3;

            }
            result++;
        }
        return result;
    }
}
