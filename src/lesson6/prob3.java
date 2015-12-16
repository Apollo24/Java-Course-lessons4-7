package lesson6;


import java.util.Scanner;

/**
 * Created by Anton on 06/12/2015.
 */
public class prob3 {


    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter num " + i + "," + j);
                arr[i][j] = sc.nextInt();
            }
        }

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i][0];
            sum2 = sum2 + arr[i][2];
        }
        for (int i = 1; i < (arr.length-1); i++) {
            for (int j = 1; (j < arr[i].length-1); j++) {
                sum3 = sum3 + arr[0][j];
                sum4 = sum4 + arr[2][j];
            }

        }

        System.out.println("Sum of the frame numbers: "+(sum1+sum2+sum3+sum4));
    }
}

