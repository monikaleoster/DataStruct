package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	
	 
	
private static int majorityElement(int[] arr) {
		
	
		Map<Integer,Integer> countMap = new HashMap<>();
		for(int i=0; i<arr.length;i++) {
			if(countMap.containsKey(arr[i])) {
				int count = countMap.get(arr[i])+1;
				countMap.put(arr[i],count);
				if(count > arr.length/2)
					return arr[i];
			}else
				countMap.put(arr[i], 1);
				
		}
		
		return -1;
	}
	public static void main(String[] args) {
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			//BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input10.txt")));
		
		String s;
		try {			
			//BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input11.txt")));

			int testCase = Integer.valueOf(br.readLine());			
			while ((s = br.readLine()) != null && s.length() != 0) {
				int size = Integer.valueOf(s.trim());
				String[] arrStr = br.readLine().trim().split(" ");
				int[] arr= new int[size];
				for (int j = 0; j < size; j++)
					arr[j] = Integer.valueOf(arrStr[j]);
				System.out.println(majorityElement(arr));
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	

}
