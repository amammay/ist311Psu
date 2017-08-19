import java.applet.*;
import java.awt.*;

/**
 * 
 */

/**
 * @author mamma
 *
 */
public class MyFirstDrawing extends Applet 
{
	
	
	//provide init method
	public void init()
	{
		
	}
	
	//provide paint method
	public void paint(Graphics g)
	{
		//g.setColor(Color.blue);
		//g.fillRect(20, 20, 100, 50);
		g.drawRect(20, 20, 100, 50);
		
		g.setColor(Color.red);
		g.fillOval(50, 70, 100, 70);
		
	}
	
	//provide start method	
	public void start()
	{
		
	}
	
	//provide stop method
	public void stop()
	{
		
	}
	
	//provide destory method
	public void destory()
	{
		
	}
	
	
}
