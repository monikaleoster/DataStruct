package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void removeDuplicate(String[] arrStr) {
		
		Set<String> set = new HashSet<>();
		StringBuffer bf = new StringBuffer();

		for (int j = 0; j < arrStr.length; j++) {
			if(set.add(arrStr[j]))
				bf.append(arrStr[j]+" ");
		}
		
			System.out.println(bf);
		
		/*Scanner reader;
		reader = new Scanner(System.in);*/
		
       //BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

	
		
	}
	
	
	public static void main(String[] args) {
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			//BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input10.txt")));
			int testCase = Integer.valueOf(br.readLine());
		
		String s;
		while ((s = br.readLine()) != null && s.length() != 0) {
			int size = Integer.valueOf(s.trim());
			String[] arrStr = br.readLine().trim().split(" ");
			/*for (int j = 0; j < size; j++)
				arr[j] = Integer.valueOf(arrStr[j]);*/
			removeDuplicate(arrStr);
		}
		
		}catch(Exception e) {
			
		}	}

}
