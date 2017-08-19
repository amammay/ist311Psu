import java.awt.*;
import java.applet.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * @author Alex Mammay
 * @Date 10/3/2016
 * @Purpose Make a calculator 
 * @Title AppletCalulator.java
 */
public class AppletCalculator extends JApplet 
{
	
	//instantiation of variables
	double firstValue = 0.0;
	double secondValue = 0.0;
	double calcValue = 0.0;
	boolean firstInputDone = false;
	
	String action;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JLabel display;
	JButton zero, one, two, three, four, five, six, seven, eight, nine,
		multiplication, division, subtraction, addition, decimal, equals, clear;
	
	
	Font calcFont;
	
	
	public void init()
	{
		setSize(500, 500);
		//Initialize Variables
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		
		display = new JLabel("0");
		
		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		
		subtraction = new JButton("-");
		addition = new JButton("+");
		multiplication = new JButton("*");
		division = new JButton("/");
		decimal = new JButton(".");
		equals = new JButton("=");
		clear = new JButton("Clear");
		
		//Font
		calcFont = new Font("SanSerif", Font.BOLD, 50);
		this.setFont(calcFont);
		
		//Panel 1
		panel1.setLayout(new BorderLayout(30,50));
		this.add(panel1, BorderLayout.NORTH);
		panel1.add(display);
		
		//Panel 2
		panel2.setLayout(new GridLayout(4,4));
		this.add(panel2, BorderLayout.CENTER);
		
		//Panel 3
		panel3.setLayout(new BorderLayout());
		this.add(panel3, BorderLayout.SOUTH);
		panel3.add(clear);
		
		
		//Adding Items in to panel
		panel2.add(seven);
		panel2.add(eight);
		panel2.add(nine);
		panel2.add(division);
		panel2.add(four);
		panel2.add(five);
		panel2.add(six);
		panel2.add(multiplication);
		panel2.add(one);
		panel2.add(two);
		panel2.add(three);
		panel2.add(subtraction);
		panel2.add(zero);
		panel2.add(decimal);
		panel2.add(equals);
		panel2.add(addition);
		
		CalculatorManager manager = new CalculatorManager(firstValue, secondValue, calcValue, firstInputDone,
				zero, one, two, three, four, five, six, seven, eight, nine,
				multiplication, division, subtraction, addition, decimal, equals, clear, display);
		
		
		//Adding action listeners to each button
		seven.addActionListener(manager);
		eight.addActionListener(manager);
		nine.addActionListener(manager);
		division.addActionListener(manager);
		four.addActionListener(manager);
		five.addActionListener(manager);
		six.addActionListener(manager);
		multiplication.addActionListener(manager);
		one.addActionListener(manager);
		two.addActionListener(manager);
		three.addActionListener(manager);
		subtraction.addActionListener(manager);
		zero.addActionListener(manager);
		decimal.addActionListener(manager);
		equals.addActionListener(manager);
		addition.addActionListener(manager);
		clear.addActionListener(manager);
		
		
	}

	
}
