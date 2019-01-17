package ch02.backtracking;

import java.util.Arrays;

public class GenerateKAryString {
	
	private static int size= 3;
	private static int reqdSize=2;

	private static int A[] = new int[reqdSize];
	public static void main(String[] args) {
		kAryString(reqdSize, size);
	}
	private static void kAryString( int n, int size) {
		
		if(n==0) {
			System.out.println(Arrays.toString(A));
		}else
		{
			for(int j=0; j<size;j++) {
				A[n-1]=j;
				kAryString(n-1, size);
				
			}
			
		}
		
	}

}
