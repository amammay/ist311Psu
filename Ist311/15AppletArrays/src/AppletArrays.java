/**
 * 
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class AppletArrays extends Applet
{

	String [] bookList;
	
	
	public void init()
	{
		
		//Rember to declare the array size before using it
		bookList = new String[6];
		bookList[0] = "Aaron";
		bookList[1] = "David";
		bookList[2] = "Nico";
		bookList[3] = "Christy";
		bookList[4] = "Alex";
		bookList[5] = "Garret";
		
		
	}
	
	public void paint(Graphics g)
	{
		int yPos = 20;
		
		for (int i = 0; i < bookList.length; i++) 
		{
			//printing downward
			//g.drawString(bookList[i], 20, yPos);
			
			//print index
			g.drawString("" + i + "" + bookList[i],20, yPos);
			yPos = yPos + 20;
		}
		
		
	}
	
}
