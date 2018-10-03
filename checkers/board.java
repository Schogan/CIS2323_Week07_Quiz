package checkers;

public class board(){
	private piece[][] board = new piece[8][8];
	
	public void setPiece(piece p, int x, int y){
		board[x][y]=p;
	}
	
	public boolean checkOccupied(int x, int y){
		return(board[x][y] != null);
	}
}
