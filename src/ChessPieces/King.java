package ChessPieces;

import chess.ChessPiece;
import chess.Color;
import gameboard.Board;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "K";
    }
}
