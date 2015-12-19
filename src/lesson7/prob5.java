package lesson7;

import java.util.Scanner;

/**
 * Created by Anton on 12/20/2015.
 */
public class prob5 {


    public static void rowaverage (int[][] arr) //func calculates averages of each row of array
    {

        int rowsum=0;
        int rowsum2=0;
        int rowsum3=0;
        int rowsum4=0;


            for (int j=0; j<3;j++) {

                rowsum = rowsum + arr[0][j];
            }
        System.out.println("Row 1 avg: "+rowsum/3);

        for (int j=0; j<3;j++) {

            rowsum2 = rowsum2 + arr[1][j];
        }
        System.out.println("Row 2 avg: "+rowsum2/3);

        for (int j=0; j<3;j++) {

            rowsum3 = rowsum3 + arr[2][j];
        }
        System.out.println("Row 3 avg: "+rowsum3/3);

        for (int j=0; j<3;j++) {

            rowsum4 = rowsum4 + arr[3][j];
        }
        System.out.println("Row 4 avg: "+rowsum4/3);




    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr=new int[4][3];

        for (int i=0; i<arr.length; i++)
            for (int j=0; j<arr[i].length; j++) {
                System.out.print("Enter num to arr " + i+" " + j+" :");
                arr[i][j]=sc.nextInt();
            }

        rowaverage(arr);



    }



}
