package lesson8;

import java.util.Scanner;

/**
 * Created by Anton on 12/20/2015.
 *
 * Checkers game - Final Project of Java Course at TAU December 2015
 *

 */
public class Checkers {


    public static String[][] initialorder() //func to create starting checkers board
    {

        String[][] initial = new String [][] {
        {"-","-","-","-","-","-","-","-","-","-","-","-"},
        {"-","-","1","2","3","4","5","6","7","8","-","-"},
        {"-","1","#","W","#","W","#","W","#","W","1","-"},
        {"-","2","W","#","W","#","W","#","W","#","2","-"},
        {"-","3","#","W","#","W","#","W","#","W","3","-"},
        {"-","4","#","#","#","#","#","#","#","#","4","-"},
        {"-","5","#","#","#","#","#","#","#","#","5","-"},
        {"-","6","B","#","B","#","B","#","B","#","6","-"},
        {"-","7","#","B","#","B","#","B","#","B","7","-"},
        {"-","8","B","#","B","#","B","#","B","#","8","-"},
        {"-","-","1","2","3","4","5","6","7","8","-","-"},
        {"-","-","-","-","-","-","-","-","-","-","-","-"}
    };




        return initial;

    }

    public static boolean checkmove(int x, int y, int a, int b, String[][] board, char type) // func checks whether move is correct
    {


        boolean check=false;

        if (type=='W')  // check valid W not king move

            check = (((board[x][y] == "W") && (board[a][b] == "#")) && (a == x + 1) && (b == y + 1 || b == y - 1));


        if (type=='B')  //check valid B not king move

        check= (((board[x][y]=="B") && (board[a][b] =="#")) && (a == x - 1) && (b == y + 1 || b == y - 1));


        return check;


    }

    public static boolean checkkingmove (int x, int y, int a, int b, String[][] board, char type)
    {

        boolean check = false;



        check = (((board[x][y] == "K") || (board[x][y] == "Q"))  && (board[a][b] == "#")) && ((a == x + 1 || a == x-1) && (b == y + 1 || b == y - 1));



        return check;

    }

    public static String[][] makemove(int x, int y, int a, int b, String[][] board, char type) //func recieves checker position and it's move coordinates,  modifes dashboard after this turn
    {

        board[x][y] = "#";

           if ((type=='W') && (a!=9))


                board[a][b] = "W";


          if ((type=='W') && (a==9))


                board[a][b] = "K";





        if ((type == 'B') && (a!=2))

        board[a][b] = "B";

        else if ((type=='B') && (a==2))

            board[a][b] = "Q";



        return board;

    }

    public static String[][] makekingmove(int x, int y, int a, int b, String[][] board, char type)
    {
        board[x][y] = "#";

        if (type=='W')

            board[a][b] = "K";

        if (type=='B')

            board[a][b] = "Q";

        return board;

    }


    public static boolean checkeat(int x, int y, int a, int b, String[][] board, char type) // func checks whether eat move is correct
    {
        boolean check=false;

        if (type=='W')

            check = (board[x][y]=="W") && ((board[x+1][y+1]=="B") || (board[x+1][y+1]=="Q") || (board[x+1][y-1]=="B") || (board[x+1][y-1]=="Q")) &&  (a == x + 2) && (b == y + 2 || b == y - 2) && ((board[x+2][y+2]=="#" || board[x+2][y-2]=="#"));

        if (type=='B')

            check = (board[x][y]=="B") && ((board[x-1][y-1]=="W") || (board[x-1][y-1]=="K") || (board[x-1][y+1]=="W") || (board[x-1][y+1]=="K")) && (a == x - 2) && (b == y + 2 || b == y - 2) && ((board[x-2][y+2]=="#" || board[x-2][y-2]=="#"));


        return check;


    }

    public static boolean checkkingeat(int x, int y, int a, int b, String[][] board, char type) // func check king's eat move
    {

        boolean check=false;

        if (type=='W')

            check = ((board[x][y] == "K")  && (board[a][b] == "#")) && ((board[x-1][y-1]=="B") || (board[x-1][y+1]=="B") || (board[x+1][y-1]=="B") || (board[x+1][y+1]=="B") || (board[x-1][y-1]=="Q") || (board[x-1][y+1]=="Q" || (board[x+1][y-1]=="Q") || (board[x+1][y+1]=="Q")) && ((a == x+2) || (a==x-2)) && ((b==y+2) || (b==y-2)) && ((board[x-2][y+-2]=="#") || (board[x-2][y+2]=="#") || (board[x+2][y-2]=="#") || (board[x+2][y-2]=="#")));

        if (type=='B')

            check = ((board[x][y] == "Q")  && (board[a][b] == "#")) && ((board[x-1][y-1]=="W") || (board[x-1][y+1]=="W") || (board[x+1][y-1]=="W") || (board[x+1][y+1]=="W") || (board[x-1][y-1]=="K") || (board[x-1][y+1]=="K" || (board[x+1][y-1]=="K") || (board[x+1][y+1]=="K")) && ((a == x+2) || (a==x-2)) && ((b==y+2) || (b==y-2)) && ((board[x-2][y+-2]=="#") || (board[x-2][y+2]=="#") || (board[x+2][y-2]=="#") || (board[x+2][y-2]=="#")));


        return check;


    }


