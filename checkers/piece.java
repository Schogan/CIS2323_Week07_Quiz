package checkers;

public class piece{
	//Class Attributes
	enum Color{RED,BLACK}
	private static int numberOfPieces=0;
	
	//Instance Attributes
	private Color color;
	private int id;
	
	public piece(){
		id=numberOfPieces;
		numberOfPieces++;
	}
	
	public void set(Color c){
		color=c;
	}
	
	public int pieceCount(){
		return numberOfPieces;
	}
}