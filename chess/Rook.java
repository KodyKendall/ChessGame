package chess;

public class Rook extends GamePiece {

	public Rook(double x, double y, boolean _isTeamLight) {
		super(x, y, _isTeamLight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validMove(Tile tile) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean isTeamLight(){
		return isTeamLight;
	}

}