    public static String[][] eatmove(int x, int y, int a, int b, String[][] board, char type) // func makes eat move
    {

        board[x][y] = "#";


        if (type == 'W' && b>y) {

            board[a-1][b-1]="#";

            if (a!=9)
            board[a][b] = "W";

            if (a==9)
                board[a][b] = "K";

        }
       if (type == 'W' && b<y){

        board[a-1][b+1]="#";

           if (a!=9)
        board[a][b] = "W";

           if (a==9)
               board[a][b] = "K";
    }

        if (type == 'B' && y>b) {

            board[a +1][b + 1] = "#";

            if (a!=2)
            board[a][b] = "B";

                if (a==2)
                    board[a][b] = "Q";
        }
        if (type == 'B' && y<b)
    {
        board[a +1][b - 1] = "#";

        if (a!=2)
        board[a][b] = "B";

        if (a==2)
            board[a][b] = "Q";
    }

        return board;


    }


    public static String[][] kingeatmove(int x, int y, int a, int b, String[][] board, char type) // func makes king eat move
    {
        board[x][y] = "#";

        if ((type=='W') && (a<x))
        {
            board[a][b]= "K";

            if (y>b)
            board[a+1][b+1] = "#";

            if (y<b)
                board[a+1][b-1] = "#";
        }

        if ((type=='W') && (a>x))
        {
            board[a][b]= "K";

            if (b>y)
                board[a-1][b-1] = "#";

            if (b<y)
                board[a-1][b+1]="#";
        }

        if ((type=='B') && (a<x))
        {
            board[a][b]= "Q";

            if (y>b)
                board[a+1][b+1] = "#";

            if (y<b)
                board[a+1][b-1] = "#";
        }

        if ((type=='B') && (a>x))
        {
            board[a][b]= "Q";

            if (b>y)
                board[a-1][b-1] = "#";

            if (b<y)
                board[a-1][b+1]="#";
        }

        return board;


    }


    public static void printboard(String[][] board)         // prints board after any turn
    {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                System.out.print("  ");
            }

            System.out.println("    ");


        }
    }


    public static int getx(int input)
    {
        return (input / 1000)+1;
    }

    public static int gety(int input)
    {
        return (input % 1000 / 100) +1;
    }

    public static int geta(int input)
    {
        return (input % 1000 / 10 % 10)+1;
    }
    public static int getb(int input)
    {
        return (input % 10)+1;
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        char type; //player type B or W

        int winput=0; // W coordinates input
        int wx = 0; //W checker x position
        int wy = 0; //W checker y position
        int wa = 0; //W next move x coordinate
        int wb = 0; //W next move y coordinate

        int binput=0; // B coordinates input
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
                winput=sc.nextInt();
                wx = getx(winput);
                wy = gety(winput);
                wa = geta(winput);
                wb = getb(winput);
                type = 'W';


                if ((board[wx][wy]== "W") && (checkmove(wx, wy, wa, wb, board, type))) {
                    makemove(wx, wy, wa, wb, board, type); /// rewrites board after W move
                    wrightmove = true;
                }

                else if ((board[wx][wy]== "K") && (checkkingmove(wx, wy, wa, wb, board, type))) {
                    makekingmove(wx, wy, wa, wb, board, type); /// rewrites board after W move
                    wrightmove = true;
                }



                else if ((board[wx][wy]== "W") && (checkeat(wx,wy,wa, wb, board, type))) {

                    eatmove(wx, wy, wa, wb, board,type);
                    amountb--;
                    wrightmove = true;

                }

                else if ((board[wx][wy]== "K") && (checkkingeat(wx,wy,wa, wb, board, type))){
                    kingeatmove(wx,wy,wa, wb, board, type);
                    amountb--;
                    wrightmove = true;
                }





                else
                {

                        System.out.println("This move is invalid. Please enter a new move.");
                        wrightmove = false;

                }


            }


            printboard(board);




            if (amountb==0)
            {
                System.out.println("White wins");
                win=true;
                break;
            }


            while (brightmove == false) {
                System.out.print("Player B, it's your turn, please enter your move.");
                binput=sc.nextInt();
                bx = getx(binput);
                by = gety(binput);
                ba = geta(binput);
                bb = getb(binput);
                type = 'B';


                if ((board[bx][by]=="B") && (checkmove(bx, by, ba, bb, board, type))) {
                    makemove(bx, by, ba, bb, board, type);
                    brightmove = true;
                }

                else if ((board[bx][by]=="Q") && (checkkingmove(bx,by,ba, bb, board, type))) {
                    makekingmove(bx, by, ba, bb, board, type);
                    brightmove = true;
                }


                else if ((board[bx][by]=="B") && (checkeat(bx,by,ba,bb,board,type))) {

                    eatmove(bx, by, ba, bb, board,type);
                    amountw--;
                    brightmove = true;

                }

                else if ((board[bx][by]=="Q") && (checkkingeat(bx,by,ba,bb,board,type)))
                {
                    kingeatmove(bx,by,ba,bb,board,type);
                    amountw--;
                    brightmove = true;

                }



                else {
                    System.out.println("This move is invalid. Please enter a new move.");
                    brightmove = false;
                }

            }


            printboard(board);

            if (amountw==0)
            {
                System.out.println("Black wins");
                win=true;
                break;
            }

        wrightmove = false;
        brightmove = false;


        }
    }


}




