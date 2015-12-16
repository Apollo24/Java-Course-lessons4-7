package com.company;

import  java.util.*;


/**
 * Created by Anton on 08/11/2015.
 */
public class class3prob5{

    public static void main(String[] args) {
        // write

        int num1,num2,num3;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter side 1:");
        num1=scan.nextInt();
        System.out.println("Enter side 2:");
        num2=scan.nextInt();
        System.out.println("Enter side 3:");
        num3=scan.nextInt();

        if (num1!=num2 && num2!=num3)
            System.out.println("Ribs are not equal");
        else
            System.out.println("Ribs are equal");





    }
}
