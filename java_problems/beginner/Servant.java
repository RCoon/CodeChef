package java_problems.beginner;

import java.util.Scanner;

public class Servant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int num = sc.nextInt();
			if (num < 10) {
				System.out.println("What an obedient servant you are!");
			} else {
				System.out.println("-1");
			}
		}
		sc.close();
	}
}
