package guiaarrayejer27;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class GuiaArrayEjer27 {
 static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_RESET = "\u001B[0m";

    static char[][] board = new char[3][3];

    static Scanner scanner = new Scanner(System.in);
    static char player = 'X';
    static boolean gameOver = false;
    static char winnerPlayer = ' ';

    public static void main(String[] args) {

        initBoard(board);

        System.out.println("Bienvenido al juego Tic Tac Toe");

        printBoard(board);

        while (!gameOver) {

            System.out.print("Jugador " + player + "\nIngrese la fila: ");
            int row = scanner.nextInt() - 1;
            System.out.print("\nIngrese la columna: ");
            int column = scanner.nextInt() - 1;

            if (isvalidMove(board, row, column)) {

                board[row][column] = player;

                winnerPlayer = winner(board);

                if (winnerPlayer != ' ') {
                    gameOver = true;
                } else if (isFull(board)) {
                    gameOver = true;
                }

                printBoard(board);
                player = player == 'X' ? 'O' : 'X';

            } else {
                System.out.println(ANSI_RED + "Movimiento no válido" + ANSI_RESET);
                continue;
            }


        }


        if (winnerPlayer != ' ') {
            System.out.println("El ganador es el jugador " + winnerPlayer);
        } else {
            System.out.println("Empate");
        }

    }


    static void printBoard(char[][] board) {

        System.out.println(" ");
        System.out.println(ANSI_RED + " \t1\t 2\t 3" + ANSI_RESET);
        System.out.println("   -------------");
        for (int row = 0; row < board.length; row++) {

            System.out.print(ANSI_RED + " " + (row + 1) + ANSI_RESET);
            for (int column = 0; column < board.length; column++) {
                System.out.print(" | " + board[row][column]);
            }
            System.out.println(" |");
            System.out.println("   -------------");
        }


    }

    static void initBoard(char[][] board) {

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                board[row][column] = ' ';
            }
        }

    }

    static boolean isvalidMove(char[][] board, int row, int column) {

        if (row >= 0 && row <= 2 && column >= 0 && column <= 2) {

            return board[row][column] == ' ';
        }

        return false;

    }


    static boolean isFull(char[][] board) {

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                if (board[row][column] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }


    //     board
    // 0,0 | 0,1 | 0,2
    // 1,0 | 1,1 | 1,2
    // 2,0 | 2,1 | 2,2

    static char winner(char[][] board) {


        // horizontal

        for (int row = 0; row < board.length; row++) {
            if (board[row][0] != ' ' && board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                return board[row][0];
            }
        }


        // vertical

        for (int column = 0; column < board.length; column++) {
            if (board[0][column] != ' ' && board[0][column] == board[1][column] && board[1][column] == board[2][column]) {
                return board[0][column];
            }
        }


        // diagonal principal

        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }

        // diagonal secundaria

        if (board[2][0] != ' ' && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            return board[2][0];
        }

        return ' ';

    
    
    
   
    
    }
    }
   

