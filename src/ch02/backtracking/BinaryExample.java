package ch02.backtracking;

import util.Helper;

public class BinaryExample {
	private static int size= 3;

	private static int A[] = new int[size];
	public static void main(String[] args) {
		binary(size);
	}
	
	
	
	public static void binary(int size) {
		if (size<1)
			Helper.printIntArr(A);
			else {
			A[size-1] =0;
			binary(size-1);
			A[size-1]=1;
			binary(size-1);
					
		}
	}

}
