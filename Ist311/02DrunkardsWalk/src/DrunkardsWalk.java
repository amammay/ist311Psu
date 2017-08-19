import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author mamma
 *
 */
public class DrunkardsWalk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//read in input
		Scanner in = new Scanner(System.in);
		
		
		
		//Constant variables
		final int NUMBER_OF_STEPS = 100;
		//variables 
		int newX = 0;
		int newY = 0;
		int initialX = 0;
		int initialY = 0;
		double distance = 0;
		
		int direction = 0;
		
		
		
		//print out command and prompt in x location
		System.out.println("Please enter initial x location");
		initialX = in.nextInt();
		newX = initialX;
		
		//print out command and prompt in y location
		System.out.println("Please enter initial y location");
		initialY = in.nextInt();
		newY = initialY;
		
		//print out initial location
		System.out.println("Initial Location: " + newX + "," + newY);
		
		
		
		
		//Loop I over number of steps 
		for (int i = 0; i < NUMBER_OF_STEPS; i++)
		{
			direction = (int) (Math.random() * 4);
			
			if (direction == 0)
			{
				newX++;
			}
			if (direction == 1)
			{
				newX--;
			}
			if (direction == 2)
			{
				newY++;
			}
			if (direction == 3)
			{
				newY--;
			}
			
		}
		
		
		//time to do some math 

		distance = Math.sqrt(Math.pow(initialX - newX ,2) + Math.pow(initialY - newY, 2) );
		
		
		
		
		//Print out results
		System.out.println("Your Final location: " + newX + "," + newY);
		System.out.println("Minium distance walked " + distance + " units");
	}

}
