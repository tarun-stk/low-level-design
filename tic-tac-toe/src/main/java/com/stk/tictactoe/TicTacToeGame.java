package com.stk.tictactoe;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Board board = new Board();
        board.setSize(3);
        board.setPieceTypes(new PlayerPieceType[board.getSize()][board.getSize()]);

        startGame(board);

    }

    private static void startGame(Board board) {
        Deque<Player> players = new ArrayDeque<>();
        initializeGameData(players);
        boolean isWinnerFound = false;
        int count = 0;

        while(count < board.getSize()* board.getSize() && !isWinnerFound){
            Player tempPlayer = players.removeFirst();

            displayBoard(board);
            System.out.println(tempPlayer.getName() + ", please enter your input");
            Scanner scanner = new Scanner(System.in);
            String playerInput = scanner.nextLine();
            if(!extractAndFillTheBoard(playerInput, board, tempPlayer)){
                System.out.println("Invalid input!!");
                continue;
            }
            isWinnerFound = isAHit(playerInput, board, tempPlayer);
            if(isWinnerFound){
                System.out.println(tempPlayer.getName() + " has won the game!!!");
                displayBoard(board);
                return;
            }
            count ++;
            players.addLast(tempPlayer);
        }
        System.out.println("No winner, game tied!!");
        displayBoard(board);
    }

    private static boolean isAHit(String playerInput, Board board, Player tempPlayer) {
        int[] mat = extractPlayerInput(playerInput);
        int row = mat[0];
        int col = mat[1];
        PlayerPieceType playerPieceType = tempPlayer.getPlayerPieceType();
        int count = 0;
        /*in row*/
        for(int i = 0; i < board.getSize(); i ++){
            if(board.getPieceTypes()[i][col] == playerPieceType){
                count ++;
            }
        }
        if(count == board.getSize()){
            return true;
        }
        /*in col*/
        count = 0;
        for(int i = 0; i < board.getSize(); i ++){
            if(board.getPieceTypes()[row][i] == playerPieceType){
                count ++;
            }
        }
        if(count == board.getSize()){
            return true;
        }

        /*In diagonals*/
        count = 0;
        for(int i = 0, j = 0; i < board.getSize(); i ++, j ++){
            if(board.getPieceTypes()[i][j] == playerPieceType){
                count ++;
            }
        }
        if(count == board.getSize()){
            return true;
        }

        count = 0;
        for(int i = 0, j = board.getSize()-1; i < board.getSize(); i ++, j --){
            if(board.getPieceTypes()[i][j] == playerPieceType){
                count ++;
            }
        }
        if(count == board.getSize()){
            return true;
        }

        return false;

    }

    private static boolean extractAndFillTheBoard(String playerInput, Board board, Player tempPlayer) {
        int[] mat = extractPlayerInput(playerInput);
        int row = mat[0];
        int col = mat[1];
        if(row < 0 || col < 0 || row >= board.getSize() || col >= board.getSize())
            return false;
        if(board.getPieceTypes()[row][col] == null){
            board.getPieceTypes()[row][col] = tempPlayer.getPlayerPieceType();
            return true;
        }
        return false;
    }

    private static int[] extractPlayerInput(String playerInput){
        String[] input = playerInput.split(",");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        return new int[]{row, col};
    }


    private static void displayBoard(Board board) {
        int n = board.getSize();
        for(int i = 0; i < n;i  ++){
            for(int j = 0; j < n; j ++){
                System.out.print((board.getPieceTypes()[i][j] != null? board.getPieceTypes()[i][j].toString(): " ") + " | ");
            }
            System.out.println();
        }
    }

    private static void initializeGameData(Deque<Player> players) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of player1: ");
        Player player1 = new Player();
        player1.setName(scanner.nextLine());
        player1.setPlayerPieceType(PlayerPieceType.X);
        System.out.println("Please enter the name of player2: ");
        Player player2 = new Player();
        player2.setName(scanner.nextLine());
        player2.setPlayerPieceType(PlayerPieceType.O);
        System.out.println(player1.getName() + " piece type is X, and" + player2.getName() + " piece type is O");
        System.out.println("Please start the game: ");
        players.addAll(Arrays.asList(player1, player2));
    }
}

/*sample log:

* Please enter the name of player1:
Tarun
Please enter the name of player2:
Varun
Player1 piece type is X, and player2 piece type is O
Please start the game:
  |   |   |
  |   |   |
  |   |   |
Tarun, please enter your input
0,1
  | X |   |
  |   |   |
  |   |   |
Varun, please enter your input
0,2
  | X | O |
  |   |   |
  |   |   |
Tarun, please enter your input
2,1
  | X | O |
  |   |   |
  | X |   |
Varun, please enter your input
1,1
  | X | O |
  | O |   |
  | X |   |
Tarun, please enter your input
0,0
X | X | O |
  | O |   |
  | X |   |
Varun, please enter your input
2,0
Varun has won the game!!!
X | X | O |
  | O |   |
O | X |   | */
