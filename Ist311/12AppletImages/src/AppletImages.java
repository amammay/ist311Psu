/**
 * 
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class AppletImages extends Applet
{

	Image sunFlower;
	
	
	
	
	public void init()
	{
	
		setSize(500,600);
		
		sunFlower = getImage(getDocumentBase(), "sunflower.jpg");
		
		
		
		
		
	}
	
	public void paint (Graphics g)
	{
		//g.drawImage(sunFlower, 20, 20, this);
		
		//image manipulation
		int width;
		int height;
		width = sunFlower.getWidth(this);
		height = sunFlower.getHeight(this);
		
		g.drawImage(sunFlower, 20, 20, width/2, height /2, this);
		
		
	}
	
}
