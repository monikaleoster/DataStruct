package mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameOfDigit {
	
	
	 static  List<String> allReadLines = new ArrayList<String>();

	    
	   
	    public static void readLines(){
	    	try {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    	 //BufferedReader in = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input7.txt")));
		    String s;
		    
				while ((s = in.readLine()) != null && s.length() != 0) {
				allReadLines.add(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	
		    }
	    
	    
	    private static boolean isPrime(int number) {
	    	
	    	int sqrtNumbet = (int) Math.sqrt(number);
	    	for(int i=0;i<sqrtNumbet;i++)
	    	{
	    		if(number%sqrtNumbet==0)
	    			return false;
	    	}
	    	
	    	return true;
	    }
	    public static int findFactors(int number) {
	    	int index = 2;
	    	Map<Integer,Integer> factor = new HashMap<>();
	    	for (int i = 0; i < number; i++) {
				
			}
	    	
	    	return 0;
	    }
	
	public static void main(String[] args) {
		
	}

}
