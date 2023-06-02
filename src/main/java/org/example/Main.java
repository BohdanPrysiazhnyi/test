package org.example;

import home.work.four.SortOrder;
import home.work.four.Task1;
import home.work.four.Task2;

import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        int[] array = {15, 10, 3};
        SortOrder order = SortOrder.DESC;
        System.out.println(Task1.sortOrder(array, order));

        for (int q: Task2.transform(array,order)) {
            System.out.println(q);
        }

    }


}





