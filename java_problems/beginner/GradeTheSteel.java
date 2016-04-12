package java_problems.beginner;

import java.util.Scanner;

public class GradeTheSteel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
	    for (int i = 0; i < numCases; i++) {
			int hardness = sc.nextInt();
			double carbonContent = sc.nextDouble();
			int tensileStrength = sc.nextInt();
			System.out.println(getGradeOfSteel(hardness, carbonContent, tensileStrength));
		}
	    sc.close();
	}
	
	private static int getGradeOfSteel(int h, double c, int t) {
		int conditionsMet = 0;
		boolean hardnessMet = false;
		boolean carbonMet = false;
		
		if (h > 50) {
			conditionsMet++;
			hardnessMet = true;
		}
		
		if (c < 0.7) {
			conditionsMet++;
			carbonMet = true;
		}
		
		if (t > 5600) {
			conditionsMet++;
		}
		
		if (conditionsMet == 3) {
			return 10;
		} else if (conditionsMet == 1) {
			return 6;
		} else if (conditionsMet == 0) {
			return 5;
		} else {
			if (hardnessMet) {
				if (carbonMet) {
					return 9;
				} else {
					return 7;
				}
			} else {
				return 8;
			}
		}
	}
}