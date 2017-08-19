import java.util.Scanner;

/**
 * 
 */

/**
 * @author Alex Mammay
 * @Date 9/1/2016
 * @Purpose Write a simple program in Java that outputs the sum of all odd numbers between a and b (where a and
 * b are inputs).
 * @Title SumOddNumbers
 */
public class SumOddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int a = 0;
		int b = 0;
		int sumOdd = 0;
		int minNum = 0;
		
		
		//Initialize the input scanner  
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user for input
		System.out.println("Please enter your first value:");
		a = scanner.nextInt();
		
		//prompt user for input
		System.out.println("Please enter your second value:");
		b = scanner.nextInt();
		
		minNum = Math.min(a, b);
		
		/*
		 * hacky way to make sure that if the smaller number is a odd it increases it value so 
		 * that the for loop will look inbetween the parameters 
		 */
		if (minNum % 2 == 1)
		{
		 minNum++;
		 
		}
				
		
		
		//Loop over inputed values and make sure the smaller value is always first
		for (int i = minNum; i < Math.max(a, b); i++)
		{
			if (i % 2 == 1) 
			{
				sumOdd +=i;
			}
		}
	
		System.out.println("Sum Of odd numbers between "+ a +" and " + b + " is " + sumOdd);
		
	}

}
