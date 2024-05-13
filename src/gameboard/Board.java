package gameboard;

public class Board {
    private int row;
    private int column;
    private Piece[][] piece;

    public Board(int row, int column) {
        this.row = row;
        this.column = column;
        piece = new Piece[row][column];
    }

    public Piece piece(int row,int column){
        return piece[row][column];
    }
    public Piece piece(Position position){
        return piece[position.getRow()][position.getColumn()];
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

}
