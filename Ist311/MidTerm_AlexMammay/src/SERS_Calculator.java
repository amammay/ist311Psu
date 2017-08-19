import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Alex Mammay
 * @Date 11/18/2016
 * @Purpose SERS calculator Write a Java program that enables new SERS members to compare the benefits of both Classes. 
 * Your program can be written as core Java or Java Applets application (the choice is yours). 
 * I recommend a console-based application (just as assignment 1) and not GUI. 
 * @Title SERS_Calculator
 */
public class SERS_Calculator 
{
	 
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		//instantiation and initialization of variables
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##"); 
		double creditService = 0.0;
		double annualAverageSalary = 0.0;
		double a3RetirementBenefit, a3TotalMemberContribution, a3MonthlyAnnuity;
		double a4RetirementBenefit, a4TotalMemberContribution, a4MonthlyAnnuity;
		
		//Introduce the user to the program and notify them what they need to have ready
		System.out.println("Welcome to the SERS Calculator!\n"
				+ "Please have the following items ready to input when prompted \n\n"
				+ "1. Your years of credited service\n"
				+ "2. Your final annual average salary\n\n");
		
		//Prompt user to input number of years 
		System.out.println("Please enter your years of credited service: ");
		creditService = input.nextDouble();
		
		//Prompt user to input final annual average salary
		System.out.println("\nPlease enter your final annual average salary: ");
		annualAverageSalary = input.nextDouble();
		
		//Calculations for a3 plan
		a3RetirementBenefit = .02 * creditService * annualAverageSalary;
		a3MonthlyAnnuity = a3RetirementBenefit/12;
		a3TotalMemberContribution = .0625 * creditService * annualAverageSalary;
		
		
		//Calculations for A4 plan
		a4RetirementBenefit = .025 * creditService * annualAverageSalary;
		a4MonthlyAnnuity = a4RetirementBenefit/12;
		a4TotalMemberContribution = .093 * creditService * annualAverageSalary;
		
		
		
		
		// display A3 statements
		System.out.println("\nThe Annual Retirement Benefit for A3 class is: $" + df.format(a3RetirementBenefit)
						 + "\nThe monthly annuity amount to be paid for A3 class is: $" + df.format(a3MonthlyAnnuity)
						 + "\nTotal Member Contributions for A3 class is: $" + df.format(a3TotalMemberContribution));
		
		// display A4 statements
		System.out.println("\nThe Annual Retirement Benefit for A4 class is: $" + df.format(a4RetirementBenefit)
						 + "\nThe monthly annuity amount to be paid for A4 class is: $" + df.format(a4MonthlyAnnuity)
						 + "\nTotal Member Contributions for A4 class is: $" + df.format(a4TotalMemberContribution));		
		

	}
	
		
}
