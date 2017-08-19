import java.awt.*;
import java.awt.event.*;

public class GreetingHandler implements ActionListener
{
	
	private Label label;
	private TextField textField;
	
	//constructor for label and textfield
	public GreetingHandler(Label s, TextField t)
	{
	
		label = s;
		textField = t;
		
	}
	
	//handle the action event
	public void actionPerformed(ActionEvent a)
	{
		String name = textField.getText();
		if (name != null && !(name.equals("")))
		{
			label.setText("Hello, " + name);
			
		}
		else
		{
			label.setText("Please Enter A valid name");
		}
		
		//done
		//done again
	}
	
}
