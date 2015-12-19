package lesson7;


import java.util.Scanner;


/**
 * Created by Anton on 12/16/2015.
 */
public class prob4 {

    public static int checkemail (String email) //func to check email for @ exist and not isn't first char
    {
        char at='@';
        return email.indexOf(at,0);
    }

    public static int checkpass (String pass1, String pass2) //func to check whether passwords are the same;
    {

        return pass1.compareTo(pass2);

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email=sc.nextLine();

        int checkemail=checkemail(email);

        if (checkemail==-1 || checkemail==0)
            System.out.print("Incorrect email");

        System.out.print("Enter pass: ");
        String pass1=sc.nextLine();

        System.out.print("Confirm pass: ");
        String pass2=sc.nextLine();

        int checkpass =checkpass(pass1,pass2);

        if (checkpass!=0)

            System.out.print("Passwords do not match");
        else
            System.out.print("Well done!");





    }






}




