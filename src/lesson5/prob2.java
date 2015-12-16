package lesson5;

import java.util.Scanner;

/**
 * Created by Anton on 29/11/2015.
 */
public class prob2 {

    public static void main(String[] args) {

        int[] MyArray = new int[15];
        int num = 1;
        int length = 0;
        int i = 0;
        int last = 0;

        while ((i < 15)) {
            if (num != -1) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter number" + i + ": ");

                num = scan.nextInt();


                if (num != -1) {

                    MyArray[i] = num;


                    last = i;
                    i++;
                }
                else
                break;


            }


            int j = 0;
            int count = 0;
            while (j < MyArray[j]) {
                if (MyArray[j] > MyArray[last])
                    count++;
                j++;
            }


            System.out.print(count);


        }


    }
}

