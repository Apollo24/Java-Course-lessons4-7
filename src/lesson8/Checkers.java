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


        if (type == 'B')
            board[a - 1][b - 1] = "B";


        return board;

    }

    public static void printboard(String[][] board)         // prints board after any turn
    {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                System.out.print("  ");
            }

            System.out.println(" ");


        }
    }




    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        char type; //player type B or W

        int wx = 0; //W checker x position
        int wy = 0; //W checker y position
        int wa = 0; //W next move x coordinate
        int wb = 0; //W next move y coordinate

        int bx = 0; //B checker x position
        int by = 0; //B checker y position
        int ba = 0; //B next move x coordinate
        int bb = 0; //B next move y coordinate

        int amountw = 12; //total amount of W (initial - 12)
        int amountb = 12; // total amount of B (initial -12)

        boolean win = false;
        boolean draw = false;

        boolean wrightmove = false;
        boolean brightmove = false;

        String[][] board = initialorder();

        System.out.print("Welcome to Java Checkers. To start the game press 'enter'");
        sc.nextLine();
        System.out.println("The board:");
        printboard(board);




        while (win == false && draw == false) {


            while (wrightmove == false) {
                System.out.print("Player W, it's your turn, please enter your move.");
                wx = sc.nextInt();
                wy = sc.nextInt();
                wa = sc.nextInt();
                wb = sc.nextInt();
                type = 'W';


                if ((wa == wx + 1) && (wb == wy + 1 || wb == wy - 1)) {
                    makemove(wx, wy, wa, wb, board, type); /// rewrites board after W move
                    wrightmove = true;
                } else {
                    System.out.println("This move is invalid. Please enter a new move.");
                    wrightmove = false;
                }


            }


            printboard(board);


            while (brightmove == false) {
                System.out.print("Player B, it's your turn, please enter your move.");
                bx = sc.nextInt();
                by = sc.nextInt();
                ba = sc.nextInt();
                bb = sc.nextInt();
                type = 'B';


                if ((ba == bx - 1) && (bb == by + 1 || bb == by - 1)) {
                    makemove(bx, by, ba, bb, board, type);
                    brightmove = true;
                } else {
                    System.out.println("This move is invalid. Please enter a new move.");
                    brightmove = false;
                }

            }

            printboard(board);

        wrightmove = false;
        brightmove = false;


        }
    }
}




