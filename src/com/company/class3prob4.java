package com.company;

import  java.util.*;


/**
 * Created by Anton on 08/11/2015.
 */
public class class3prob4{

    public static void main(String[] args) {
        // write

        int num1,num2,num3,num4;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter side 1:");
        num1=scan.nextInt();

        System.out.println("Enter side 2:");
        num2=scan.nextInt();

        System.out.println("Enter side 3:");
        num3=scan.nextInt();

        System.out.println("Enter side 4:");
        num4=scan.nextInt();


        if (num1==num2 && num2==num3 && num3==num4)


                    System.out.println("This is rhombus");
        else
            System.out.println("This is not rhombus");


    }
}
