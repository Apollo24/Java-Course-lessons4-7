package com.company;

import  java.util.*;


/**
 * Created by Anton on 08/11/2015.
 */
public class class3prob9 {

    public static void main(String[] args) {
        // write

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        num = scan.nextInt();

        if (  ((num % 10)>=0) && (num / 100==0) && (num/10>0)   )
            System.out.println("Two digits number");
        else
            if ( (num % 1000)>=1 && (num/10>0) && (num / 1000)==0)
        System.out.println("Three digits number");
    }
}
