package java_problems.beginner;

import java.util.Scanner;

/*
 * If Give an integer N . Write a program to obtain the sum of the first and
 * last digit of this number.
 * 
 * Input: 
 * The first line contains an integer T, total number of test cases. Then follow
 * T lines, each line contains an integer N.
 * 
 * Output: 
 * Display the sum of first and last digit of N.
 * 
 * Constraints: 
 * 1 <= T <= 1000
 * 1 <= N <= 1000000
 * 
 * Example 
 * Input:
 * 3
 * 1234
 * 124894
 * 242323
 * 
 * Output:
 * 5
 * 5
 * 5
 */
public class FirstAndLastDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCases; i++) {
			String number = sc.nextLine();
			int sum = 0;
			sum += (Integer.parseInt(number.charAt(0) + "")
							+ (Integer.parseInt(number.charAt(number.length() - 1) + "")));
			System.out.println(sum);
		}
		sc.close();
	}
}