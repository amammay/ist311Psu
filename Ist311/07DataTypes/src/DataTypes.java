import java.applet.*;
import java.awt.*;
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
public class DataTypes extends Applet
{
	//variables
	int x = 30;
//	int y = 4;
//  int sum = 0;
	float a = 50;
	double b = 80.3;
	float outcome1 = 0;
	float outcome2 = 0;
	float outcome3 = 0;
	float outcome4 = 0;
	
	
	
	
	
	public void init()
	{
		//Set the size of the applet screen
		setSize(350, 300);
	}
	
	public void paint(Graphics g)
	{
		//sum = x+y;
		//math
		outcome1 = (float) (a * b);
		outcome2 = (float) (a/b);
		outcome3 = (float) (a+b);
		outcome4 = (float) (x/a);

		//print outs
		g.drawString("The Product a*b: " + outcome1, 20, 20);
		g.drawString("Division of a/b: " + outcome2, 20, 30);
		g.drawString("The sum of a+b: " + outcome3, 20, 40);
		g.drawString("Division of x /a: " + outcome4, 20, 50);
	}
	
	
}
