package util;

public class Helper {

	
	public static void printIntArr(int arr[]) {
		String printStr="";
		for(int i=0; i< arr.length-1;i++) {
			printStr+= arr[i];
		}
		
		System.out.println(printStr);
	}
}
