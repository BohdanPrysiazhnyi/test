package org.example;

import home.work.four.SortOrder;
import home.work.four.Task1;
import home.work.four.Task2;
import home.work.four.Task4;
import home.work6.Rectangle;
import home.work7.Company;
import home.work7.Employee;
import home.work7.Manager;
import home.work7.SalesPerson;

import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        Employee [] employees = new Employee[3];
        employees[0] = new Manager("Tom", 100,100);
        employees[1] = new SalesPerson("Adam", 100, 100);
        employees[2] = new Manager("Nick", 200,2);

        Company company = new Company(employees);
        company.giveEverbodyBonus(111);
        System.out.println(company.nameMaxSalary());

    }


}





