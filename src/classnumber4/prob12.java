package classnumber4;

import java.util.Scanner;

/**
 * Created by Anton on 04/12/2015.
 */
public class prob12 {


    public static void main(String[] args) {

        int num=0;
        int i=0, sum=0;

        while ((num !=7) && (i<10))
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number:");
            num = scan.nextInt();

            if (num!=7)
            {
                sum = sum + num;
                i++;
            }
            else
            break;
        }
        System.out.print("Sum: "+sum);








    }




}
