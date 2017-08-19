/**
 * 
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class LovePoem extends Applet 
{
	
	AudioClip slideFlute;
	Image roses;
	Color customRed;
	Font customFont;
	Font bigFont;
	
	
	
	
	public void init()
	{
		setSize(900,800);
		
		slideFlute = getAudioClip(getDocumentBase(), "slideflute.wav");
		roses = getImage(getDocumentBase(),"roses.jpg");
		
		slideFlute.loop();
		
		
		//set some fonts
		customFont = new Font("SanSerif", Font.ITALIC,15);
		bigFont = new Font("SanSerif", Font.ITALIC,80);
		customRed = new Color(215,41,41);
		
		
	}
	
	public void paint(Graphics g)
	{
		int width;
		int height;
		String poem;
		String poemHeader;
		
		//Initialize the strings
		poemHeader = "Love";
		poem = "There are some things that you will endure Faith, Hope, and The greatest of all is LOVE -Hallmark Card";
		
		
		width = roses.getWidth(this);
		height = roses.getHeight(this);
		//draw the image out
		g.drawImage(roses, 20, 20, width /2, height /2, this);
		
		//set the color and the font to big font
		g.setColor(customRed);
		g.setFont(bigFont);
		//draw out the header
		g.drawString(poemHeader, 300, 60);
		
		//set the font to the smaller font
		g.setFont(customFont);
		//draw out the poem
		g.drawString(poem, 50, 100);
		
		
	}
	
	
	
	
	
}
