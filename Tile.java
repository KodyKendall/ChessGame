package chess;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tile extends ImagePanel{
	
	public Tile(BufferedImage img) {
		super(img);
		// TODO Auto-generated constructor stub
	}

	private boolean dark;
	
	public void colorTile(){
		if (dark){
			setBackground(Color.darkGray);
		}
		else {
			setBackground(Color.lightGray);
		}
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
