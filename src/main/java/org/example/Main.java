package org.example;

import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        int [] q ={100, 2, 3, 45, 33, 8, 4, 54};
        HomeWork3.task1(q);
        for (int i = 0; i < HomeWork3.task1(q).length; i++) {
            System.out.println(HomeWork3.task1(q)[i]);
        }
    }
}

