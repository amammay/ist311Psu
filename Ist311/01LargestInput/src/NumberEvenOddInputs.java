import java.util.Scanner;

/**
 * 
 */

/**
 * @author mamma
 *
 */
public class NumberEvenOddInputs {

	/**
	 * @param args
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //variables
		 int input = 0;
		 int numOdd = 0;
		 int numEven = 0;
		
		 
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Please Enter  numbers, please type Q to process");
		 
		 //Loop on input and check oddness or even attribute
		 
		 
		 while (scanner.hasNextInt())
		 {
		
			 input = scanner.nextInt();
			 
			 
			
			//even statement 
			 if (input % 2 == 0)
			 {
				numEven++;
				
			 }
			 //odd statement
			 else  
			 {
				 numOdd++;
			 }
			 
			 
		 }
		 
		 
		 System.out.println("\nPrint Results\n" + "Even:" + numEven + "\n"
				 + "Number of odd:" + numOdd);
		
		
		
		
	}
 */
}
