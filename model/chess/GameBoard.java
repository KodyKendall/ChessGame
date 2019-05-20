package model.chess;

import java.awt.Point;
import java.util.ArrayList;

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
	private ArrayList<GamePiece> whiteGamePieces;
	private ArrayList<GamePiece> blackGamePieces;
	
	public GameBoard() {
		this.whiteGamePieces = new ArrayList<GamePiece>();
		this.blackGamePieces = new ArrayList<GamePiece>();
		this.initializeGameBoardPieces();
	}
	
	/**
	 * Initializes all the gameboard pieces in their proper locations for both the light and dark pieces 
	 */
	private void initializeGameBoardPieces() {
		//Need to create eight pawns for white and black.
		
		//initialize all pawns first. 
		this.blackGamePieces.addAll(this.initializePawnsOnRow(1));
		this.whiteGamePieces.addAll(this.initializePawnsOnRow(14));
	
		//initialize rooks
		this.blackGamePieces.addAll(this.initializeRooksOnRow(0));
		this.whiteGamePieces.addAll(this.initializeRooksOnRow(15));
		
		//initialize horses
		this.blackGamePieces.addAll(this.initializeHorsesOnRow(0));
		this.whiteGamePieces.addAll(this.initializeHorsesOnRow(15));
		
		//initialize bishops
		this.blackGamePieces.addAll(this.initializeBishopsOnRow(0));
		this.whiteGamePieces.addAll(this.initializeBishopsOnRow(15));
		
		//initialize queens
		this.blackGamePieces.addAll(this.initializeQueenOnRow(0));
		this.whiteGamePieces.addAll(this.initializeQueenOnRow(15));
		
		//initialize kings
		this.blackGamePieces.addAll(this.initializeKingOnRow(0));
		this.whiteGamePieces.addAll(this.initializeKingOnRow(15));
	}
	
	/**
	 * Initializes 8 pawns on the given row
	 * @param rowCoord
	 */
	private ArrayList<Pawn> initializePawnsOnRow(int rowCoord) {
		ArrayList<Pawn> pawnsThatWereInitialized = new ArrayList<Pawn>();		
		for (int colIdx = 0; colIdx < 8; colIdx++) {
			Pawn pawnToAdd = new Pawn(new Point(rowCoord, colIdx));
			pawnsThatWereInitialized.add(pawnToAdd);
		}
		return pawnsThatWereInitialized;
	}
	
	/**
	* Initializes the Rooks on the given row for the start of a chess game.
	*/
	private ArrayList<Rook> initializeRooksOnRow(int row){
		ArrayList<Rook> piecesInitialized = new ArrayList<>();
		//TODO:
		return piecesInitialized;
	}	
	
	/**
	* Initializes the Horses on the given row for the start of a chess game.
	*/
	private ArrayList<Horse> initializeHorsesOnRow(int row){
		ArrayList<Horse> piecesInitialized = new ArrayList<>();
		//TODO:
		return piecesInitialized;
	}	
	
	/**
	* Initializes the Bishops on the given row for the start of a chess game.
	*/
	private ArrayList<Bishop> initializeBishopsOnRow(int row){
		ArrayList<Bishop> piecesInitialized = new ArrayList<>();
		//TODO:
		return piecesInitialized;
	}	
	
	/**
	* Initializes the Queen on the given row for the start of a chess game.
	*/
	private ArrayList<Queen> initializeQueenOnRow(int row){
		ArrayList<Queen> piecesInitialized = new ArrayList<>();
		//TODO:
		return piecesInitialized;
	}	
	
	/**
	* Initializes the King on the given row for the start of a chess game.
	*/
	private ArrayList<King> initializeKingOnRow(int row){
		ArrayList<King> piecesInitialized = new ArrayList<>();
		//TODO:
		return piecesInitialized;
	}		
}