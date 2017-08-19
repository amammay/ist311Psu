import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author mamma
 *
 */
public class LargestInput {
 
	/**
	 * @param args
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Declares variables
		int Input = 0;
		int Largest = 0;
		int Smallest = 0;
		
	   
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Please Enter  numbers, please type Q to process");
	     
	    Largest = scanner.nextInt();
	    Smallest = Largest;
		
	    
	    //loop on input and check for new min or max
	    
	    while (scanner.hasNextInt())
	    {
			Input = scanner.nextInt();
			
			if (Input > Largest )
			{
				Largest = Input;
			}
			
			if (Input < Smallest)
			{
				Smallest = Input;
			}

		}
	    
	    
	    
	    
	    
	    
	    
	    
	    //OutPut the results
	    
	    System.out.println("\nLargest Number:" + Largest + "\n"
	    		+ "Smallest: " + Smallest);
	    
	    
	    
	    
	    
	    
		
		
		
	}
*/
}
