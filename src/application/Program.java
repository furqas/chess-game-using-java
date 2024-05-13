package application;

import chess.ChessMatch;
import gameboard.Board;
import gameboard.Position;

public class Program {

    public static void main(String[] args){
        ChessMatch chessMatch = new ChessMatch();
        Ui.printBoard(chessMatch.getPieces());


    }

}

