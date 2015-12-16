package lesson5;

import java.util.Scanner;

/**
 * Created by Anton on 06/12/2015.
 */
public class prob8 {


    public static void main(String[] args) {


        int[] ArrayA = new int[5];

        for (int i = 0; i < 5; i++) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number " + i + " to array A");
            ArrayA[i] = scan.nextInt();

        }

        int max=ArrayA[0];

        for (int i = 1; i < 5; i++) {

            if (ArrayA[i]>max)
                max=ArrayA[i];

        }

        System.out.println("Max num is: "+max);


        }







        

    }





