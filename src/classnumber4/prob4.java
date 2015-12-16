package classnumber4;

import  java.util.*;



/**
 * Created by Anton on 08/11/2015.
 */
public class prob4 {


    public static void main(String[] args) {

        int max, min;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter max:");
        max = scan.nextInt();
        System.out.println("Enter min:");
        min = scan.nextInt();

        for (int i = min; i <= max; i++) {
            System.out.print(i);
            System.out.print(' ');
        }


    }
}
