package com.company;

import  java.util.*;


/**
 * Created by Anton on 08/11/2015.
 */
public class class3prob12 {

    public static void main(String[] args) {
        // write

        int rate;
        double hours;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your rate:");
        rate = scan.nextInt();
        System.out.println("Enter total hours:");
        hours = scan.nextDouble();

        switch (rate) {
            case 1:
                System.out.println(hours * 30);
                break;
            case 2:
                System.out.println(hours * 40);
                break;
            case 3:
                System.out.println(hours * 60);
                break;
            default:
                System.out.println(hours * 20);

        }

    }
}
