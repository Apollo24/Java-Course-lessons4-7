package com.company;

import  java.util.*;


/**
 * Created by Anton on 08/11/2015.
 */
public class class3prob8 {

    public static void main(String[] args) {
        // write

        int side1, side2, side3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side 1:");
        side1 = scan.nextInt();
        System.out.println("Enter side 2:");
        side2 = scan.nextInt();
        System.out.println("Enter side 3:");
        side3 = scan.nextInt();
        if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2))
            System.out.println("Right triangle");
        else
            System.out.println("Not right triangle");
    }
}

