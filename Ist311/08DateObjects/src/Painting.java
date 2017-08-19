/**
 * 
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class Painting extends Applet
{

	//instantiation of variables
	Color midNightBlue;
	Font lazyFont;
	Font boldAndItalic;
	
	
	
	public void init()
	{
		setSize(500,500);
		midNightBlue = new Color(0, 51 , 102);
		lazyFont = new Font("SanSerif", Font.ITALIC, 20);
	    boldAndItalic = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 35);
	    

		
		
		
	}
	
	public void paint (Graphics g)
	{
		g.setColor(midNightBlue);
		g.drawRect(20, 20, 50, 50);
		
		g.fillRect(40, 40, 50, 50);
		
		g.drawString("Love My schol color", 20,110);
		
		g.setFont(lazyFont);
		g.drawString("My Graduation is near", 20, 130);
		
		g.setFont(boldAndItalic);
		g.drawString("Testing bold and Italics", 20, 160);
		
		//Google Java Font list for more font options
		
	}
	
}
