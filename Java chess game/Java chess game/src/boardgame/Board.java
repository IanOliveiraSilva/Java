package boardgame;

public class Board {
	
//class//	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	

//constructor//
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1 ) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 columns");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	
//gets and sets//
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}


//methods//
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (theresIsAPiece(position)) {
		throw new BoardException("There is already a piece on position" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece ;
		piece.position = position;
	}	
	
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
		    throw new BoardException("Position not on the board");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean theresIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
	
	
}
	

