package lesson6;

import java.util.Scanner;

/**
 * Created by Anton on 11/12/2015.
 */
public class prob10 {

    public static void main(String[] args)
    {

        String math;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter math formula: ");
        math=sc.nextLine();

        int open=0;
        int close=0;



        for (int i=0; i<math.length(); i++) {
            if (math.charAt(i) == '(')
                open++;

            if (math.charAt(i) ==')')
                close++;

        }

        if (open==close)
            System.out.println("Brackets are normal");
        else
            System.out.println("Bad brackets");


    }


}
