package org.example;


import org.w3c.dom.ls.LSOutput;

public class HomeWork1 {
    /*Task 1:
For a given integer n calculate the value which is equal to a:
• squared number, if its value is strictly positive;
• modulus of a number, if its value is strictly negative;
• zero, if the integer n is zero.
    Example:
n = 4    -> result =  16
n = -5  ->  result =  5
n = 0   ->  result = 0 */
    public static int x(int z) {
        int result;
        if (z < 0) {
            result = Math.abs(z);
        } else if (z > 0) {
            result = z * z;

        } else result = 0;
        return result;
    }



   /*Task 2:
Find the maximum integer, that can be obtained by permutation of numbers of an arbitrary three-digit positive integer n (100<=n<=999).
    Example:
n = 165  -> result =  651
n = 123 -> result = 321*/

}
