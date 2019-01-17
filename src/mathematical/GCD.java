package mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GCD {
	
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
	    
	    public static void findGCD() {
	    	readLines();
	    	
	    	for(int i =2 ; i<allReadLines.size();i=i+2) {
	    		
	    		String[] numbers= allReadLines.get(i).split(" ");
	    		Optional<Integer> gcd = Arrays.stream(numbers).map(number-> Integer.valueOf(number)).reduce( (a,b)->gcd(a,b));
	    		System.out.println(gcd.get());

	    	}
	    	}
	    
	    
	    private static int gcd(int a, int b) {
	    	
	    	int index =2;
	    	int result =1;
	    	
	    	while(index<=a && index <=b) {
	    		
	    		if(a%index==0 && b%index==0)
	    			result =index;
	    		
	    		index++;
	    		
	    	}
	    	
	    	return result;
	    	
	    }

	    
	    public static void main(String[] args) {
	    	findGCD();
	    }
}
