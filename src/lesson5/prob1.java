package lesson5;

import java.util.Scanner;

/**
 * Created by Anton on 29/11/2015.
 */
public class prob1 {

    public static void main(String[] args) {

        int[] MyArray = new int[10] ;

        for (int i=0; i<MyArray.length; i++)
        {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number:");
            MyArray[i]=scan.nextInt();

        }


        for (int j=MyArray.length - 1; j>=0;j--)
        {

            System.out.println(MyArray[j]);

        }



    }


}
