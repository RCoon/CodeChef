package java_problems.beginner;

import java.util.Scanner;

/*
 * You're given an integer N. Write a program to calculate the sum of all the
 * digits of N.
 * 
 * Input: 
 * The first line contains an integer T, total number of testcases. Then follow
 * T lines, each line contains an integer N.
 * 
 * Output: 
 * Calculate the sum of digits of N.
 * 
 * Constraints: 
 * 1 <= T <= 1000
 * 1 <= N <= 100000
 * 
 * Example 
 * Input:
 * 3
 * 12345
 * 31203
 * 2123
 * 
 * Output:
 * 15
 * 9
 * 8
 */
public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			String number = sc.nextLine();
			int sum = 0;
			for (int j = 0; j < number.length(); j++) {
				sum += Integer.parseInt(number.charAt(j) + "");
			}
			System.out.println(sum);
		}
		sc.close();
	}
}