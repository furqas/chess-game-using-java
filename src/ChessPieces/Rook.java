package ChessPieces;

import chess.ChessPiece;
import chess.Color;
import gameboard.Board;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "R";
    }
}
