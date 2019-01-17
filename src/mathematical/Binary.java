package mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Binary {
	
	static List<String> allReadLines = new ArrayList<String>();

	/**
	 * Parses input from console
	 */
	public static void readLines() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			/*BufferedReader in = new BufferedReader(new FileReader(
					new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\src\\mathematical\\input3.txt")));*/
			String s;

			while ((s = in.readLine()) != null && s.length() != 0) {
				allReadLines.add(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Finds sum of Input numbers and check if it is Palindrom
	 */
	public static void printBinaryToInteger() {
		readLines();
		for (int i = 1; i < allReadLines.size(); i++) {
			
			String binary =  allReadLines.get(i);
	        AtomicInteger atomicInteger = new AtomicInteger(binary.length()-1);

			long sum=binary.chars().mapToLong(Character::getNumericValue).map(digit-> {long val = digit* Math.round(Math.pow(2, atomicInteger.getAndDecrement()));  return val;}).reduce(0, (a,b)->a+b);
			
				System.out.println(sum);
	
		}
	}
	
	
	/**
	 * Checks if String is Palindrome
	 * @param str
	 * @return
	 */
	public static Boolean isPalindrome(String str) {
		String[] digitsOfSum = str.split("(?<=.)");
		
		int first=0,last=digitsOfSum.length-1;
		while(first!=last && first<digitsOfSum.length-1 && last>0) {
			if(!digitsOfSum[first].equals(digitsOfSum[last]))
				return false;
			first++;
			last--;
		}
		
		return true;
	}
	

	public static void main(String[] args) {
		printBinaryToInteger();
	}

}
