package lesson7;

import java.util.Scanner;

/**
 * Created by Anton on 13/12/2015.
 */
public class prob2 {

    public static int[] arr (int x, int y)
    {
        int[] mainarr=new int[(y-x)-1];

        for (int i=0;i<mainarr.length; i++) {
            mainarr[i] = x + 1;
            x++;
        }
        return mainarr;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x=0;
        int y=0;

        System.out.println("Enter 2 nums: ");
        x=sc.nextInt();
        y=sc.nextInt();

        int [] a=arr(x,y);

        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]);
        }


    }


}
