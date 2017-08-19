import java.applet.*;
import java.awt.*;

/**
 * 
 */

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class FunHouse extends Applet 
{
	//lets get init
	public void init()
	{
		//Set the size of the applet screen
		setSize(350, 300);
		
	}
	
	
	public void paint(Graphics g)
	{
		setBackground(Color.lightGray);
		
		//draw clouds
		g.setColor(Color.white);
		g.fillOval(30, 30, 40, 40);
		g.fillOval(60, 30, 40, 40);
		g.fillOval(80, 30, 40, 40);
		g.fillOval(40, 10, 40, 40);
		g.fillOval(70, 10, 40, 40);
		
		g.fillOval(168, 10, 20, 20);
		g.fillOval(175, 10, 20, 20);		
		g.fillOval(190, 10, 20, 20);
		g.fillOval(170, 20, 20, 20);
		g.fillOval(185, 20, 20, 20);
		
		
		
		
		
		//base code
		//Draw the roof
		
		g.setColor(Color.red);
		int xs[] = {100,160,220};
		int ys[] = {100,50,100};
		Polygon poly = new Polygon(xs, ys, 3);
		g.fillPolygon(poly);
		
		
		//draw the body of the house
		g.setColor(Color.blue);
		g.fillRect(100, 100, 120, 120);
		
		
		//draw the door
		g.setColor(Color.white);
		g.fillRect(145, 160, 30, 60);
		
		//draw the sun
		g.setColor(Color.orange);
		g.fillOval(240, 30, 50, 50);
		
		//more clouds
		g.setColor(Color.white);
		g.fillOval(260, 50, 30, 30);
		g.fillOval(280, 50, 30, 30);
		g.fillOval(300, 50, 30, 30);
		g.fillOval(270, 40, 30, 30);
		g.fillOval(290, 40, 30, 50);
		
		//chimmeny
		g.setColor(Color.black);
		g.fillRect(120, 55, 10, 30);
		
		
		//work on the door
		g.setColor(Color.black);
		g.fillRect(145, 160, 30, 60);
		g.setColor(Color.magenta);
		g.fillPolygon(poly);
		
		//draw window 1
		g.setColor(Color.white);
		g.fillRect(115, 125, 25, 25);
		
		//draw window 1 corssbar
		g.setColor(Color.black);
		g.drawLine(115, 137, 140, 137);
		g.drawLine(127, 125, 127, 150);

		//draw window 2
		g.setColor(Color.white);
		g.fillRect(180, 125, 25, 25);
		
		//draw window 2 corssbar
		g.setColor(Color.black);
		g.drawLine(180, 137, 205, 137);
		g.drawLine(192, 125, 192, 150);
		
		//drawgrass
		g.setColor(Color.green);
		g.fillRect(0, 200, 340, 40);
		
		//drawtree
		g.setColor(Color.gray);
		g.fillRect(28, 100, 20, 100);
		//drawtree
		g.setColor(Color.green);
		g.fillOval(0, 40, 80, 80);
		
		//human
		g.setColor(Color.black);
		g.drawString("My Fun House", 200, 230);
		
		
		
		
		
		
		
	}
	
	
	public void start()
	{
		
	}
	
	
	public void stop()
	{
		
	}
	
	
	public void destroy()
	{
		
	}
	
	
}
