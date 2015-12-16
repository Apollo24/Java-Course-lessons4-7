package com.company;

import  java.util.*;


/**
 * Created by Anton on 08/11/2015.
 */
public class class3prob3{

    public static void main(String[] args) {
        // write

        int num1,num2;



        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1:");
        num1=scan.nextInt();

        System.out.println("Enter number 2:");
        num2=scan.nextInt();

        if (num1>num2)
            System.out.println(num1+num2);
        else
            System.out.println(num1*num2);




    }
}
