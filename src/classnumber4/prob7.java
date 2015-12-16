package classnumber4;

import  java.util.*;



/**
 * Created by Anton on 08/11/2015.
 */
public class prob7 {


    public static void main(String[] args) {

        int num, count = 0;

        for (int i = 1; i <= 99; i++) {
            if ((i % 7 == 0) || (i / 10 == 7) || (i % 10 == 7)) {
                System.out.println(i + " - boom");
                count++;
            }
            else
                System.out.println(i);
        }

        System.out.println("Total booms:"+count);
    }

}
