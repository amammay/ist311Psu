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
public class AppletSound extends Applet implements ActionListener
{

	AudioClip guitar;
	Button play, loop, stop;
	
	public void init()
	{
		
		guitar = getAudioClip(getDocumentBase(), "mysound.wav");
		
		play = new Button("Play");
		loop = new Button("Loop");
		stop = new Button("Stop");
		
		
		
		add(play);
		add(loop);
		add(stop);
		
		
		play.addActionListener(this);
		loop.addActionListener(this);
		stop.addActionListener(this);
		
		
	}
	
	public void paint (Graphics g)
	{
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if (e.getSource()== play)
		{
			guitar.play();
			System.out.println("Play");
		}
		if(e.getSource()== stop)
		{
			guitar.stop();
			System.out.println("Stop");
		}
		if ( e.getSource()==loop)
		{
			guitar.loop();
			System.out.println("loop");
			
		}
		repaint();
		
		
	}
	
}
