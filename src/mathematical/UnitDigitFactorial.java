package mathematical;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UnitDigitFactorial {
	
	 static  List<String> allReadLines = new ArrayList<String>();

	  public static void readLines(){
	    	try {
		 // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedReader in = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input8.txt")));
		    String s;
		    
				while ((s = in.readLine()) != null && s.length() != 0) {
				allReadLines.add(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	
		    }
	    
	  static int factorial =1;
	  private static int unitDigitFactorial(int number) {

		if(number==1 || number==0)
			return factorial;
		if(number>=5)
			return 0;
		if(number==2) return 2;
		if(number ==4) return 4;
		if(number ==3) return 6;
		
		return factorial;
		  
	  }

	  
	  public static void main(String[] args) {
		  readLines();
		  for(int i =1 ; i<allReadLines.size();i++) {
	    		String number= allReadLines.get(i);
	    		System.out.println(unitDigitFactorial(Integer.valueOf(number)));
	    				
		  }  
	}
}
