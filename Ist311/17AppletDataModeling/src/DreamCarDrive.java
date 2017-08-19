import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * 
 */

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class DreamCarDrive extends Applet implements KeyListener
{
		
	DreamCar toyota;
	DreamCar honda;
	
	
	
	public void init()
	{
		
		setSize(500,500);
	
		
		
		
		toyota = new DreamCar("Toyota", (getImage(getDocumentBase(), "toyota.jpg" )) );
		honda = new DreamCar("Honda", (getImage(getDocumentBase(), "honda.jpg" )) );
		
		addKeyListener(this);
		this.requestFocus();
		
	}
	
	public void paint (Graphics g)
	{
		setBackground(Color.WHITE);
		g.drawImage(toyota.getImage(), toyota.getX(), toyota.getY(), this);
		g.drawImage(honda.getImage(), honda.getX(), honda.getY(), this);
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == e.VK_UP)
		{
			toyota.driveUp();
		}
		
		if (e.getKeyCode() == e.VK_DOWN)
		{
			toyota.driveDown();
		}
		
		if (e.getKeyCode() == e.VK_LEFT)
		{
			toyota.driveLeft();
		}
		
		if (e.getKeyCode() == e.VK_RIGHT)
		{
			toyota.driveRight();
		}
		
		if (e.getKeyCode() == e.VK_W)
		{
			honda.driveUp();
		}
		
		if (e.getKeyCode() == e.VK_S)
		{
			honda.driveDown();
		}
		
		if (e.getKeyCode() == e.VK_A)
		{
			honda.driveLeft();
		}
		
		if (e.getKeyCode() == e.VK_D)
		{
			honda.driveRight();
		}
		
		
		
		
		repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
	
		if (e.getKeyCode() == e.VK_UP)
		{
			toyota.driveUp();
		}
		
		if (e.getKeyCode() == e.VK_DOWN)
		{
			toyota.driveDown();
		}
		
		if (e.getKeyCode() == e.VK_LEFT)
		{
			toyota.driveLeft();
		}
		
		if (e.getKeyCode() == e.VK_RIGHT)
		{
			toyota.driveRight();
		}
		
		if (e.getKeyCode() == e.VK_W)
		{
			honda.driveUp();
		}
		
		if (e.getKeyCode() == e.VK_S)
		{
			honda.driveDown();
		}
		
		if (e.getKeyCode() == e.VK_A)
		{
			honda.driveLeft();
		}
		
		if (e.getKeyCode() == e.VK_D)
		{
			honda.driveRight();
		}
		
		
		
		
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
	
		
	}
	
	public void update(Graphics g)
	{
		
		paint(g);
		
	}
	
	

}
