
import java.applet.*;
import java.awt.*;
import java.awt.event.*;



public class AppletComponent extends Applet
{

	Label nameLabel;
	Label genderLabel;
	Label ageLabel;
	
	TextField nameInput;
	Button submitButton;
	
	Choice ageInput;
	CheckboxGroup genderInput;
	
	
	public void init()
	{
	
		setSize(300,300);
		nameLabel = new Label("Enter Your Name Here: ");
		genderLabel = new Label("Choose your Gender here");
		ageLabel = new Label("Enter your Age here");
		
		nameInput = new TextField(10);
		submitButton = new Button("Submit");
		
		//age
		ageInput = new Choice();
		ageInput.addItem("21");
		ageInput.addItem("22");
		ageInput.addItem("23");
		ageInput.addItem("24");
		ageInput.addItem("25");
		ageInput.addItem("26");

		//gender
		genderInput = new CheckboxGroup();
		
		//populate
		add(nameLabel);
		add(nameInput);
		
		add(genderLabel);
		add(new Checkbox("Male", genderInput, true));
		add(new Checkbox("Female", genderInput, false));
		
		add(ageLabel);
		add(ageInput);
		add(submitButton);
		
		
		
	}
	
	public void paint (Graphics g)
	{
		
		
	
	}
	
	
}
