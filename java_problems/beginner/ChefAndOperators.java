package java_problems.beginner;

import java.util.Scanner;

public class ChefAndOperators {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a < b) {
				System.out.println("<");
			} else if (a > b) {
				System.out.println(">");
			} else {
				System.out.println("=");
			}
		}
		sc.close();
	}
}