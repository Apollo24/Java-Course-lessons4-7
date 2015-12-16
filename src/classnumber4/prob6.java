package classnumber4;

import  java.util.*;



/**
 * Created by Anton on 08/11/2015.
 */
public class prob6 {


    public static void main(String[] args) {

        int num, count=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {


                System.out.print(i);
                System.out.print(' ');
                count++;

            }

        }
        System.out.println();
        System.out.print(count);


    }
}
