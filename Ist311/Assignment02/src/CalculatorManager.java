import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 * @author Alex Mammay
 * @Date 10/3/2016
 * @Purpose Make a calculator
 * @Title CalculatorManger.java
 */
public class CalculatorManager implements ActionListener
{
	JButton zero, one, two, three, four, five, six, seven, eight, nine,
			multiplication, division, subtraction, addition, decimal, equals,clear;
	JLabel display;
	double firstValue;
	double secondValue;
	double calcValue;
	boolean firstInputDone = false;
	String mathAction;
	String zeroValue = "0";
	

	public CalculatorManager(double _firstValue, double _secondValue, double _calcValue, boolean _firstInputDone,
			JButton _zero,JButton _one, JButton _two, JButton _three, JButton _four, JButton _five, JButton _six, JButton _seven,
			JButton _eight, JButton _nine, JButton _multiplication, JButton _division, JButton _subtraction,
			JButton _addition, JButton _decimal, JButton _equals, JButton _clear, JLabel _display) 
	{
		
		//numbers
		zero = _zero;
		one = _one;
		two = _two;
		three = _three;
		four = _four;
		five = _five;
		six = _six;
		seven = _seven;
		eight = _eight;
		nine = _nine;
		
		//math actions
		multiplication = _multiplication;
		division = _division;
		subtraction = _subtraction;
		addition = _addition;
		decimal = _decimal;
		equals = _equals;
		clear = _clear;
		firstInputDone = _firstInputDone;
		firstValue = _firstValue;
		secondValue = _secondValue;
		
		
		display = _display;
		
	
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if (e.getSource() == zero)
		{
			if(display.getText() == zeroValue)
			{
				display.setText("0");
			}
			else
			{
				display.setText(display.getText() + 0);
			}
				
		}
		
		else if (e.getSource() == one)
		{
		
			if(display.getText() == zeroValue)
			{
				display.setText("1");
			}
			else
			{
				display.setText(display.getText() + 1);
			}
			
			
			
		}
		
		else if (e.getSource() == two)
		{
		
			if(display.getText() == zeroValue)
			{
				display.setText("2");
			}
			else
			{
				display.setText(display.getText() + 2);
			}
			
			
			
		}
		
		else if (e.getSource() == three)
		{
		
			if(display.getText() == zeroValue)
			{
				display.setText("3");
			}
			else
			{
				display.setText(display.getText() + 3);
			}
			
		}
		

		else if (e.getSource() == four)
		{
		
			if(display.getText() == zeroValue)
			{
				display.setText("4");
			}
			else
			{
				display.setText(display.getText() + 4);
			}
			
			
		}

		else if (e.getSource() == five)
		{
		
			if(display.getText() == zeroValue)
			{
				display.setText("5");
			}
			else
			{
				display.setText(display.getText() + 5);
			}
			
			
		}

		else if (e.getSource() == six)
		{
		
			if(display.getText() == zeroValue)
			{
				display.setText("6");
			}
			else
			{
				display.setText(display.getText() + 6);
			}
			
			
		}

		else if (e.getSource() == seven)
		{
		
			if(display.getText() == zeroValue)
			{
				display.setText("7");
			}
			else
			{
				
				display.setText(display.getText() + 7);
			}
			
			
		}

		else if (e.getSource() == eight)
		{
		
			if(display.getText() == zeroValue)
			{
				display.setText("8");
			}
			else
			{
				display.setText(display.getText() + 8);
			}
			
		}

		else if (e.getSource() == nine)
		{
		
			if(display.getText() == zeroValue)
			{
				display.setText("9");
			}
			else
			{
				display.setText(display.getText() + 9);
			}
			
		}
		
		else if (e.getSource() == decimal)
		{
			
			//checks to see if there is already a decimal point
			if (display.getText().contains("."))
			{
				display.setText(display.getText()+"");
			}
			
			
			
			else if(display.getText() == zeroValue)
			{
				display.setText(".");
			}
			else
			{ 
				display.setText(display.getText() + ".");
			} 
		}
		
		//addition button hit
		else if (e.getSource() == addition)
		{			
			//calls the addition method
			addition();
		}
		//subtraction button hit
		else if (e.getSource() == subtraction)
		{	
			//calls the subtraction method
			subtraction();
		}
		//multiplication button hit
		else if (e.getSource() == multiplication)
		{
			multiplication();
		}
		//division button hit
		else if (e.getSource() == division)
		{
			//calls the division method
			division();
		}
		
		//Equals button has been hit
		else if (e.getSource() == equals)
		{
			
			//if first input hasnt been done, do nothing
			if (firstInputDone == false) 
			{
				return;
			}
			
			else if(mathAction.equals("addition"))
			{
				//calls the equalsAddition Method
				equalsAddition();

			}
			else if ( mathAction.equals("subtraction"))
			{
				//calls the equalsSubtraction Method
				equalsSubtraction();

			}
			else if(mathAction.equals("multiplication"))
			{
				//calls the equalsMultiplication Method
				equalsMultiplication();
			}
			else if(mathAction.equals("division"))
			{
				//calls the equalsDivision Method
				equalsDivision();
			}

			
		}

		//If clear button is hit reset all initial values back to defaulted stage
		else if (e.getSource() == clear)
		{
			display.setText(zeroValue);
			firstValue = 0.0;
			secondValue = 0.0;
			calcValue = 0.0;
			firstInputDone = false;

			
		}
		
	}
	
