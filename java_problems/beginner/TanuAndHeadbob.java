package java_problems.beginner;

import java.util.Scanner;

public class TanuAndHeadbob {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			@SuppressWarnings("unused")
			int numGestures = Integer.parseInt(sc.nextLine());
			char[] gestures = sc.nextLine().toCharArray();
			System.out.println(determineOriginFromGestures(gestures));
		}
		sc.close();
	}
	
	private static String determineOriginFromGestures(char[] arr) {
		int index = 0;
		boolean isIndian = false;
		boolean yesIsPresent = false;
		while (index < arr.length) {
			if (arr[index] == 'I') {
				isIndian = true;
				break;
			} else if (arr[index] == 'Y') {
				yesIsPresent = true;
			}
			index++;
		}
		if (isIndian) {
			return "INDIAN";
		} else {
			if (yesIsPresent) {
				return "NOT INDIAN";
			} else {
				return "NOT SURE";
			}
		}
	}
}