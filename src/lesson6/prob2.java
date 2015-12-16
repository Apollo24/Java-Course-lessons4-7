package lesson6;



import java.util.Scanner;

/**
 * Created by Anton on 06/12/2015.
 */
public class prob2 {


    public static void main(String[] args) {


        int[][] arr = new int[4][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter num " + i + "," + j);
                arr[i][j] = sc.nextInt();
            }
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i][0];
            sum2 = sum2 + arr[i][2];
        }

        if (sum1==sum2)
            System.out.println("Sum of first line equals the sum of last line");
            else
            System.out.println("Sum of first line doesn't equal the sum of last line");


    }
}
