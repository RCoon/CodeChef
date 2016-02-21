package java_problems.beginner;

import java.util.Scanner;

public class CielAndReceipt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < numCases; i++) {
			int totalPrice = Integer.parseInt(sc.nextLine());
			int minMenus = 0;
			for (int j = 11; j >= 0; j--) {
				minMenus = (int) (minMenus + (totalPrice / (Math.pow(2, j))));
				totalPrice = (int) (totalPrice % (Math.pow(2, j)));
			}
			System.out.println(minMenus);
		}
		sc.close();
	}
}