package java_problems.beginner;

import java.util.Scanner;

public class PrimalityTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			if (isPrime(sc.nextInt())) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		sc.close();
	}
	
	private static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		} else if (n <= 1 || n % 2 == 0) {
			return false;
		}
		
		long max = (long) Math.sqrt(n);
		for (long i = 3; i <= max; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}