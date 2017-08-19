/**
 * 
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;
import java.awt.font.*;
import java.awt.GraphicsEnvironment;




/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class PrinitingFont extends Applet 
{
	int y = 10;
	
	
	public void init()
	{
		setSize(250,600);
	}
	
	public void paint(Graphics g)
	{
	
		String fonts [] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for (int i = 0; i < fonts.length; i++) 
		{
			System.out.println(fonts[i]);
			y = y + 10;
			g.drawString(fonts[i], 20, 600);
		}
	}
	

}
