package java_problems.beginner;

import java.util.Scanner;

public class GreedyPuppy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			int numCoins = sc.nextInt();
			int maxPeople = sc.nextInt();
			System.out.println(getMaxRemainder(numCoins, maxPeople));
		}
		sc.close();
	}
	
	private static int getMaxRemainder(int coins, int people) {
		int maxRemainder = Integer.MIN_VALUE;
		for (int i = 1; i <= people; i++) {
			int currentRemainder = coins % i;
			if (currentRemainder > maxRemainder) {
				maxRemainder = currentRemainder;
			}
		}
		return maxRemainder;
	}
}