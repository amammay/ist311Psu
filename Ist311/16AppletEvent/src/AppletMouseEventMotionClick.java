import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class AppletMouseEventMotionClick extends Applet implements MouseListener
{

	int xAxis, yAxis;
	String event;
	
	
	
	public void init()
	{
		addMouseListener(this);
		
	
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.drawRect(50, 50, 100, 100);
		
		
		if (xAxis > 50 && xAxis < 150 && yAxis > 50 && yAxis < 150) 
		{
			g.setColor(Color.green);
			g.fillRect(50, 50, 100, 100);
			
			
		}
		else
		{
			g.setColor(Color.red);
			g.fillRect(50, 50, 100, 100);
			
		}
		
		
		
	}
	//MouseListener Methods -- mousePressed, mouseReleased, mouseClicked, mouseEntered, mouseExited
	
	public void mousePressed(MouseEvent e)
	{
		xAxis = e.getX();
		yAxis = e.getY();
		
		event = "Pressed";
		
		repaint();
	}
	
	@Override
	public void mouseReleased(MouseEvent e)
	{
		
		
		
	}
	
	public void mouseClicked(MouseEvent e)
	{
		
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		
		
		
	}



	
	
	
}
