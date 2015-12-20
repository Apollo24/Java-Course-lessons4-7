package lesson8;

import java.util.Scanner;

/**
 * Created by Anton on 12/20/2015.
 */
public class Checkers {


    public static String[][] initialorder() //func to create starting checkers board
    {

        String[][] initial = new String[8][8];


        //row1
        for (int j = 0; j < 8; j = j + 2) {
            initial[0][j] = "#";

        }
        for (int j = 1; j < 8; j = j + 2) {
            initial[0][j] = "W";
        }
        //row2
        for (int j = 0; j < 8; j = j + 2) {
            initial[1][j] = "W";
        }
        for (int j = 1; j < 8; j = j + 2) {
            initial[1][j] = "#";
        }
        //row3
        for (int j = 0; j < 8; j = j + 2) {
            initial[2][j] = "#";

        }
        for (int j = 1; j < 8; j = j + 2) {
            initial[2][j] = "W";
        }
        //row4-5
        for (int i = 3; i < 5; i++)
            for (int j = 0; j < 8; j++)
                initial[i][j] = "#";
        //row6
        for (int j = 0; j < 8; j = j + 2) {
            initial[5][j] = "B";
        }
        for (int j = 1; j < 8; j = j + 2) {
            initial[5][j] = "#";
        }
        //row 7
        for (int j = 0; j < 8; j = j + 2) {
            initial[6][j] = "#";

        }
        for (int j = 1; j < 8; j = j + 2) {
            initial[6][j] = "B";
        }
        //row8
        for (int j = 0; j < 8; j = j + 2) {
            initial[7][j] = "B";
        }
        for (int j = 1; j < 8; j = j + 2) {
            initial[7][j] = "#";
        }

        return initial;

    }


    public static String[][] makemove(int x, int y, int a, int b, String[][] board, char type) //func recieves checker position and it's move coordinates,  modifes dashboard after this turn
    {

        board[x - 1][y - 1] = "#";

        if (type == 'W')
            board[a - 1][b - 1] = "W";
        else if (type == 'B')
            board[a - 1][b - 1] = "B";
        return board;

    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        char type; //player type B or W
        int x = 0; //checker x position
        int y = 0; //checker y position
        int a = 0; //next move x coordinate
        int b = 0; //next move y coordinate


        System.out.print("Welcome to Java Checkers. To start the game press 'enter'");
        sc.nextLine();
        System.out.println("The board:");

        String[][] board = initialorder();

        for (int i = 0; i < board.length; i++) {                      /// prints initial board
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                System.out.print("  ");
            }

            System.out.println(" ");

        }


        for (int t = 0; t < 10; t++) {
            System.out.print("Player W, it's your turn, please enter your move.");
            x = sc.nextInt();
            y = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();

            type = 'W';
            makemove(x, y, a, b, board, type);

            for (int i = 0; i < board.length; i++) {                      /// prints board after move
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j]);
                    System.out.print("  ");
                }

                System.out.println(" ");

            }

        }

    }
}
