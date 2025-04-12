package arrays.two_d;

import java.util.Scanner;

public class TicTocToiGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] board=new char[3][3];
        for (int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }

        boolean gameOver=false;
        char player='X';
        int drawGame=0;
        while (!gameOver){
            drawGame++;
            printBoard(board);
            System.out.println("Enter for "+ player);
            System.out.print("Enter Row Col : ");
            int row=sc.nextInt();
            int col=sc.nextInt();
            if(row>=board.length || col>=board[0].length){
                System.out.println("Out of Box!");
                System.out.println("Try again!");
            }else if(board[row][col]==' '){
                board[row][col]=player;
            }else {
                System.out.println("Invalid move! by "+player );
                System.out.println("Do in next chance!");
            }
            gameOver=isWin(board,player);
            if(gameOver){
                printBoard(board);
                System.out.println(player + " Has won!");
            }else {
                player=(player=='X')?'O':'X';
            }
            if(drawGame>=9){
                System.out.println("Draw math!");
                return;
            }

        }

    }

    public static boolean isWin(char[][] board,char player){
        //for row
        for(int row=0;row<board.length;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }
        //for col
        for(int col=0;col<board.length;col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        //for digonal
        if(board[0][0]==player && board[1][1]==player &&board[2][2]==player){
            return true;
        }
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }
        return false;
    }
    public static void printBoard(char[][] board){
        for (int i=0;i<board.length;i++){
            System.out.print(" | ");
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+ " | ");
            }
            System.out.println();
            System.out.println(" "+"--------------");

        }
    }
}
