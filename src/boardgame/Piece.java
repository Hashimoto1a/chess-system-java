package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null; //não precisa escrever isso
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
