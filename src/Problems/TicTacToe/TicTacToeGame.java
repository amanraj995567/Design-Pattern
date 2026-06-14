package Problems.TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Players> players;
    Board gameBoard;

    TicTacToeGame(){
        initializeGame();
    }


    public void initializeGame(){
         // create 2 players
        players = new LinkedList<>();
        PlayingPieceX crossType = new PlayingPieceX();
        Players players1 = new Players("Player1", crossType);

        PlayingPieceO zeroType = new PlayingPieceO();
        Players players2 = new Players("Player2", zeroType);

        players.add(players1);
        players.add(players2);

        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner) {
            //take out a player having its turn and put it in back
            Players playerTurn = players.removeFirst();
            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeSpace();
            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            // read the user input
            System.out.println("Player:" + playerTurn.name + "Enter row , column:");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);


            //place the piece

            boolean pieceAddedSuccessfully =  gameBoard.addPiece(inputRow, inputColumn, playerTurn.playingPiece);

            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position chosen:" + "try again");
                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);


            boolean winner = isThereAnyWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);

            if(winner){
                return playerTurn.name;
            }


        }
        return "tie";
    }



    // can be optimised using algorithm of N-queen problem in O(1)
    public boolean isThereAnyWinner(int row, int column, PieceType pieceType) {
        int size = gameBoard.size;
        PlayingPiece[][] board = gameBoard.board;

        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // check the whole ROW of the placed piece
        for (int j = 0; j < size; j++) {
            if (board[row][j] == null || board[row][j].pieceType != pieceType) {
                rowMatch = false;
                break;
            }
        }

        // check the whole COLUMN of the placed piece
        for (int i = 0; i < size; i++) {
            if (board[i][column] == null || board[i][column].pieceType != pieceType) {
                colMatch = false;
                break;
            }
        }

        // check the main DIAGONAL (top-left to bottom-right)
        for (int i = 0; i < size; i++) {
            if (board[i][i] == null || board[i][i].pieceType != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        // check the ANTI-DIAGONAL (top-right to bottom-left)
        for (int i = 0; i < size; i++) {
            if (board[i][size - 1 - i] == null || board[i][size - 1 - i].pieceType != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }






}
