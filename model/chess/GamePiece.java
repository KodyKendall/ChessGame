package model.chess;

import java.awt.Point;

import model.chess.Exceptions.GamePieceOutOfBoundsException;

public class GamePiece {
	private Point coordinate;
	
	public GamePiece(Point coordinate) {
		this.coordinate = coordinate;
	}
	
	/**
	 * Get the coordinate this game piece is at.
	 * @return
	 */
	public Point getCoordinate() {
		return this.coordinate;
	}
	
	/**
	 * Set the coordinate for this game piece. 
	 * Throws an exception is you attempt to set a coordinate less than 0,0 or greater than 15,15
	 * @param newCoordinate
	 */
	public void setCoordinate(Point newCoordinate) throws GamePieceOutOfBoundsException {
		if (newCoordinate.getX() > 15 || newCoordinate.getX() < 0 || newCoordinate.getY() > 15 || newCoordinate.getY() < 0) {
			throw new GamePieceOutOfBoundsException();
		}
		
		this.coordinate = newCoordinate;		
	}
}
