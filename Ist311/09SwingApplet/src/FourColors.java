/**
 * 
 */
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class FourColors extends MouseMotionAdapter
{
	private Container [] quadrants;
	private int width, height;
	Color MidnightBlue;
	Color Custom1;
	
	
	public FourColors(Container [] q, int w, int h)
	{
		quadrants = q;
		width = w;
		height = h;
		MidnightBlue = new Color(0, 51, 102);
		Custom1 = new Color(20,80,100);
		
		
			
	}

	public void mouseMoved(MouseEvent m)
	{
		int x = m.getX();
		int y = m.getY();
		int current = 0;
		
		if (x < width / 2 && y < height / 2)
		{
			//first quadrant
			quadrants[0].setBackground(MidnightBlue);
			current = 0;
			
		}
		else if (x > width / 2 && y < height / 2)
		{
			//first quadrant
			quadrants[1].setBackground(Custom1);
			current = 1;
			
		}
		else if (x < width / 2 && y > height / 2)
		{
			//first quadrant
			quadrants[2].setBackground(Color.BLUE);
			current = 2;
			
		}
		else if (x >width / 2 && y > height / 2)
		{
			//first quadrant
			quadrants[3].setBackground(Color.YELLOW);
			current = 3;
			
		}
		
		
		for (int i = 0; i < quadrants.length; i++) 
		{
			if (i != current)
			{
			quadrants[i].setBackground(Color.WHITE);
			
			}
			
		}
		
	}
	
}
