package lesson7;

import java.util.Scanner;

/**
 * Created by Anton on 13/12/2015.
 */
public class prob1 {


    public static int avg(int x, int y, int z)
    {


        return (x+y+z)/3;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x=0;
        int y=0;
        int z=0;


        System.out.println("Enter 3 nums: ");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        System.out.println("Average: "+avg(x,y,z));
    }


}
