package Problems.TicTacToe;

import java.util.ArrayList;
import java.util.List;
import Problems.TicTacToe.Pair;

public class Board {
    int size;
    public PlayingPiece[][]board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public  boolean addPiece(int i, int j, PlayingPiece playingPiece){
        if(board[i][j]!=null || (i>=size || j>=size) || (i<0 || j<0)) {
            return false;
        }

        board[i][j] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeSpace(){
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                 if(board[i][j]==null){
                     Pair<Integer, Integer> rowCol = new Pair<>(i,j);
                     freeCells.add(rowCol);
                 }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name());
                } else {
                    System.out.print("   ");   // empty cell
                }
                if (j != size - 1) {
                    System.out.print(" | ");   // column separator
                }
            }
            System.out.println();   // move to next row
        }
        System.out.println();
    }

}
