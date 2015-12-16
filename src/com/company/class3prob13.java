package com.company;

import  java.util.*;


/**
 * Created by Anton on 08/11/2015.
 */
public class class3prob13 {

    public static void main(String[] args) {
        // write

        int month;
        double salary;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary:");
        salary = scan.nextDouble();
        System.out.println("Enter month number:");
        month = scan.nextInt();

        switch (month) {
            case 2:
                System.out.println(salary / 28);
                break;
            case 4:
            case 7:
                System.out.println(salary / 30);
                break;
            case 9:
                System.out.println(salary / 30);
                break;
            case 11:
                System.out.println(salary / 30);
                break;
            default:
                System.out.println(salary / 31);
                break;
        }
    }
}
