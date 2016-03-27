package java_problems.beginner;

import java.util.Scanner;

public class FitSquaresInTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int lengthOfBase = sc.nextInt();
			int n = (lengthOfBase / 2) - 1;
			System.out.println((n*(n + 1)) / 2);
		}
		sc.close();
	}
}