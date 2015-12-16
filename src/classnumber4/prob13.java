package classnumber4;

import java.util.Scanner;

/**
 * Created by Anton on 04/12/2015.
 */
public class prob13 {



    public static void main(String[] args) {


        int num, i=0, sum=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        num = scan.nextInt();
        sum=num%10;


        while (num/10!=0)
        {
            num=num/10;
            i++;
            sum=sum+num;
        }
        System.out.println("Total digits: "+(i+1));
        System.out.println("Total digits sum: "+sum);
    }
}
