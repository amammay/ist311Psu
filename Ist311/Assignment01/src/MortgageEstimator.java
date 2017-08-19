import java.util.Scanner;

/**
 * 
 */

/**
 * @author Alex Mammay
 * @Date 8/31/2016
 * @Purpose Please write a program that computes the bi-monthly payment of a mortgage, given the amount of the loan
 *(principal), the interest rate, and the number of years required to pay back the loan
 * @Title MortgageEstimator
 */
public class MortgageEstimator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//variables
		double principal = 0.00;
		double interestRate = 0.00;
		double calcInterestRate = 0.00;
		double biMonthlyPayment = 0.00;
		
		int years = 0;
		int numberOfPayment = 0;
		
		//initialize the input scanner  
		Scanner scanner = new Scanner(System.in);
		
		//Collect principal input
		System.out.println("\nPlease Enter the Principal of the loan: ");
		principal = scanner.nextDouble();
		
		//Collect interest rate input
		System.out.println("\nPlease Enter the interest rate of the loan: ");
		interestRate = scanner.nextDouble();
		
		//Collect number of years  input
		System.out.println("\nPlease Enter the number of years of the loan: ");
		years = scanner.nextInt();
		
		//Calculate the number of payments left on the loan
		numberOfPayment = years *6;
		
		//Calculate the Bi-Monthly Interest rate
		calcInterestRate = interestRate /(6 * 120);
		
		//Calculate the monthly payment of the loan
		biMonthlyPayment = principal * (calcInterestRate/(1-Math.pow(1+calcInterestRate, -numberOfPayment)));
		
		//print out of bi monthly payment and number of payments
		System.out.println("\nBi-Monthly Payment of loan: $" + biMonthlyPayment +
						   "\nNumber of Payments: " + numberOfPayment);
		
		

		
	}

}
