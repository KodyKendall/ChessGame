package chess;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public abstract class GamePiece{
	private Point2D.Double location;
	private ArrayList<BufferedImage> sprite;
	private boolean selectedPiece;
	protected boolean isTeamLight;
	
	public GamePiece(double x, double y, boolean _isTeamLight){
		location = new Point2D.Double(x, y);
		isTeamLight = _isTeamLight;
	}
	
	/**
	 * Method checks if the Tile selected for movement is a legal chess move
	 * @param tile
	 * @return boolean true/false
	 */
	public abstract boolean validMove(Tile tile);
	
	/**
	 * Method 'selects' piece and adds a border around it.
	 */
	public void selectPiece(){
//		addBorder(sprite);
//		selectedPiece = true;
	}
	
	/**
	 * Method is supposed to add a border around the piece, so that the use knows it's selected. 
	 * @param oldImage
	 * @return
	 */
	public BufferedImage addBorder(BufferedImage oldImage){
		return null;
	}
	
	public void loadSprite(String fileName){
		sprite = new ArrayList<BufferedImage>();
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sprite.add(img);
	}
	
	/**
	 * returns pieces XY location
	 * @return
	 */
	public Double getLocation(){
		return location;
	}
	
	
	
}
