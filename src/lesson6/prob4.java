package lesson6;


import java.util.Scanner;


/**
 * Created by Anton on 06/12/2015.
 */
public class prob4 {

    public static void main(String[] args) {


        int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter num " + i + "," + j);
                arr[i][j] = sc.nextInt();
            }
        }


        int sum1=0;
        int sum2=0;

        for (int i = 0; i < arr.length; i++) {


            sum1+=arr[i][i];
            sum2+=arr[arr.length-i-1][arr.length-i-1];

        }

        System.out.println("sum1: "+sum1);


        System.out.println("sum2: "+sum2);

        if (sum1==sum2)
                System.out.println("Diagonals are equal");
        else
        System.out.println("Diagonals are not equal");



    }





}
