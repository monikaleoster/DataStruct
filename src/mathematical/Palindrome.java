package mathematical;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Practice for GeeksForGeeks
 * Sum of Digit is Pallindrome or not
 * @author Monika
 *
 */
public class Palindrome {
	
	static List<String> allReadLines = new ArrayList<String>();

	/**
	 * Parses input from console
	 */
	public static void readLines() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			/*BufferedReader in = new BufferedReader(new FileReader(
					new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\src\\mathematical\\input2.txt")));*/
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
	public static void findSumAndCheckPalindrome() {
		readLines();
		for (int i = 1; i < allReadLines.size(); i++) {
			
			long sum= allReadLines.get(i).chars().mapToLong(Character::getNumericValue).reduce(0, (a,b)->a+b);
			if(isPalindrome(sum+""))
				System.out.println("YES");
			else
				System.out.println("NO");
	
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
		findSumAndCheckPalindrome();
	}

}