	/*
	 * Addition method for when you hit the + button
	 */
	public void addition()
	{
		
		if( firstInputDone == false)
		{
			mathAction = "addition";
			firstValue = Double.parseDouble(display.getText());
			display.setText(zeroValue);
			//sets the first input flag
			firstInputDone = true;
		}
	}
	
	
	/*
	 * subtraction method for when you hit the - button
	 */
	public void subtraction()
	{
		
		if(firstInputDone == false)
		{
			
			mathAction = "subtraction";
			firstValue = Double.parseDouble(display.getText());
			display.setText(zeroValue);
			//sets the first input flag
			firstInputDone = true;
		}
	}
	
	/*
	 * multiplication method for when you hit the * button
	 */
	public void multiplication()
	{
		
		if(firstInputDone == false)
		{
			mathAction = "multiplication";
			firstValue = Double.parseDouble(display.getText());
			display.setText(zeroValue);
			//sets the first input flag
			firstInputDone = true;
		}
	}
	
	
	/*
	 * Division method for when you hit the / button
	 */
	public void division()
	{
		
		if(firstInputDone == false)
		{
			mathAction = "division";
			firstValue = Double.parseDouble(display.getText());
			display.setText(zeroValue);
			//sets the first input flag
			firstInputDone = true;
		}
	}

	/*
	 * equals method for when you hit the = button
	 */
	public void equalsAddition()
	{
		if(firstInputDone == true && mathAction == "addition")
		{
			secondValue = Double.parseDouble(display.getText());
			calcValue = firstValue + secondValue;
			display.setText(Double.toString(calcValue));
			//resets input flag 
			firstInputDone = false;
		}
		
	}
	
	/*
	 * equals method for when you hit the / button
	 */
	public void equalsSubtraction()
	{
		if(firstInputDone == true && mathAction == "subtraction")
		{
			secondValue = Double.parseDouble(display.getText());
			calcValue = firstValue - secondValue;
			display.setText(Double.toString(calcValue));
			//resets input flag 
			firstInputDone = false;
		}
	}
	
	/*
	 * equals method for when you hit the / button
	 */
	public void equalsMultiplication()
	{
		if(firstInputDone == true && mathAction == "multiplication")
		{
			secondValue = Double.parseDouble(display.getText());
			calcValue = firstValue * secondValue;
			display.setText(Double.toString(calcValue));
			//resets input flag 
			firstInputDone = false;
		}
	}
	
	/*
	 * equals method for when you hit the / button
	 */
	public void equalsDivision()
	{
		if(firstInputDone == true && mathAction == "division")
		{
			secondValue = Double.parseDouble(display.getText());
			if (secondValue == 0)
			{
				display.setText("Error Cannot divide 0");
				return;
			}
			
			calcValue = firstValue / secondValue;
			display.setText(Double.toString(calcValue));
			//resets input flag 
			firstInputDone = false;
		}
	}
}
