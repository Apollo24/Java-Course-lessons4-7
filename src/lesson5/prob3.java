package lesson5;

import java.util.Scanner;

/**
 * Created by Anton on 06/12/2015.
 */
public class prob3 {

    public static void main(String[] args) {

        int[] MyArray = new int[20];
        int num , sum=0;

        for (int i = 0; i < 20; i++) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number:");
            MyArray[i] = scan.nextInt();

        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one more number:");
        num = scan.nextInt();

        for (int i = 0; i < 20; i++) {

            if (MyArray[i]==num)
                sum++;


        }

        System.out.println("Your num appeared in array: "+sum+" times");


    }
}
