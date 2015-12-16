package classnumber4;

import java.util.Scanner;

/**
 * Created by Anton on 24/11/2015.
 */
public class prob8 {

    public static void main(String[] args) {

        String name;
        int mark=0, sum=0;

        for (int i=1; i<=5; i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter name:");
            name = scan.next();
            for (int j=1; j<=3; j++)
            {

                System.out.println("Enter mark:");
                mark = scan.nextInt();
                sum=sum+mark;
            }
            System.out.println(name);
            System.out.println("Average: "+(sum/3));
        }

    }






}
