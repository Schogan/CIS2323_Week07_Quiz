package checkers;

public class Board{
	private Piece[][] board = new Piece[8][8];
	
	public void setPiece(Piece p, int x, int y){
		board[x][y]=p;
	}
	
	public boolean checkOccupied(int x, int y){
		return(board[x][y] != null);
	}
	
	public Color checkColor(int x, int y){
		return board[x][y].getColor();
	}
}
