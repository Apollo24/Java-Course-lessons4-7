package com.company;

import  java.util.*;


/**
 * Created by Anton on 08/11/2015.
 */
public class class3prob7 {

    public static void main(String[] args) {
        // write

        double hours, daily, extra;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter total hours:");
        hours = scan.nextDouble();
        if (hours > 8) {
            extra = hours - 8;
            daily = hours - extra;
            System.out.print("Your daily salary:" + ((daily * 50) + (extra * 50 * 1.5)));
        }
        else
            System.out.print("Your daily salary:" + (hours*50));

    }
}