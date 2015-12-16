package classnumber4;

import  java.util.*;



/**
 * Created by Anton on 08/11/2015.
 */
public class prob5 {


    public static void main(String[] args) {

        int num, sum = 0;
        for (int i = 1; i <= 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number:");
            num = scan.nextInt();
            sum = sum + num;

        }

        System.out.println("Average: " + (sum / 5));
    }
}
