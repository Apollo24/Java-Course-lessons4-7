package lesson5;

import java.util.Scanner;

/**
 * Created by Anton on 06/12/2015.
 */
public class prob4 {

    public static void main(String[] args) {

        int[] ArrayA = new int[5];
        int[] ArrayB = new int[5];

        for (int i = 0; i < 5; i++) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number " + i + " to array A");
            ArrayA[i] = scan.nextInt();
        }

        for (int i = 0; i < 5; i++) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number " + i + " to array B");
            ArrayB[i] = scan.nextInt();
        }

        //int x = 2;
        boolean eqaul = true;
        for (int i = 0; i < 5; i++) {

            if (ArrayA[i] != ArrayB[i]) {
                eqaul = false;
                break;
            }


        }

            if (eqaul)
                System.out.println("Arrays are equal");
            else
                System.out.println("Arrays are not equal");





    }
}
