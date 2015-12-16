package com.company;

import  java.util.*;


/**
 * Created by Anton on 08/11/2015.
 */
public class class3prob10 {

    public static void main(String[] args) {
        // write

        int num1, num2;
        char act;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1:");
        num1 = scan.nextInt();
        System.out.println("Enter number 2:");
        num2 = scan.nextInt();
        System.out.println("Enter action:");
        Scanner reader = new Scanner(System.in);
        act = reader.next().charAt(0);

        switch (act)
        {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
        }
    }

}