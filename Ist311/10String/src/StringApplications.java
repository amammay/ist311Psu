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
public class StringApplications extends Applet
{

	String name = "Pennsylvania State University";
	//String is the only object that can be instantiated and initialized as a field
	//Also, the string object does not use new keyword plus class name
	
	
	
	
	public void init()
	{
		
		setSize(400,300);
		
	}
	
	public void paint (Graphics g)
	{
		//Part 1
		g.drawString("The Name of my school is " + name, 20, 20);
		
		//Part 2
				
		g.drawString("The Name of my school is " + name.toUpperCase(), 20, 40);
		
		
		//part 3
		
		g.drawString("The Name of my school is " + name.toLowerCase(), 20, 60);
		
		//part4
		//index is zero and spaces are counted
		//not neccessary could just do name.lenght() if you are only returning as a string
		int length = name.length();
		g.drawString("The Name of my school is " + length, 20, 80);
		
		
		//part5
		g.drawString("The index of i is " + name.indexOf('i'), 20, 100);
		
		//part6
		g.drawString("The index of state is " + name.indexOf("State"), 20, 120);
		
		
		
		
	}
	
	
	
}
