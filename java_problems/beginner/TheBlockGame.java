package java_problems.beginner;

import java.util.Scanner;

public class TheBlockGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			char[] numArray = sc.nextLine().toCharArray();
			boolean isPalindrome = true;
			for (int index = 0; index < numArray.length / 2; index++) {
				if (numArray[index] != numArray[numArray.length - 1 - index]) {
					isPalindrome = false;
					break;
				}
			}
			if (isPalindrome) {
				System.out.println("wins");
			} else {
				System.out.println("losses");
			}
		}
		sc.close();
	}
}