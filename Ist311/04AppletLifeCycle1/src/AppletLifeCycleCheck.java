import java.applet.*;
import java.awt.*;


/**
 * @author mamma
 *
 */
public class AppletLifeCycleCheck extends Applet 
{

	private int counter;
	
	public void init()
	{
		System.out.println("Inside init...");
		counter = 0;
		
		
	}
	
	public void start()
	{
		System.out.println("Inside start...");
	}
	
	public void stop()
	{
		System.out.println("Inside stop...");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy...");
	}
	
	public void paint(Graphics g)
	{
		//increase counter
		counter++;
		System.out.println("Inside paint, counter = " + counter);
		
		this.setBackground(Color.YELLOW);
		
		//x is to right, y is down from top
		g.drawString("Counter = " + counter, 60, 100);
		
		
		
//		if (counter >= 3) {
//			this.setBackground(Color.YELLOW);
//			
//		}
//		
//		if (counter >= 80) {
//			this.setBackground(Color.BLACK);
//		}
//		

		
		
		
		
		
	}
	
	
	
	
	
	
}
