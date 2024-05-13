package chess;

import ChessPieces.King;
import gameboard.Board;
import chess.ChessPosition;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8,8);

    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumn()];
        for(int i=0; i< board.getRow(); i++){
            for(int j=0; j< board.getColumn(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    public void initialSetup() {
        placeNewPiece('a', 2, new King(board, Color.WHITE));
    }

}
