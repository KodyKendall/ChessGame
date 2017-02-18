package chess;

public class Bishop extends GamePiece {

	public Bishop(double x, double y, boolean _isTeamLight) {
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
