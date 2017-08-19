/**
 * 
 */

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class Dice
{

	//class level varaiables
	private int numberOfSides;
	private int shownFaceValue;
	
	public Dice()
	{
		
		//constructor gives attribute starting values
		
		numberOfSides = 6;
		shownFaceValue = (int) (Math.random() * numberOfSides + 1);

	}
	
	public Dice(int numberOfSidesOfTheDice)
	{
		
		//constructor gives attribute starting values
		
		numberOfSides = numberOfSidesOfTheDice;
		shownFaceValue = (int) (Math.random() * numberOfSides + 1);

	}
	
	
	
	
	public int getShownFaceValue()
	{
		
		
		return shownFaceValue;
		
	}
	
	public void rollDice()
	{
		shownFaceValue = (int)(Math.random() * numberOfSides+1);
		
	}
	
	
}
