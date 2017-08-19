import java.applet.*;
import java.awt.*;
import java.awt.dnd.DragGestureEvent;
import java.awt.event.*;


/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class EstimateWages extends Applet implements ActionListener
{
	//variables
	double hrsWorked = 0.0;
	double payRate = 0.0;
	double wages = 0.0;
	
	//hours
	Label hrsLabel;
	TextField hrsInput;
	
	//rate 
	Label rateLabel;
	TextField rateInput;
	
	//estimate button
	Button estimate;
	
	
	public void init()
	{
	
		setSize(300,300);
	
		//hours
		hrsLabel = new Label("Enter hours worked: ");
		hrsInput = new TextField(5);
		
		//rate 
		rateLabel = new Label("Enter pay rate: ");
		rateInput = new TextField(5);
		
		//estimate button
		estimate = new Button("Estimate Wages");
		
		//adding stuff in
		add(hrsLabel);
		add(hrsInput);
		add(rateLabel);
		add(rateInput);
		add(estimate);
		estimate.addActionListener(this);
		
	}
	
	public void paint(Graphics g)
	{
		wages = hrsWorked * payRate;
		g.drawString("Your Estimated Earning: $" + wages, 20, 150);
			
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//parse in string input into a double
		hrsWorked = Double.parseDouble(hrsInput.getText());
		payRate = Double.parseDouble(rateInput.getText());
		
		//not hooked up
		repaint(); 
		
		
	}
	
	
	
	
}
