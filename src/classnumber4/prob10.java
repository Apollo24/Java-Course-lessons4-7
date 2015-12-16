package classnumber4;

import java.util.Scanner;

/**
 * Created by Anton on 24/11/2015.
 */
public class prob10 {

    public static void main(String[] args) {


    int count=0;
        int num;

        for (int i=1; i<=10; i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number:");
            num = scan.nextInt();
            if (num % i ==0)

            continue;
            else

                count++;
        }
        System.out.print("Total prime numbers: "+count);

    }
}
