package lesson7;

import java.util.Scanner;

/**
 * Created by Anton on 13/12/2015.
 */
public class prob3 {

    public static void func (int[] x, int y)
    {

        for (int i=0; i<x.length;i++)
        {
            x[i]=x[i]*y;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int y=0;

        System.out.println("Enter number: ");
        y=sc.nextInt();

        for (int i=0;i<x.length;i++)
        {
            System.out.println("Enter number: "+i);
            x[i]=sc.nextInt();


        }



        func(x,y);

        for (int i=0;i<x.length;i++)
        {

            System.out.println(x[i]);
        }

    }







}
