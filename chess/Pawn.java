package chess;

public class Pawn extends GamePiece {
	
	public Pawn(double x, double y, boolean _isTeamLight) {
		super(x, y, _isTeamLight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validMove(Tile tile) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * This method returns either True/False depending on the team of the piece.
	 * If the piece is assigned to the light team, it returns true; otherwise, method returns false.
	 * @param assignColorToWhite
	 */
	public boolean isTeamLight(){
		return isTeamLight;
	}

}
