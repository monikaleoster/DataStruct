package mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumbers {

	static List<String> allReadLines = new ArrayList<String>();

	public static void readLines() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			/*BufferedReader in = new BufferedReader(new FileReader(
					new File("C:\\Monika\\workspaces\\scalaspark\\DataStruct\\src\\mathematical\\input1.txt")));*/
			String s;

			while ((s = in.readLine()) != null && s.length() != 0) {
				allReadLines.add(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void isArmStrongNumber() {
		readLines();
		for (int i = 1; i < allReadLines.size(); i++) {
			
			int number = Integer.valueOf(allReadLines.get(i));

			long cubeSum= allReadLines.get(i).chars().mapToLong(Character::getNumericValue).map(digit->digit*digit*digit).reduce(0, (a,b)->a+b);
	
			//int cubeSum = Integer.valueOf(digits[0]);
			if(cubeSum==number)
				System.out.println("Yes");
			else
				System.out.println("No");
	
		}
	}
	
	

	public static void main(String[] args) {
		isArmStrongNumber();
	}

}
