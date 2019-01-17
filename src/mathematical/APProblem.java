package mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class APProblem {
	
    static int noOfTestCases =0;
   static  List<String> allReadLines = new ArrayList<String>();

    
   
    public static void readLines(){
    	try {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    		// BufferedReader in = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\src\\mathematical\\input.txt")));
	    String s;
	    
			while ((s = in.readLine()) != null && s.length() != 0) {
			allReadLines.add(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
	    }
    
    public static void findnTerm() {
    	readLines();
    	noOfTestCases = Integer.valueOf(allReadLines.get(0));
    	for(int i =1 ; i<allReadLines.size();i=i+2) {
    		
    		String[] series= allReadLines.get(i).split(" ");
    		int firstTerm = Integer.valueOf(series[0]);
    		int diff = Integer.valueOf(series[1])- firstTerm;
    		int n = Integer.valueOf(allReadLines.get(i+1));
    		System.out.println(firstTerm +(n-1)*diff);
    	}

    }
    
    
	public static void main (String[] args) {
	    //Read Input
	   
		findnTerm();
		}

}
