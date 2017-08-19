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
public class AppletMouseKeyboardGame extends Applet implements KeyListener
{
	
	int x = 200;
	int y = 200;
	
	
	
	
	

	public void init()
	{
		
		
		this.requestFocus();


		setSize(500,500);
		
		addKeyListener(this);
	
		
		
		
		
	}
	
	public void paint (Graphics g)
	{
	
		//TODO List
		g.setColor(Color.GREEN);
		g.drawRect(20, 20, 340, 340);
		g.setColor(Color.RED  );
		g.fillRect(x, y, 20, 20);
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) 
	{

		
		if(e.getKeyCode() == e.VK_UP)
		{
			if (y>20)
			{
				y= y- 10;
				
			}
			
		}
		
		if(e.getKeyCode() == e.VK_DOWN)
		{
			if (y<340)
			{
				y = y+10;
				
			}
			
		}
		
		if(e.getKeyCode() == e.VK_LEFT)
		{
			if (x>20)
			{
				x= x-10;
				
			}
			
		}
		
		if(e.getKeyCode() == e.VK_RIGHT)
		{
			if (x<340)
			{
				x= x+10;
				
			}
			
		}
		
		
		
//		if(e.getKeyCode() == e.VK_W)
//		{
//			y--;
//			
//		}
//		if(e.getKeyCode() == e.VK_A)
//		{
//			x--;
//			
//		}
//		
//		
//		if(e.getKeyCode() == e.VK_D)
//		{
//			x++;
//			
//		}
//		if(e.getKeyCode() == e.VK_S)
//		{
//			y++;
//			
//		}
	
		repaint();
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		
				
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		
	
		
	}
	
	
}
