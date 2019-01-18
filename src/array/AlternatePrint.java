package array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AlternatePrint {
	
	public static void main(String[] args) {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
				//BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input10.txt")));
			
			String s;
			try {			
				BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input14.txt")));

				int testCase = Integer.valueOf(br.readLine());			
				while ((s = br.readLine()) != null && s.length() != 0) {
					
					String[] sizes = s.trim().split(" ");
					int sizeA = Integer.valueOf(sizes[0]);
					int sizeB = Integer.valueOf(sizes[1]);
					String[] arrStrA = br.readLine().trim().split(" ");
					String[] arrStrB = br.readLine().trim().split(" ");

					int[] arr= new int[sizeA+sizeB];

					for (int j = 0; j < sizeA; j++) {
						arr[j] = Integer.valueOf(arrStrA[j]);
					}
					
					for (int k = sizeB-1,i=sizeA; k >=0; k--,i++) {
						arr[i] = Integer.valueOf(arrStrB[k]);
					}
					
					
					
					alternatePrint(arr);
					}
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	private static void alternatePrint(int[] arr) {
		
		String str ="";
		for(int i =0, j= arr.length-1; i<=j; i++,j--) {
			if(i==j)
				str = ""+arr[i];
			else
				str = arr[i]+" "+arr[j]+" ";
			
			System.out.print(str);
			
		}
	}

}
