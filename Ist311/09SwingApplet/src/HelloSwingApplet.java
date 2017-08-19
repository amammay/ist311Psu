/**
 * 
 */


import java.applet.*;
import java.awt.*;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class HelloSwingApplet extends JApplet
{
	
	public void init()
	{
		setSize(500,500);
		
		java.awt.Container contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(4, 4));
		JPanel [] quadrants = new JPanel[8];
		
		for (int i = 0; i < quadrants.length; i++) 
		{
			quadrants[i] = new JPanel();
			contentPane.add(quadrants[i]);
			
		}
		
		FourColors listener = new FourColors(quadrants, this.getWidth(), this.getHeight());
		
		
		this.addMouseMotionListener(listener);
		
	}
	
	
	
	
}
