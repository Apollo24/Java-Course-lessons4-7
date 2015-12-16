package com.company;

import  java.util.*;


/**
 * Created by Anton on 08/11/2015.
 */
public class class3prob6{

    public static void main(String[] args) {
        // write

        int a,b,c, max, mid, min;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1:");
        a=scan.nextInt();
        System.out.println("Enter number 2:");
        b=scan.nextInt();
        System.out.println("Enter number 3:");
        c=scan.nextInt();

        if (a<b)
        {
            if (a<c)
                min=a;
            else
                min=c;
        }
        else
        {
            if (b<c)
                min=b;
            else
                min=c;
        }
        if (a>b)
        {
            if (a>c)
                max=a;
            else
                max=c;
        }
        else
        {
            if (b>c)
                max=b;
            else
                max=c;
        }
        if ( (a>b && a<c) || (a<b && a>c))
            mid=a;
        else
        {
            if ((b<a && b>c) || (b>a && b<c))
                mid=b;
            else
                mid=c;
        }


System.out.println(max);
        System.out.println(mid);
        System.out.println(min);

    }
}
