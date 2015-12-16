package classnumber4;

import  java.util.*;



/**
 * Created by Anton on 08/11/2015.
 */
public class prob3 {

    public static void main(String[] args) {
        String name;
        for (int i = 1; i <= 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter name:");
            name = scan.nextLine();
            System.out.println("Your name: "+name);
            System.out.println("Your id: "+i);

        }

    }
}
