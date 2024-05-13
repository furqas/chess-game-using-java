package gameboard;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if(rows <0 || columns < 0){
            throw new BoardException("Error creating board : cant create a board with 0 rows and columns");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Piece piece(int row,int column){
        if(!PositionExists(row,column)){
            throw new BoardException("That row or column doesnt exists !");
        }
        return pieces[row][column];
    }
    public Piece piece(Position position){
        if(!PositionExists(position)){
            throw new BoardException("That position doesnt exist !");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public int getRow() {
        return rows;
    }

    public int getColumn() {
        return columns;
    }
    public void placePiece(Piece piece, Position position){
        if(thereisAPiece(position)){
            throw new BoardException("There's  already have a piece in that position !" + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
    public boolean thereisAPiece(Position position){
        if(!PositionExists(position)){
            throw new BoardException("That position doesnt exist");
        }
        return piece(position) != null;
    }

    private boolean PositionExists(int row, int column){
        return row >= 0 && rows< row && column >= 0  && column < columns;
    }

    public boolean PositionExists(Position position){
        return PositionExists(position.getRow(), position.getColumn());
    }

}
