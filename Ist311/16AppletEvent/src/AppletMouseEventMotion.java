import java.applet.*;
import java.awt.*;
import java.awt.event.*;



public class AppletMouseEventMotion extends Applet implements MouseListener, MouseMotionListener
{

	
	int x, y;
	String event;
	
	public void init()
	{
		setSize(500,500);
		addMouseListener(this);
		//Listen to motion of the mouse
		addMouseMotionListener(this);
		
	}
	
	public void paint (Graphics g)
	{
		g.setColor(Color.BLACK);
		//g.filloval(x, y, 20, 20);
		g.fillRect(x, y, 50, 50);
	}
	
	

	
	
	//mouse listener
	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		//this.setBackground(Color.PINK);
		x = e.getX();
		y = e.getY();
		event = "Clicked";
		System.out.println(event);
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
	public void mousePressed(MouseEvent e)
	{
		//this.setBackground(Color.DARK_GRAY);
		x = e.getX();
		y = e.getY();
		event = "Pressed";
		System.out.println(event);
		repaint();
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		//this.setBackground(Color.CYAN);
		x = e.getX();
		y = e.getY();
		event = "Released";
		System.out.println(event);
		repaint();
		
	}
	//end mouse listener
	
	//mouse motion listener

	@Override
	public void mouseDragged(MouseEvent e) 
	{
		this.setBackground(Color.RED);
		x = e.getX();
		y = e.getY();
		event = "Dragged";
		System.out.println(event);
		repaint();
		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		
		this.setBackground(Color.BLUE);
		
		x = e.getX();
		y = e.getY();
		event = "Moved";
		System.out.println(event);
		repaint();
		
		
	}
	//end mouse motion listener
	
	public void update(Graphics g)
	{
		paint(g);
	}
	

}
