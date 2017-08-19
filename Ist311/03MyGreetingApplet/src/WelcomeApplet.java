import java.applet.*;
import java.awt.*;

/**
 * 
 */

/**
 * @author mamma
 *
 */
public class WelcomeApplet extends Applet
{
	//declares variable names for applet actions
	private Button go;
	private TextField name;
	private Label hello;

	public void init()
	{
		//instances of actions
		go = new Button("Greet ");
		name = new TextField();
		hello = new Label(" ", Label.CENTER);
		
		//layout
		this.setLayout(new BorderLayout());
		this.add(name, BorderLayout.NORTH);
		
		//Panel 
		Panel center = new Panel();
	    center.add(go);
	    this.add(center, BorderLayout.CENTER);
	    
	    this.add(hello, BorderLayout.SOUTH);
	    
	   
	    //setup the event handling
	    GreetingHandler listener = new GreetingHandler(hello, name);
	    go.addActionListener(listener);
	    
	    
		
		
	}

}
