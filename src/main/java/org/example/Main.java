package org.example;

public class Main {


    public static void main(String[] args) {
        int first = 1;
        int two = 2;
        int thre = 6;
        char q = 'q';
        String test1 = "qwerty";
        System.out.println(first + two + thre);
        System.out.println(test1.toLowerCase());
//        while (thre < 5){
        //          System.out.println(thre);
        //        thre++;
        //  }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        if (thre < first) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

