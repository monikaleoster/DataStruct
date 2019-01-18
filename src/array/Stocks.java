package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stocks {
	private static String buySellStocks(int[] arr) {
		String result ="";
		int buyPrice =-1;
		int buyPriceIndex =-1;
		int sellPrice =0;
		int spIndex =0;
		int i=0;
		for( i=0;i<arr.length;i++) {
			if(buyPrice<0) {
				buyPrice =arr[i];
				buyPriceIndex =i ;
				continue;
			}
			if(buyPrice<arr[i] && sellPrice< arr[i]) {
					sellPrice = arr[i];
					spIndex = i;

			}else
			{
				if(buyPrice<sellPrice)
				result = result+ "("+buyPriceIndex+" "+ spIndex+")";
				buyPrice =arr[i];
				buyPriceIndex  = i;
				sellPrice=0;
				spIndex	=0;	
				
			}
			
		}
		
		if(buyPrice!=-1 && buyPrice<sellPrice)
			result = result+" ("+buyPriceIndex+" "+(i-1)+") ";
		
		if(result.isEmpty())
			result ="No Profit";
		
		return result;
	}

	
	public static void main(String[] args) {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			//BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input10.txt")));
		
		String s;
		try {			
			//BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input13.txt")));

			int testCase = Integer.valueOf(br.readLine());			
			while ((s = br.readLine()) != null && s.length() != 0) {
				int size = Integer.valueOf(s.trim());
				String[] arrStr = br.readLine().trim().split(" ");
				int[] arr= new int[size];
				for (int j = 0; j < size; j++)
					arr[j] = Integer.valueOf(arrStr[j]);
				System.out.println(buySellStocks(arr));
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
