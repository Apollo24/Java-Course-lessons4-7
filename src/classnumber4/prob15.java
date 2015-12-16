package classnumber4;

import java.util.Scanner;

/**
 * Created by Anton on 24/11/2015.
 */
public class prob15 {

    public static void main(String[] args) {

        int last = 0;
        int current;
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int max_length = 0;

        do {
            System.out.println("Print num:");
            current = sc.nextInt();

            if (current > last) {
                counter++;

            } else {
                if (counter > max_length)
                    max_length = counter;

                counter = 1;

            }

            last = current;


        } while (current != 0);

        System.out.println("The longest is " + max_length);
    }
}
