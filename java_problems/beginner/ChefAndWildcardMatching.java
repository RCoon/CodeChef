package java_problems.beginner;

import java.util.Scanner;

public class ChefAndWildcardMatching {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			boolean canBeMatched = true;
			char[] arr1 = sc.nextLine().toCharArray();
			char[] arr2 = sc.nextLine().toCharArray();
			
			charLoop:
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] != '?' && arr2[j] != '?') {
					if (arr1[j] != arr2[j]) {
						canBeMatched = false;
						break charLoop;
					}
				}
			}
			if (canBeMatched) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}
}