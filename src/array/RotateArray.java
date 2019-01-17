package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RotateArray {

	static List<String> allReadLines = new ArrayList<String>();

	public static void printRotatedArr() {
		/*Scanner reader;
		reader = new Scanner(System.in);*/
		
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		try {
			 //BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input9.txt")));
				int noOfTestCases;

			noOfTestCases = Integer.valueOf(br.readLine());
		
		int[] arr = null;
		String s;
		while ((s = br.readLine()) != null && s.length() != 0) {
			/*int size = reader.nextInt();
			diff = reader.nextInt();*/
			
			String[] sizeDiff = br.readLine().trim().split(" ");
			int size = Integer.valueOf(sizeDiff[0]);
			int diff = Integer.valueOf(sizeDiff[1]);
			String[] arrStr = br.readLine().trim().split(" ");
			arr = new int[size];
			for (int j = 0; j < size; j++)
				arr[j] = Integer.valueOf(arrStr[j]);
			rotateArray(arr, diff);
		}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void rotateArray(int[] arr, int d) {

		for (int i = 0; i < d; i++) {
			leftRotateArray(arr, arr.length);
		}
		printArr(arr);

	}

	private static void leftRotateArray(int[] arr, int length) {

		int i;
		int temp = arr[0];
		for (i = 0; i < length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;

	}

	private static void printArr(int[] arr) {
        StringBuffer sb = new StringBuffer(); 

		for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " "); 
		}
		
        System.out.println(sb); 

	}

	public static void main(String[] args) {

		printRotatedArr();
	}

}
