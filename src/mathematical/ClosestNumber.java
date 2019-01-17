package mathematical;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClosestNumber {
	
	static List<String> allReadLines = new ArrayList<String>();


	public static void readLines() {
		try {
			//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader in = new BufferedReader(new FileReader(
					new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\src\\mathematical\\input5.txt")));
			String s;

			while ((s = in.readLine()) != null && s.length() != 0) {
				allReadLines.add(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	
	/*
	private static void findClosest() {
		
		readLines();
		for (int i = 1; i < allReadLines.size(); i++) {
			
			String[] inputs = allReadLines.get(i).split(" ");
			int number = Integer.valueOf(inputs[0]);
			int divisor = Integer.valueOf(inputs[1]);
			int remainder = Math.abs(number%divisor);
		
			int ltNumber = number-remainder;
			int gtNumber=0;
			if(number>0)
			gtNumber = number +(divisor-remainder);
			else
				gtNumber = number +(remainder-divisor);
	

			if(divisor/2>remainder)
				System.out.println(ltNumber);
				else {
						System.out.println(gtNumber);

				}
	
		}
		
	}
	*/
	
	/**
	 * 
	 */
	/*private static void findClosest() {
		
		readLines();
		for (int i = 1; i < allReadLines.size(); i++) {
			
			String[] inputs = allReadLines.get(i).split(" ");
			int number = Integer.valueOf(inputs[0]);
			int divisor = Integer.valueOf(inputs[1]);
		//	int remainder = Math.abs(number%divisor);
			//Quotient, Positive for same signs and negative for different signs
			int qt = number/divisor;
		
			//
			int ltNumber = divisor*qt;
			int gtNumber=0;
			//For same signs
			if(qt>0)
				gtNumber =divisor*(qt+1);
			else
				//For Different signs, 
				//when divisor is greater than original number(Same or Different sign), Closest divisible number must be equal to divisor 
				if(qt==0)
					//If number is positive(That means divisor is negative), Closest divisible number must be positive
					if(number>0)
					gtNumber = Math.abs(divisor);
				//If number is negative(That means divisor is positive), Closest divisible number must be negative
					else
					gtNumber = -divisor;
				else //For Different signs, when quotient is negative

				gtNumber =divisor*(qt-1);
	

			if(Math.abs(number-ltNumber)< Math.abs(number-gtNumber))
				System.out.println(ltNumber);
			else
				System.out.println(gtNumber);

	
		}
		
	}*/
	
private static void findClosest() {
		
		readLines();
		for (int i = 1; i < allReadLines.size(); i++) {
			
			String[] inputs = allReadLines.get(i).split(" ");
			int number = Integer.valueOf(inputs[0]);
			int divisor = Integer.valueOf(inputs[1]);
		//	int remainder = Math.abs(number%divisor);
			//Quotient, Positive for same signs and negative for different signs
			int qt = number/divisor;
		
			//
			int ltNumber = divisor*qt;
			int gtNumber=0;
			//For same signs
			if(qt>0)
				gtNumber =divisor*(qt+1);
			else
				/*//For Different signs, 
				//when divisor is greater than original number(Same or Different sign), Closest divisible number must be equal to divisor 
				if(qt==0)
					//If number is positive(That means divisor is negative), Closest divisible number must be positive
					if(number>0)
					gtNumber = Math.abs(divisor);
				//If number is negative(That means divisor is positive), Closest divisible number must be negative
					else
					gtNumber = -divisor;
				else //For Different signs, when quotient is negative
*/
				gtNumber =divisor*(qt-1);
	

			if(Math.abs(number-ltNumber)< Math.abs(number-gtNumber))
				System.out.println(ltNumber);
			else
				System.out.println(gtNumber);

	
		}
		
}

	
	
	
	public static void main(String[] args) {
	
	
		//System.out.println(-15/-6);
		
		findClosest();
		
		

		
	}

}
