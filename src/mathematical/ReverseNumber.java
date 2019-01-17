package mathematical;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReverseNumber {
	
	
	static List<String> allReadLines = new ArrayList<String>();


	public static void readLines() {
		try {
			//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader in = new BufferedReader(new FileReader(
					new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\src\\mathematical\\input4.txt")));
			String s;

			while ((s = in.readLine()) != null && s.length() != 0) {
				allReadLines.add(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	private static void printReverseNum() {
		
		readLines();
		for (int i = 1; i < allReadLines.size(); i++) {
			
			int number =  Integer.valueOf(allReadLines.get(i));
	        
			
				System.out.println(reverse(number));
	
		}
		
	}
	
	private static String reverse(int number) {
		
		
		int tens = 10;
		String reverseNum = "";
		while(number/tens< number) {
			int digit = number%tens;
			number = number/tens;
			if(digit==0 && reverseNum.isEmpty() )
				continue;
			
				reverseNum = reverseNum+digit;
			
			
		}
		
		return reverseNum;
		
	}
	
	public static void main(String[] args) {
	
		printReverseNum();
	}
}
