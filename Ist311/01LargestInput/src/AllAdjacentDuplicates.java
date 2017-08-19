import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author mamma
 *
 */
public class AllAdjacentDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//variables 
		int input = 0;
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter  numbers: \n");
		 
		while (scanner.hasNextInt())
		{
		 input = scanner.nextInt();
		 inputArray.add(input);

		
		
		
		for (int i = 0; i < inputArray.size(); i++)
		{
			for (int j = i+1; j < inputArray.size(); j++) 
			{
				if (j!=i && inputArray.get(i) == inputArray.get(j))
				{
					inputArray.remove(i);
				}
			}
		}
		}
		System.out.println(inputArray);
		
	}

}
