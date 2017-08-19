import java.applet.*;
import java.awt.*;
import java.awt.event.*;




/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */

public class AppletDataModeling extends Applet
{

	Dice catsDie;
	Dice catsDie2;
	
	
	public void init()
	{
		setSize(500,500);
		catsDie = new Dice();
		catsDie2 = new Dice(6);
		
		
	}
	
	public void paint (Graphics g)
	{
		//move the window to repaint
		int value = catsDie.getShownFaceValue();
		g.drawString(" " + value, 20, 20);
		catsDie.rollDice();
		value = catsDie.getShownFaceValue();
		g.drawString(" " + value , 20, 40);
		
		catsDie.rollDice();
		value = catsDie.getShownFaceValue();
		g.drawString(" " + value , 20, 60);
		
		catsDie.rollDice();
		value = catsDie.getShownFaceValue();
		g.drawString(" " + value , 20, 80);
		
		catsDie.rollDice();
		value = catsDie.getShownFaceValue();
		g.drawString(" " + value , 20, 100);
		
		catsDie.rollDice();
		value = catsDie.getShownFaceValue();
		g.drawString(" " + value , 20, 120);
		
		catsDie.rollDice();
		value = catsDie.getShownFaceValue();
		g.drawString(" " + value , 20, 140);
		
		
		//second constructor 
		int value2 = catsDie2.getShownFaceValue();
		g.drawString(" " + value2, 120, 20);
		
		catsDie2.rollDice();
		value2 = catsDie2.getShownFaceValue();
		g.drawString(" " + value2, 120, 40);

		
		
		catsDie2.rollDice();
		value2 = catsDie2.getShownFaceValue();
		g.drawString(" " + value2, 120, 60);
		
		
		catsDie2.rollDice();
		value2 = catsDie2.getShownFaceValue();
		g.drawString(" " + value2, 120, 80);
	
		
		catsDie2.rollDice();
		value2 = catsDie2.getShownFaceValue();
		g.drawString(" " + value2, 120, 100);
	
		
		catsDie2.rollDice();
		value2 = catsDie2.getShownFaceValue();
		g.drawString(" " + value2, 120, 120);
		
		
		catsDie2.rollDice();
		value2 = catsDie2.getShownFaceValue();
		g.drawString(" " + value2, 120, 140);
	
		
	
		
		
		
		
		
		
		
		
		
	}
	
	
}
