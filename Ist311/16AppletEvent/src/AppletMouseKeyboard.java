/**
 * 
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class AppletMouseKeyboard extends Applet implements KeyListener
{
	
	
	int number = 0;
	char keyboard = ' ';
	String string1 = " ", string2 = " ", string3 = " ", string4 = " ";
	String capsOn = " ";
	
	

	public void init()
	{
		
		
		this.requestFocus();


		setSize(500,500);
		
		addKeyListener(this);
	
		
		
		
		
	}
	
	public void paint (Graphics g)
	{
		
		
		g.drawString("number of key pressed is: "+ number, 20, 20);
		g.drawString("The Character pressed is: " + keyboard, 20, 40);
		g.drawString("Key Pressed is: " +string1, 20, 60);
		g.drawString("Key Released is: " +string4, 20, 80);
		g.drawString("Action Key pressed is: " +string2, 20, 100);
		g.drawString("Caps Lock: " +capsOn, 20, 120);
		g.drawString(string3,20, 140);
		
		g.setColor(Color.black);
		
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) 
	{
		
		number++;
		string1 = e.getKeyText(e.getKeyCode());
		
		
		if (e.getKeyCode() ==  e.VK_UP)
		{
			string2 = "Up Key";
		}

		if (e.getKeyCode() ==  e.VK_ENTER)
		{
			string2 = "EnterKey";
		}

		if (e.getKeyCode() ==  e.VK_CAPS_LOCK)
		{
			capsOn = "On";
		}
		
	
		
		
		System.out.println(capsOn);
		System.out.println(string2);
		System.out.println(keyboard);
		System.out.println(string1);
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		
		string4 = e.getKeyText(e.getKeyCode());
		repaint();
		
				
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		
		keyboard = e.getKeyChar();
		
		if(keyboard == 'x' )
		{
			string3 = "The key lower case x was pressed";
			
		}
		repaint();
		
	}
	
	
}
