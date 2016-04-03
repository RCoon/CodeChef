package java_problems.beginner;

import java.util.Scanner;

public class SmallestNumberOfNotes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int total = sc.nextInt();
			System.out.println(getSmallestNumberOfNotes(total));
		}
		sc.close();
	}
	
	private static int getSmallestNumberOfNotes(int total) {
		int numNotes = 0;
		while (total >= 100) {
			numNotes++;
			total -= 100;
		}
		while (total >= 50) {
			numNotes++;
			total -= 50;
		}
		while (total >= 10) {
			numNotes++;
			total -= 10;
		}
		while (total >= 5) {
			numNotes++;
			total -= 5;
		}
		while (total >= 2) {
			numNotes++;
			total -= 2;
		}
		while (total >= 1) {
			numNotes++;
			total -= 1;
		}
		return numNotes;
	}
}