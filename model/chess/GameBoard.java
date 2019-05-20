package model.chess;

import java.awt.Point;

/**
 * Represents a chess gameboard and the chess pieces.
 * @author Kody
 *
 */
public class GameBoard {
	
	
	/*
	 * [0,0] -> [8,a]
	 * [0, 8] -> [8, h]
	 * [8, 0] -> [1, a]
	 * [8,8] -> [1, h]
	 */
	private int[][] board = new int[8][8];
	private GamePiece[] whiteGamePieces;
	private GamePiece[] blackGamePieces;
	
	public GameBoard() {
		this.initializeGameBoardPieces();
	}
	
	/**
	 * Initializes all the gameboard pieces in their proper locations for both the light and dark pieces 
	 */
	private void initializeGameBoardPieces() {
		//Need to create eight pawns for white and black.
		initializePawnsOnRow(1);
	}
	
	/**
	 * Initializes 8 pawns on the given row
	 * @param rowCoord
	 */
	private GamePiece[] initializePawnsOnRow(int rowCoord) {
		GamePiece[] pawnsThatWereInitialized = new GamePiece[8];
		int pawnToAddIndex = 0;
		for (int colIdx = 0; colIdx < 8; colIdx++) {
			Pawn pawnToAdd = new Pawn(new Point(rowCoord, colIdx));
			pawnsThatWereInitialized[pawnToAddIndex] = pawnToAdd;
		}
		return pawnsThatWereInitialized;
	}
}