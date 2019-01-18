package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpDown {

	public static void main(String[] args) {

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader(new
		// File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input10.txt")));

		String s;
		try {
		/*	BufferedReader br = new BufferedReader(
					new FileReader(new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\inputs\\input15.txt")));
*/
			int testCase = Integer.valueOf(br.readLine());
			while ((s = br.readLine()) != null && s.length() != 0) {

				String[] sizes = s.trim().split(" ");
				int size = Integer.valueOf(sizes[0]);
				String[] arrStr = br.readLine().trim().split(" ");

				int[] arr = new int[size];

				for (int j = 0; j < size; j++) {
					arr[j] = Integer.valueOf(arrStr[j]);
				}

				printUPDown(arr);
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void printUPDown(int[] a) {
		int up = 0, down = 0;

		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] > a[i - 1] && a[i] > a[i + 1])
				up++;
			if (a[i] < a[i - 1] && a[i] < a[i + 1])
				down++;

		}
		
		System.out.println(up+" "+down);

	}
}
