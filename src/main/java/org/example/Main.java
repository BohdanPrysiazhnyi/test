package org.example;

import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        int [][] matrix =  {{2, 4, 3, 3},{5, 7, 8, 5},{2, 4, 3, 3},{5, 7, 8, 5}};

        HomeWork3.matrix(matrix);
        for (int i = 0; i < HomeWork3.matrix(matrix).length; i++) {
            for (int j = 0; j < HomeWork3.matrix(matrix).length; j++) {
                System.out.print(HomeWork3.matrix(matrix)[i][j]);

            }
            System.out.println(' ');
        }


    }
}

