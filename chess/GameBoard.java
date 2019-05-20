package chess;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GameBoard extends JFrame implements ActionListener {
	
	private BufferedImage blackTile;
	private BufferedImage grayTile;
	private ArrayList<GamePiece> whitePieces;
	private ArrayList<GamePiece> darkPieces;	
	
	public GameBoard(){
		//Initialize the variables:
		whitePieces = new ArrayList<GamePiece>();
		
		
		blackTile = assignTile(new File("img/blacktile.png"));
		grayTile = assignTile(new File("img/graytile.png"));
		
		buildGameboard();		
	}
	
	public void buildGameboard(){		
		
		
		JPanel main = new JPanel();
		setResizable(false);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1000, 1000));
		main.setLayout(new GridLayout(8,8));
		
		add(main);
		
		//These variables are used to alternate the board's color
		//Count is needed because every 8, you must repeat a color. 
		boolean white = true;
		int count = 0;
		
		for (int i = 0; i < 64; i++){
			if (white){
				count++;
				JButton a = new JButton("A");
				Tile blackT = new Tile(blackTile);
				main.add(blackT);
				if (!(count%8 == 0)){
					white = false; 
				}
				
			}
			else{
				count++;
				JButton b = new JButton("B");
				Tile grayT = new Tile(grayTile);
				main.add(grayT);
				if (!(count%8 == 0)){
					white = true;
				}
			}
		}
		
		addStartingPieces();
		
		pack();
	}
	
	/**
	 * This method is called within the buildGameboard method, where it fills and places each individual
	 * starting piece on the gameboard, adding the white pieces to the 'whitePieces' ArrayList
	 * and the black pieces to the 'blackPieces' ArrayList.  
	 */
	public void addStartingPieces(){
			
			//Loop for pawns:
			for (int j = 0; j < 8; j++){
				Pawn p = new Pawn(7, j+1, true);
				whitePieces.add(p);
			}
			//Creating and adding white rooks:
			Rook r = new Rook(8, 1, true);
			Rook r2 = new Rook(8, 8, true);
			whitePieces.add(r);
			whitePieces.add(r2);
			r = null;
			r2 = null;
			
			//Creating and adding white Knights:
			Knight k = new Knight(8, 2, true);
			Knight k2 = new Knight(8, 7, true);
			whitePieces.add(k);
			whitePieces.add(k2);
			k = null;
			k2 = null;
			
			//Creating and adding white bishops:
			Bishop b = new Bishop(8, 3, true);
			Bishop b2 = new Bishop(8, 6, true);
			whitePieces.add(b);
			whitePieces.add(b2);
			b = null;
			b2 = null;
			
			//Creating and adding white queen:
			Queen q = new Queen(8, 5, true);
			whitePieces.add(q);
			q = null;
			
			//Creating and adding white king:
			King king = new King(8, 4, true);
			whitePieces.add(king);
			king = null;
			
		
	}
	
//	private void add(GridLayout tiles) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public BufferedImage assignTile(File image){
		
		BufferedImage tile = null;
		try {
			tile = ImageIO.read(image);
		}catch(IOException e){
			System.out.println("Image not found. Exiting");
			System.exit(0);
		}
		
		return tile;
	}


}
