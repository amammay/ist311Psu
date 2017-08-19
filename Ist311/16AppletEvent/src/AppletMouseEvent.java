import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class AppletMouseEvent extends Applet implements MouseListener
{

	int x, y;
	String event;
	
	
	
	public void init()
	{
		addMouseListener(this);
		
	
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		//g.fillOval(x, y, 50, 50);	
		g.fillRect(x, y, 50, 50);
		
		
		
		
	}
	//MouseListener Methods -- mousePressed, mouseReleased, mouseClicked, mouseEntered, mouseExited
	
	public void mousePressed(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
		
		event = "Pressed";
		repaint();
	}
	public void mouseClicked(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
		
		event = "Clicked";
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		showStatus("Mouse Entered Applet Zone");
		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		showStatus("Mouse Exited Applet Zone");
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
		
		event = "Released";
		repaint();
		
	}
	
	public void update(Graphics g)
	{
		
		paint(g);
		
	}

	
	
	
}
