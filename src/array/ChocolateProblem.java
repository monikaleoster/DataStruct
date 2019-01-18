package array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ChocolateProblem {
	
	private static int chocolateProb(int[] arr, int m) {
		
		Arrays.sort(arr);
		//since m is always less than no of packets, so we are initializing diff to maximum
		int diff =arr[arr.length-1]- arr[0];
		
		for(int i =0; i+m<=arr.length;i++) {
			int tempDiff = arr[i+m-1]- arr[i];
			if(tempDiff<diff)
				diff = tempDiff;
			
		}
		return diff;
	}

	
	public static void main(String[] args) {
		
		 //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			//BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input10.txt")));
		
		String s;
		try {			
			BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input12.txt")));

			int testCase = Integer.valueOf(br.readLine());			
			while ((s = br.readLine()) != null && s.length() != 0) {
				int size = Integer.valueOf(s.trim());
				String[] arrStr = br.readLine().trim().split(" ");
				int[] arr= new int[size];
				for (int j = 0; j < size; j++)
					arr[j] = Integer.valueOf(arrStr[j]);
				int noOfStudents = Integer.valueOf(br.readLine());
				System.out.println(chocolateProb(arr, noOfStudents));
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	

}
