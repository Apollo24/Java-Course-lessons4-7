package lesson6;


import java.util.Scanner;

/**
 * Created by Anton on 06/12/2015.
 */
public class prob1 {


    public static void main(String[] args) {


        int[][] arr = new int[2][2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter num " + i + "," + j);
                arr[i][j] = sc.nextInt();
            }
        }

        int min = arr[0][0];
        int mini = 0, minj = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    mini = i;
                    minj = j;
                }

            }


        }

        System.out.print("Minimum num is in: "+mini+","+minj);


    }
}
