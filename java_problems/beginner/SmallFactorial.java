package java_problems.beginner;

import java.util.Scanner;

/*
 * Write a program to find the factorial value of any number entered by the user.
 * 
 * Input:
 * The first line contains an integer T, total number of testcases. 
 * Then follow T lines, each line contains an integer N.
 * 
 * Output:
 *
 * Display the factorial of the given number N.
 * 
 * Constraints:
 * 1 <= T <= 1000
 * 0 <= N <= 20
 * 
 * Example
 * Input:
 * 3
 * 3
 * 4
 * 5
 * 
 * Output:
 * 6
 * 24
 * 120
 */
public class SmallFactorial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			System.out.println(factorial(sc.nextInt()));
		}
		sc.close();
	}
	
	private static int factorial(int n) {
		return (n < 2) ? 1 : n * factorial(n-1);
	}
}