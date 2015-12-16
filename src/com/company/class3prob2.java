package com.company;

import  java.util.*;



/**
 * Created by Anton on 08/11/2015.
 */
public class class3prob2{

    public static void main(String[] args) {
        // write

        String name;
        int mark;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name:");
        name=scan.nextLine();

        System.out.println("Enter mark:");
        mark=scan.nextInt();

        if (mark>54)
        {
            System.out.println(name+" you have passed");
        }




    }
}
