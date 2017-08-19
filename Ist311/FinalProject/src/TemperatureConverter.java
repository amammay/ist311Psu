import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.annotation.Generated;

/**
 * 
 */

/**
 * @author Alex Mammay
 * @Date 12/13/2016
 * @Purpose Create a temperature converter
 * @Title
 */
public class TemperatureConverter 
{
	

	/**
	 * @param args
	 * @throws IOException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException
	{
		//Text file that will be used
		String FILENAME = "results.txt";
		File textFile =  new File(FILENAME);
		
		//Buffered Writer for appending
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		
		
		// if file does not exists, then create it
		if (!textFile.exists())
		{
			textFile.createNewFile();
		}
		
		//true = append file
		fw = new FileWriter(textFile.getAbsolutePath(),true);
		bw = new BufferedWriter(fw);
		
		//The inputs
		double inputTemp = 0.0;
		Character inputUnit;
		
		//Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompt the user
		System.out.println("Greatings Human, please input a tempeture."
				+ "\nAn example would be 100");
		
		//Grab the input			
		inputTemp = in.nextDouble();
		
		//Prompt the user for unit
		System.out.println("Your Input Temp is " + inputTemp 
				+ "\nPlease Enter your Unit of Temperature."
				+ "\nYou can enter the following."
				+ "\nF = Fahrenheit"
				+ "\nC = Celsius"
				+ "\nK = Kelvin");
		
		//Grab the unit
		inputUnit = in.next().charAt(0);
		
		//If the inputed temp is in celsius  
		if (Character.toLowerCase(inputUnit) == 'c')
		{
			
			double convertToKelvinfromC = 0.0;
			double convertToFfromC = 0.0;
			
			//Conversions
			convertToKelvinfromC = inputTemp + 273;
			convertToFfromC = (inputTemp * 1.8) + 32;
			
			//print out to the console
			System.out.println("\nIn Kelvin your answer would be : " + convertToKelvinfromC + " Degrees Kelvin");
			System.out.println("\nIn Fahrenheit you answer would be : " + convertToFfromC + " Degrees Fahrenehit");
			
			
			//write to the file
			bw.write("\nResults\n" + "In Kelvin your answer would be : " + convertToKelvinfromC + " Degrees Kelvin" +" "+
					new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date()) + "\n"+ 
					"In Fahrenheit your answer would be : " + convertToFfromC + " Degrees Fahrenheit"  +" "+ 
					new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date()));
			
			

			
		}
		
		//If the inputed temp is in kelvin
		else if (Character.toLowerCase(inputUnit) == 'k')
		{
			
			double convertToCfromK = 0.0;
			double convertToFfromK = 0.0;
			
			
			//Conversions
			convertToCfromK = inputTemp - 273;
			convertToFfromK = (convertToCfromK * 1.8) +32;
			
			//print out to the console
			System.out.println("\nIn Celsius your answer would be : " + convertToCfromK + " Degrees Celsius");
			System.out.println("\nIn Fahrenheit your answer would be : " + convertToFfromK + " Degrees Fahrenehit");
			
			//write to the file
			bw.write("\nResults\n" + "In Celsius your answer would be : " + convertToCfromK + " Degrees Celsius" +" "+
			new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date()) + "\n"+ 
			"In Fahrenheit your answer would be : " + convertToFfromK + " Degrees Fahrenehit"  +" "+ 
			new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date()));
			

		}
		else if (Character.toLowerCase(inputUnit) == 'f')
		{
			double convertToCfromF = 0.0;
			double convertToKfromF = 0.0;
			
			//Conversions
			convertToCfromF = (inputTemp - 32) / 1.8;
			convertToKfromF = convertToCfromF +273;
			//print out to the console
			System.out.println("\nIn Celsius your answer would be : " + convertToCfromF + " Degrees Celsius");
			System.out.println("\nIn Kelvin your answer would be : " + convertToKfromF + " Degrees Kelvin");
			
			//write to the file
			bw.write("\nResults\n" + "In Celsius your answer would be : " + convertToCfromF + " Degrees Celsius" +" "+
					new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date()) + "\n"+ 
					"In Kelvin your answer would be : " + convertToKfromF + " Degrees Kelvin"  +" "+ 
					new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date()));
			
			


		}
		//handle non unit
		else
		{
			System.out.println("The inputed unit type is not recogonzied please try again");	
		}
		
		//close the writers
		try
		{
			if (bw != null)
				bw.close();

			if (fw != null)
				fw.close();
			
	
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		

	}

}
